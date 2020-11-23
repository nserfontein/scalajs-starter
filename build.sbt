enablePlugins(ScalaJSPlugin)

name := "scalajs-starter"
scalaVersion := "2.13.1"
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

//scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")
