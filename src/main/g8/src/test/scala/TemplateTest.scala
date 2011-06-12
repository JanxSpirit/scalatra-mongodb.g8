import org.scalatra.test.specs._

object TemplateTest extends ScalatraSpecification {
  addServlet(classOf[$servlet_name$], "/*")
  
  "Calling GET $servlet_name$" should {
    "successfully return the /test resource" in {
      get("/test") {
        status mustEqual(200)
	body mustEqual("<h1>Test resource</h1>")
      }
    }
    "fail to return the /doesntexist resource" in {
      get("/doesntexist") {
        status mustEqual(404)
      }
    }
  }
}
