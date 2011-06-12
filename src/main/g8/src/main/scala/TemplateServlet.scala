import org.scalatra._
import com.mongodb.casbah.Imports._

class $servlet_name$ extends ScalatraServlet {

  //setup Casbah connection
  val mongo = MongoConnection("$mongodb_host$",$mongodb_port$)("$mongodb_db$")("$mongodb_collection$")

  get("/test") {
    <h1>Test resource</h1>
  }
  
  post("/msgs") {
    val builder = MongoDBObject.newBuilder
    params.get("body").foreach(msg => {
      builder += ("body" -> msg)
      mongo += builder.result
    })
    redirect("/msgs")
  }
  
  get("/msgs") {
    <body>
      <ul>
        {for (msg <- mongo) yield <li>{msg.get("body")}</li>}
      </ul>
      <form method="POST" action="/msgs">
        <input type="text" name="body"/>
        <input type="submit"/>
      </form>
    </body>  
  }

}
