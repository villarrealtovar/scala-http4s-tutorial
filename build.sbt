ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

val Http4sVersion = "1.0.0-M21"
val CirceVersion = "0.14.0-M5"

lazy val root = (project in file("."))
  .settings(
    name := "http4s-tutorial",
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
      "org.http4s" %% "http4s-circe" % Http4sVersion,
      "org.http4s" %% "http4s-dsl" % Http4sVersion,
      "io.circe" %% "circe-generic" % CirceVersion
    )
  )
