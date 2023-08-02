package $package$

import zio.*
import zio.http.*


object $name;format="Camel"$ extends ZIOAppDefault:
  val app: HttpApp[Any, Nothing] = Http.collect[Request]:
    case Method.GET -> !! / "text" => Response.text("Hello World!")
    case Method.GET -> !! / "json" => Response.json("""{"greetings": "Hello World!"}""")
    case _ => ZIO.succeed(Response.status(Status.NotFound))
  

  // Run it like any simple app
  override def run = 
    for
      _ <- Console.printLine(s"Starting server at http://localhost:8080")
      _ <- Server.serve(app).provide(Server.default)
    yield ()
