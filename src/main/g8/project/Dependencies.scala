//
// https://www.scala-sbt.org/1.x/docs/Library-Dependencies.html#Managed+libraryDependencies
//
// https://typelevel.org/cats
// https://typelevel.org/cats-effect/
// https://github.com/monix/minitest
// http://scalacheck.org
//

import sbt._

object Dependencies {
  // Library Versions
  val catsVersion       = "$cats_version$"
  val catsEffectVersion = "$catsEffect_version$"
  val miniTestVersion   = "$miniTest_version$"
  val scalaCheckVersion = "$scalaCheck_version$"
  val http4sVersion     = "$http4s_version$"
  val circeVersion      = "$circe_version$"

  // Libraries
  val catsCore     = "org.typelevel"  %% "cats-core"     % catsVersion
  val catsEffect   = "org.typelevel"  %% "cats-effect"   % catsEffectVersion
  val miniTest     = "io.monix"       %% "minitest"      % miniTestVersion   % "test"
  val miniTestLaws = "io.monix"       %% "minitest-laws" % miniTestVersion   % "test"
  val scalaCheck   = "org.scalacheck" %% "scalacheck"    % scalaCheckVersion % "test"
  val http4sDsl    = "org.http4s"     %% "http4s-dsl"    % http4sVersion
  val http4sBSvr   = "org.http4s"     %% "http4s-blaze-server" % http4sVersion
  val http4sBClt   = "org.http4s"     %% "http4s-blaze-client" % http4sVersion
  val circeGeneric = "io.circe"       %% "circe-generic" % circeVersion
  val circeLiteral = "io.circe"       %% "circe-literal" % circeVersion
}
