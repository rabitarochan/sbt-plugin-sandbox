sbtPlugin := true

name := "sbt-plugin-sandbox"

version := "0.1"

organization := "com.rabitarochan"

// remove a comment if enabling sandbox2 plugin.
//seq(sandbox2Settings: _*)

seq(sandbox3Settings: _*)