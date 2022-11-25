scalaVersion := "2.13.10"

name := "spl-interpreter"
organization := "com.github.nryabykh"
version := "0.1.0"
crossPaths := false

resolvers += Resolver.jcenterRepo
//libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.5" % "compile"
libraryDependencies += "com.softwaremill.sttp.client3" %% "core" % "3.8.3" % "compile"
//libraryDependencies += "com.typesafe" % "config" % "1.3.4" % "compile"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

//scapegoatVersion in ThisBuild := "1.1.0"

//assemblyShadeRules in assembly := Seq(
//  ShadeRule.rename("com.google.common.**" -> "repackaged.com.google.common.@1").inAll
//)

//assemblyMergeStrategy in assembly := {
//  case PathList("META-INF", _ @ _*) => MergeStrategy.discard
//  case _ => MergeStrategy.first
//}

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")
