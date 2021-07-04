package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!--<div class=\"container\">\n");
      out.write("    <div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>-->\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row mt-4\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <h4 class=\"title\">Our Company</h4>\n");
      out.write("                <span class=\"acount-icon\">          \n");
      out.write("                    <a href=\":;\"><i class=\"fa fa-heart\" aria-hidden=\"true\"></i> About Us</a>\n");
      out.write("                    <!--<a href=\"#\"><i class=\"fa fa-cart-plus\" aria-hidden=\"true\"></i> Sitemap</a>-->\n");
      out.write("                    <a href=\":;\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i> Contact Us</a>\n");
      out.write("                    <!--<a href=\"#\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i> Language</a>-->        \n");
      out.write("                    <!--<a  [routerLink]=\"['/imgdetails/', 'gallery1']\"><i class=\"fa fa-image\" aria-hidden=\"true\"></i> Gallery</a>-->\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <h4 class=\"title\">Center 1</h4>\n");
      out.write("                <ul class=\"f-address\" style=\"margin-left: 2px !important;margin-top:15px;\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-1\"><i class=\"fa fa-map-marker\"></i></div>\n");
      out.write("                            <div class=\"col-10\">\n");
      out.write("                                <h6 class=\"font-weight-bold mb-0\">Address:</h6>\n");
      out.write("                                <p>Shop No 1, D1, Plot No 207, Shivneri Lane, Gorai 2, Near Datta Mandir, Borivali West, Mumbai 400092</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-1\"><i class=\"fa fa-volume-control-phone\"></i></div>\n");
      out.write("                            <div class=\"col-10\">\n");
      out.write("                                <h6 class=\"font-weight-bold mb-0\">Phone:</h6>\n");
      out.write("                                <p><a href=\"#\">+91-900-489-0782</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <h4 class=\"title\">Center 2</h4>\n");
      out.write("                <ul class=\"f-address\" style=\"margin-left: 2px !important;margin-top:15px;\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-1\"><i class=\"fa fa-map-marker\"></i></div>\n");
      out.write("                            <div class=\"col-10\">\n");
      out.write("                                <h6 class=\"font-weight-bold mb-0\">Address:</h6>\n");
      out.write("                                <p>Shop No 3, Mukta Baug, Jain Hospital, Malad Station Road, Near Malad Subway, Malad West, Mumbai 400092</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-1\"><i class=\"fa fa-volume-control-phone\"></i></div>\n");
      out.write("                            <div class=\"col-10\">\n");
      out.write("                                <h6 class=\"font-weight-bold mb-0\">Phone:</h6>\n");
      out.write("                                <p><a href=\"#\">+91-730-391-7888</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <h4 class=\"title\">Connect With Us</h4>\n");
      out.write("                <ul class=\"social-pet mt-4 ml-2\">\n");
      out.write("                    <li><a style=\"cursor:pointer\"  title=\"facebook\"><i class=\"fa fa-facebook\"></i></a></li>                    \n");
      out.write("                    <!--<li><a href=\"#\" title=\"google-plus\"><i class=\"fa fa-google-plus\"></i></a></li>-->\n");
      out.write("                    <li><a style=\"cursor:pointer\" title=\"instagram\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                    <!--<li><a href=\"#\" title=\"twitter\"><i class=\"fa fa-twitter\"></i></a></li>-->\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"mt-4 f-address\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-1 mt-1 ml-2\"><i class=\"fa fa-envelope\"></i></div>\n");
      out.write("                            <div class=\"col-10\">\n");
      out.write("                                <p>&nbsp;support@taxfilingkaro.com</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!--<ul class=\"mt-4 f-address\"><li><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></li></ul>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div class=\"row text-center\"> © 2020. Powered By &nbsp;<a style=\"cursor:pointer\" title=\"Promo Vision\"> PromoVision</a></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</footer>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
