name := "common-mysql"

version := "1.0"

scalaVersion := "2.11.8"

organization := "com.jxjxgo.common"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.36",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0-M2",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.slick" %% "slick" % "3.2.0-M2",
  "com.typesafe.slick" % "slick-codegen_2.11" % "3.2.0-M2" % "test"
)