// 
// https://www.scala-sbt.org/1.x/docs/Basic-Def.html
// https://github.com/non/kind-projector
// https://github.com/monix/minitest#usage-in-sbt
// 
lazy val root = (project in file(".")).
settings(
   inThisBuild(List(
      organization := "$package$",
      scalaVersion := "$scala_version$"
   )),
    name := "$name$",
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "$kindProjector_version$"),
    libraryDependencies ++= Seq(
       Dependencies.miniTest,
       Dependencies.miniTestLaws,
       Dependencies.scalaCheck,
       Dependencies.http4sDsl,
       Dependencies.http4sBSvr,
       Dependencies.http4sBClt,
       Dependencies.circeGeneric,
       Dependencies.circeLiteral
    ),
  testFrameworks += new TestFramework("minitest.runner.Framework"),
  trapExit := false
  )
