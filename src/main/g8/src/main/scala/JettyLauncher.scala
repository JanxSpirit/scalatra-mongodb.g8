import org.mortbay.jetty.Server
import org.mortbay.jetty.servlet.{Context, ServletHolder}

object JettyLauncher {
   def main(args: Array[String]) {
     val port = try {
       args(0).toInt
     } catch {
       case _ => 8080
     }
     println("Starting on port %s...".format(port))
     val server = new Server(port)
     val root   = new Context(server, "/", Context.SESSIONS)
     root.addServlet(new ServletHolder(new $servlet_name$), "/*")
     server.start()
     server.join()
   }
}
