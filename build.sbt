// About
name := "sbt-flyway"
version := "0.1"
description := ""
organization := ""
homepage := Some(url("https://github.com/sh0hei/sbt-flyway"))
licenses := List("MIT" -> url("https://raw.githubusercontent.com/sh0hei/sbt-flyway/main/LICENSE"))
developers := List(Developer("sh0hei", "Shohei Shimomura", "", url("https://github.com/sh0hei")))
scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/sh0hei/sbt-flyway.git"),
    connection = "scm:git:git@github.com:sh0hei/sbt-flyway.git"
  ))

// Build
ThisBuild / crossScalaVersions := Seq("2.12.13", "2.13.5")
ThisBuild / scalaVersion := crossScalaVersions.value.last
ThisBuild / githubWorkflowPublishTargetBranches := List()
ThisBuild / githubWorkflowBuildPreamble ++= List()
ThisBuild / githubWorkflowBuild := Seq()

// Compile options
scalacOptions ++= Seq("-deprecation", "-feature")
scalacOptions += "-target:jvm-1.8"
javacOptions ++= Seq("-source", "8", "-target", "8")

// Dependencies
libraryDependencies ++= Seq(
)

// Misc
ThisBuild / shellPrompt := { state =>
  scala.Console.MAGENTA + Project.extract(state).currentRef.project + "> " + scala.Console.RESET
}
