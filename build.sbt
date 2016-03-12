lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Firebase-Scalajs-Facade"

normalizedName := "firebase-scalajs"

version := "2.4.1"

organization := "hu.thsoft"

scalaVersion := "2.11.7"

jsDependencies += "org.webjars.bower" % "firebase" % "2.4.1" / "firebase.js"

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

val repo = "thsoft/firebase-scalajs"

scmInfo := Some(ScmInfo(
  url(s"https://github.com/$repo"),
  s"scm:git:git@github.com:$repo.git",
  Some(s"scm:git:git@github.com:$repo.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := { _ => false }
