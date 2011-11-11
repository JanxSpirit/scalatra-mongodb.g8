import AssemblyKeys._

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

mainClass := Some("JettyLauncher")

seq(webSettings :_*)

seq(assemblySettings: _*)

libraryDependencies ++= Seq(
  "com.mongodb.casbah" % "casbah_2.8.1" % "2.1.5.0",
  "org.scalatra" %% "scalatra" % "2.0.0",
  "org.scalatra" %% "scalatra-specs" % "2.0.0" % "test",
  "org.mortbay.jetty" % "servlet-api" % "3.0.20100224" % "provided",
  "org.eclipse.jetty" % "jetty-server" % "8.0.0.M3" % "container, compile",
  "org.eclipse.jetty" % "jetty-util" % "8.0.0.M3" % "container, compile",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.0.M3" % "container, compile"
  )

resolvers ++= Seq(
  "Sonatype OSS" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Web plugin repo" at "http://siasia.github.com/maven2"
)
