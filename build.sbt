name := "finch"

version := "0.0.1"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-http" % "6.14.0",
  "com.twitter" %% "finagle-redis" % "6.14.0"
)

