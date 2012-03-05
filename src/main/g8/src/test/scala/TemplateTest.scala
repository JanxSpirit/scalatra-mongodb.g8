import org.scalatra.test.specs2._

object TemplateTest extends ScalatraSpec { def is =
  "GET /test on $servlet_name$"            ^
    "return status 200"                    !getTestResource^
  "GET /doesntexist on $servlet_name$"     ^
    "return status 404"                    !getDoesntExistResource^
				   end

  addServlet(classOf[$servlet_name$], "/*")

  def getTestResource = get("/test") {
    status must_== 200
    body mustEqual("<h1>Test resource</h1>")
  }

  def getDoesntExistResource = get("/doesntexist") {
    status must_==404
  }
}
