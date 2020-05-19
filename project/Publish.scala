import sbt.Keys._
import sbt._

object Publish extends AutoPlugin {
  import autoImport._

  override def trigger  = allRequirements
  override def requires = plugins.JvmPlugin

  object autoImport {
    val TapadSnapshots = "Tapad Nexus Snapshots".at("https://nexus.tapad.com/repository/snapshots")
    val TapadReleases  = "Tapad Nexus Releases".at("https://nexus.tapad.com/repository/releases")
  }

  override def buildSettings: Seq[Def.Setting[_]] =
    Seq(
      pomIncludeRepository := { _ => false },
      publishMavenStyle := true,
      publishTo := {
        if (isSnapshot.value) Some(TapadSnapshots)
        else Some(TapadReleases)
      },
      publish := {},
      publishLocal := {},
      skip in publish := true,
      publishArtifact := false
    )
}
