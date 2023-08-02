import Dependencies.*

// give the user a nice default project!
ThisBuild / organization := "$organisation$"
ThisBuild / version := "$version$"

lazy val root = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(BuildHelper.stdSettings)
  .settings(
    name := "$name$",
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework"),
    libraryDependencies ++= Seq(`zio-test`, `zio-test-sbt`, `zio-http`),
  )
  .settings(
    Docker / version          := version.value,
    Compile / run / mainClass := Option("$package$.$name;format="Camel"$"),
  )
