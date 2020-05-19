import sbtrelease.ReleasePlugin.autoImport.{ReleaseStep, _}
import sbttapadrelease.TapadReleasePlugin
import sbt.Keys._
import sbt._

object NexusPublish extends AutoPlugin {

  override def requires = Publish && TapadReleasePlugin

  override def projectSettings: Seq[Def.Setting[_]] =
    Seq(
      releaseProcess := Seq[ReleaseStep](
        releaseStepCommandAndRemaining("publish")
      ),
      skip in publish := false,
      publishArtifact := true
    )
}