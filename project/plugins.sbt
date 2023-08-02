addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8"   % "0.16.2")

libraryDependencies ++=
  Seq(
    "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value,
  )
