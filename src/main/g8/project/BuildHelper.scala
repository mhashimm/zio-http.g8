import sbt.*
import sbt.Keys.*

object BuildHelper {
  val ScalaVersion = "$scalaVersion$"

  def commonSettings(scalaVersion: String) = CrossVersion.partialVersion(scalaVersion) match {
    case Some((3, _))                  => Seq.empty
    case Some((2, 12)) | Some((2, 13)) => Seq("-Ywarn-unused:params")
    case _                             => Seq.empty
  }
  def stdSettings                          = Seq(
    ThisBuild / fork              := true,
    ThisBuild / scalaVersion      := ScalaVersion,
    ThisBuild / scalacOptions     := commonSettings(scalaVersion.value),
    ThisBuild / semanticdbEnabled := true,
    ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
  )
}
