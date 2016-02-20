name := "jpproblems"

version := "0.0.1"

scalaVersion := "2.11.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.12" % "test"

scalacOptions in Compile ++= Seq("-encoding",
  "UTF-8",
  "-target:jvm-1.7",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:_")
