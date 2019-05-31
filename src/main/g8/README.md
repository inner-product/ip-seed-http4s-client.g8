# $name$

Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu
fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
culpa qui officia deserunt mollit anim id est laborum.

## Project structure

The basic project directory [tree](file://tree.html).

### [build.sbt](file://build.sbt)

- [Basic def](https://www.scala-sbt.org/1.x/docs/Basic-Def.html)
- [kind-projector](https://github.com/non/kind-projector)
- [minitest](https://github.com/monix/minitest#usage-in-sbt)

### [project/Dependencies.scala](file://project/Dependencies.scala)

[sbt Dependencies](https://www.scala-sbt.org/1.x/docs/Library-Dependencies.html#Managed+libraryDependencies)

- [cats](https://typelevel.org/cats)
- [cats-effect](https://typelevel.org/cats-effect/)
- [minitest](https://github.com/monix/minitest)
- [scalacheck](http://scalacheck.org)

### [project/plugins.sbt](file://project/plugins.sbt)

[Using plugins in sbt](https://www.scala-sbt.org/1.x/docs/Using-Plugins.html)

#### sbt-coursier 

dependency resolver / fetcher

[coursier sbt plugin](https://github.com/coursier/coursier#sbt-plugin)

#### sbt-updates

SBT plugin that can check Maven and Ivy repositories for dependency updates.

[sbt updates plugin](https://github.com/rtimush/sbt-updates)

#### sbt-tpolecat 

tpolecat's scalac recommended options and sbt-partial-unification.

[Explanation for what sbt-tpolecat is](https://github.com/DavidGregory084/sbt-tpolecat#scalac-options-for-the-enlightened)
[General information about sbt-tpolecat](https://github.com/DavidGregory084/sbt-tpolecat) 

#### [scalafix](https://scalacenter.github.io/scalafix/)

Rewrite and linting tool for Scala.

See
[installation](https://scalacenter.github.io/scalafix/docs/users/installation)
for verification and basic commands.

Install the command line interface like shown [here](https://scalacenter.github.io/scalafix/docs/users/installation#scalafix-cli).

```sh
coursier bootstrap ch.epfl.scala:scalafix-cli_2.12.4:0.5.10 -f --main scalafix.cli.Cli -o scalafix
./scalafix --help
```

Using [scalazzi ruleset](https://github.com/scalaz/scalazzi). The rules are defined in [.scalafix.conf](file://.scalafix.conf).


## [.gitignore](file://.gitignore)

A `.gitingore` using [gitignore.io](https://www.gitignore.io/)


