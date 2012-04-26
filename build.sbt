name := "bootcompiler"

version := "2.0-SNAPSHOT"

scalaVersion := "2.9.1"

scalacOptions += "-deprecation"

libraryDependencies += "com.github.scopt" %% "scopt" % "2.0.0"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

// Work around a bug that prevents generating documentation
unmanagedClasspath in Compile +=
    Attributed.blank(new java.io.File("doesnotexist"))
