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
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "provided, jetty",
  "org.mortbay.jetty" % "jetty-servlet-tester" % "6.1.22" % "provided-> default",
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default"
)

resolvers ++= Seq(
  "Sonatype OSS" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Web plugin repo" at "http://siasia.github.com/maven2"
)

