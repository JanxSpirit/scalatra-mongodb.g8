import org.scalatra.test.specs2._

object TemplateTest extends ScalatraSpec { def is =
  "GET /test on MongoDBServlet"            ^
    "return status 200"                    !getTestResource^
  "GET /theFuture on MongoDBServlet"       ^
    "return staus 200"                     !getFutureResource^
  "GET /doesntexist on MongoDBServlet"     ^
    "return status 404"                    !getDoesntExistResource^
				   end

  addServlet(classOf[MongoDBServlet], "/*")

  def getTestResource = get("/test") {
    status must_== 200
    body mustEqual("<h1>Test resource</h1>")
  }

  def getFutureResource = get("/theFuture") {
    status must_== 200
  } 

  def getDoesntExistResource = get("/doesntexist") {
    status must_== 404
  }
}
