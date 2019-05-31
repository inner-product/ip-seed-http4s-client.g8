// https://www.scala-sbt.org/1.x/docs/Using-Plugins.html
//
// sbt-coursier (dependency resolver / fetcher)
// https://github.com/coursier/coursier#sbt-plugin
// 
// sbt-updates (SBT plugin that can check Maven and Ivy repositories for dependency updates)
// https://github.com/rtimush/sbt-updates
//
// sbt-tpolecat (tpolecat's scalac recommended options and sbt-partial-unification)
// https://github.com/DavidGregory084/sbt-tpolecat 
// https://github.com/DavidGregory084/sbt-tpolecat#scalac-options-for-the-enlightened
//
// https://scalacenter.github.io/scalafix/
//
// https://scalameta.org/scalafmt/
// 
//
addSbtPlugin("io.get-coursier"           % "sbt-coursier" % "1.0.3")
addSbtPlugin("com.timushev.sbt"          % "sbt-updates"  % "0.4.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.5")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix" % "0.9.4")
addSbtPlugin("com.geirsson"              % "sbt-scalafmt" % "1.5.1")
