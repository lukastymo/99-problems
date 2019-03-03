lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.lukastymo.problems",
      scalaVersion := "2.12.8",
      version := "0.1.0-SNAPSHOT"
    )),
  name := "99 Problems - Scala",
  libraryDependencies ++= Seq(
    "org.scalatest"  %% "scalatest"   % "3.0.5" % Test,
    "org.typelevel"  %% "cats-core"   % "1.6.0",
    "org.typelevel"  %% "cats-effect" % "1.0.0",
    "io.monix"       %% "monix"       % "3.0.0-RC2",
    "org.scalanlp"   %% "breeze"      % "0.13.2",
    "org.scalacheck" %% "scalacheck"  % "1.14.0" % Test,
    "eu.timepit"     %% "refined"     % "0.9.4"
  ),
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding",
    "UTF-8",
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:existentials",
    "-unchecked",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture",
    "-Ypartial-unification"
  )
)

scalacOptions += "-Ypartial-unification" // 2.11.9+
