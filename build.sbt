name := """spark-twitter-stream-example"""

version := "1.0.0"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming" % "3.0.1",
  "org.apache.bahir" %% "spark-streaming-twitter" % "3.0.1"
)
