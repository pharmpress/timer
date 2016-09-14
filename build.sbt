name := "timer"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(

  "info.cukes" %% "cucumber-scala" % "1.2.5" % "test",
  "info.cukes" % "cucumber-junit" % "1.2.5" % "test",
  "info.cukes" % "cucumber-java" % "1.2.5" % "test",
//  "org.scalactic" %% "scalactic" % "3.0.0",
//  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "joda-time" % "joda-time" % "2.9.4"
)