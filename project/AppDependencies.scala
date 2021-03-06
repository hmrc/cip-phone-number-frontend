import play.core.PlayVersion
import play.sbt.PlayImport._
import sbt.Keys.libraryDependencies
import sbt._

object AppDependencies {
  val hmrcBootstrapVersion = "5.23.2-RC2"

  val compile = Seq(
    "uk.gov.hmrc"             %% "bootstrap-frontend-play-28" % hmrcBootstrapVersion,
    "uk.gov.hmrc"             %% "play-frontend-hmrc"         % "3.14.0-play-28"
  )

  val test = Seq(
    "uk.gov.hmrc"            %% "bootstrap-test-play-28"   % hmrcBootstrapVersion % "test, it",
    "uk.gov.hmrc.mongo"      %% "hmrc-mongo-test-play-28"  % "0.64.0"             % IntegrationTest,
    "org.mockito"            %% "mockito-scala"            % "1.17.7"             % Test
  )
}
