import AssemblyKeys._

organization := "com.pongr"

name := "spray-elb-test"

version := "1.0"

scalaVersion := "2.9.1"

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases",
  "Spray" at "http://repo.spray.io"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % Version.akka,
  "com.typesafe.akka" % "akka-slf4j" % Version.akka,
  "io.spray" % "spray-can" % Version.spray,
  "io.spray" % "spray-routing" % Version.spray,
  "ch.qos.logback" % "logback-classic" % "1.0.9"
)

scalacOptions += "-Ydependent-method-types" //http://spray.io/documentation/spray-routing/installation/

seq(Revolver.settings: _*)

assemblySettings
