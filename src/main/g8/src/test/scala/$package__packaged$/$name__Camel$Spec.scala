package $package$

import zio.test.*
import zio.test.Assertion.*
import zio.http.*

object $name;format="Camel"$Spec extends ZIOSpecDefault:
  override def spec = suite("""$name;format="Camel"$Spec""")(
    test("200 ok") {
      val request = Request.get(URL(Root / "json"))
      for
        response <- $name;format="Camel"$.app.runZIO(request)
      yield assertTrue(response.status == Status.Ok)      
    },
    test("404 Notfound") {
      val request = Request.get(URL(Root))
      for
        response <- $name;format="Camel"$.app.runZIO(request)
      yield assertTrue(response.status == Status.NotFound)      
    }
)
