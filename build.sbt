val dottyVersion = "3.0.0-M3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "learning-scala-3",
    version := "0.1.0",
    organization := "techmonad.com",
    organizationName := "Techmonad",
    useScala3doc := true,
    scalaVersion := dottyVersion,
    libraryDependencies += "com.github.sbt" % "junit-interface" % "0.13.3" % "test"
  )

addCommandAlias("fmt", ";scalafmtSbt;scalafmt;test:scalafmt")
