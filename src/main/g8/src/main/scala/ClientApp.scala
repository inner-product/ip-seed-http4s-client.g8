package $package$

import cats.effect.{ Effect, IO }
import fs2.{Stream, StreamApp, Sink}
import fs2.StreamApp.ExitCode
import cats.implicits._
import org.http4s.client.blaze.Http1Client

object ClientAppIO extends ClientApp[IO] //bind F to IO

class ClientApp[F[_]: Effect] extends StreamApp[F] {
  val catfacts = "http://www.catfact.info/api/v1/facts.json"

  override def stream(args: List[String], requestShutdown: F[Unit]): fs2.Stream[F, ExitCode] =
    Http1Client
      .stream[F]() //Get a stream
      .evalMap(_.expect[String](catfacts))
      .head //terminate stream after one result
      .to(Sink.showLinesStdOut)
      .flatMap(_ => Stream(ExitCode.Success))
}
