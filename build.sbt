val dottyVersion = "0.16.0-RC3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "learning-scala-3",
    version := "0.1.0",
    organization := "techmonad.com",
    organizationName := "Techmonad",

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
