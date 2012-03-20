import org.eclipse.jetty.server.nio.SelectChannelConnector
import org.eclipse.jetty.server.{ Server }
import org.eclipse.jetty.server.handler.ContextHandlerCollection
import org.eclipse.jetty.webapp.WebAppContext
import org.eclipse.jetty.servlet.{ DefaultServlet, ServletContextHandler, ServletHolder }

object JettyLauncher {
   def main(args: Array[String]) {
     val port = try {
       args(0).toInt
     } catch {
       case _ => 8080
     }
     println("Starting on port %s...".format(port))

     val server: Server = new Server

     server setGracefulShutdown 5000
     server setSendServerVersion false
     server setSendDateHeader true
     server setStopAtShutdown true

     val connector = new SelectChannelConnector
     connector setPort port
     connector setMaxIdleTime 90000
     server addConnector connector

    val webapp = "src/main/webapp"
    val webApp = new WebAppContext
    webApp setContextPath "/"
    webApp setResourceBase webapp
    webApp setDescriptor (webapp+"/WEB-INF/web.xml");

    server setHandler webApp

    server.start()
   }
}
