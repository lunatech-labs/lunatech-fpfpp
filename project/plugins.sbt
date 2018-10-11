addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.8-0.6")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.25")

// allow to extends dependency scope to npm
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.13.1")
addSbtPlugin("ch.epfl.scala" % "sbt-web-scalajs-bundler" % "0.13.1")

// allow to mix jvm and js project
addSbtPlugin("org.portable-scala"      % "sbt-scalajs-crossproject" % "0.6.0")

// allow to trigger restart automatically when we have a change in modules
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")
