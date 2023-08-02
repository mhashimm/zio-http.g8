import sbt.*

object Dependencies{
  val ZioVersion   = "$zioTestVersion$"
  val ZioHTTPVersion = "$ziohttpVersion$"

  val `zio-http`      = "dev.zio" %% "zio-http" % ZioHTTPVersion
  val `zio-http-test` = "dev.zio" %% "zio-http-test" % ZioHTTPVersion % Test

  val `zio-test`     = "dev.zio" %% "zio-test"     % ZioVersion % Test
  val `zio-test-sbt` = "dev.zio" %% "zio-test-sbt" % ZioVersion % Test
}
