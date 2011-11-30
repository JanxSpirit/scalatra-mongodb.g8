import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.{ServletContextHandler, ServletHolder}

object JettyLauncher {
   def main(args: Array[String]) {
     val port = try {
       args(0).toInt
     } catch {
       case _ => 8080
     }
     println("Starting on port %s...".format(port))
     val server = new Server(port)
     val context = new ServletContextHandler(ServletContextHandler.SESSIONS)
     context.setContextPath("/")
     server.setHandler(context)     
     context.addServlet(new ServletHolder(new $servlet_name$), "/*")
     server.start()
     server.join()
   }
}
