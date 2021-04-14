package fix

import org.http4s.jetty.server._
import org.http4s.tomcat.server._

object RewritePackagesTests {
  val tomcatBuilder = TomcatBuilder
  val tomcatBuilderQualified = org.http4s.tomcat.server.TomcatBuilder

  val jettyBuilder = JettyBuilder
  val jettyBuilderQualified = org.http4s.jetty.server.JettyBuilder
}
