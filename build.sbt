name := "sample-spark-scala-project"
version := "1.0"
scalaVersion := "2.12.13"

val sparkVersion = "2.4.0"

libraryDependencies += 
    "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += 
    "org.apache.spark" %% "spark-sql" % sparkVersion
libraryDependencies += 
    "org.scalatest" %% "scalatest" % "3.2.9" % Test

/*
// you can always use this dependency if you are 
// going to use only funsuite
libraryDependencies += 
    "org.scalatest" %% "scalatest-funsuite" % "3.2.11" % "test"
*/