package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tax.util.BeanObject;
import java.util.List;

public final class transactions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"table-wrapper\" id=\"filing_table\">\n");
      out.write("    <div class=\"table-title\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <h3>Your Previous <b>Filings</b></h3> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-8\">\t\t\t\t\t\t\n");
      out.write("                <a href=\"javascript:;\" onclick=\"showFilingStep1()\" class=\"btn btn-info\"><i class=\"fa fa-plus\"></i> <span>New Filing</span></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--    <div class=\"table-filter\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"show-entries\">\n");
      out.write("                        <span>Show</span>\n");
      out.write("                        <select class=\"form-control\">\n");
      out.write("                            <option>5</option>\n");
      out.write("                            <option>10</option>\n");
      out.write("                            <option>15</option>\n");
      out.write("                            <option>20</option>\n");
      out.write("                        </select>\n");
      out.write("                        <span>entries</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                    <div class=\"filter-group\">\n");
      out.write("                        <label>Name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"filter-group\">\n");
      out.write("                        <label>Location</label>\n");
      out.write("                        <select class=\"form-control\">\n");
      out.write("                            <option>All</option>\n");
      out.write("                            <option>Berlin</option>\n");
      out.write("                            <option>London</option>\n");
      out.write("                            <option>Madrid</option>\n");
      out.write("                            <option>New York</option>\n");
      out.write("                            <option>Paris</option>\t\t\t\t\t\t\t\t\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"filter-group\">\n");
      out.write("                        <label>Status</label>\n");
      out.write("                        <select class=\"form-control\">\n");
      out.write("                            <option>Any</option>\n");
      out.write("                            <option>Delivered</option>\n");
      out.write("                            <option>Shipped</option>\n");
      out.write("                            <option>Pending</option>\n");
      out.write("                            <option>Cancelled</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <span class=\"filter-icon\"><i class=\"fa fa-filter\"></i></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("    <table class=\"table table-striped table-hover\">\n");
      out.write("        ");

            List filings = null;
            if (request.getAttribute("filings") != null) {
                filings = (List) request.getAttribute("filings");
            }
        
      out.write("\n");
      out.write("        ");
if (filings != null && filings.size() > 0) {
      out.write("\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>#</th>\n");
      out.write("                <th>Filing No.</th>\n");
      out.write("                <th>Pan</th>               \n");
      out.write("                <th>Adhaar</th>\n");
      out.write("                <th>Mobile Number</th>\t\t\t\t\t\t\n");
      out.write("                <th>Attachments</th>\t\t\t\t\t\t\n");
      out.write("                <th>Paid Amount</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        ");
} else {
      out.write("        \n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>#</th>\n");
      out.write("                <th>Filing No.</th>\n");
      out.write("                <th>Pan</th>\n");
      out.write("                <th>Adhaar</th>\n");
      out.write("                <th>Mobile Number</th>\t\t\t\t\t\t\n");
      out.write("                <th>Attachments</th>\t\t\t\t\t\t                \n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("            ");
if (filings != null && filings.size() > 0) {
                    BeanObject bean = null;
                    for (int y = 0; y < filings.size(); y++) {
                        bean = (BeanObject) filings.get(y);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print((y + 1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(bean.getStringValue1());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(bean.getStringValue2());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(bean.getStringValue3());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(bean.getStringValue4());
      out.write("</td>\n");
      out.write("                <td>--</td>\n");
      out.write("                <td>");
      out.print(bean.getStringValue6());
      out.write("</td>     \n");
      out.write("                ");
if (bean.getStringValue5() != null && bean.getStringValue5().equalsIgnoreCase("Paid")) {
      out.write("\n");
      out.write("                <td><span class=\"text-success\">Paid</span></td>                \n");
      out.write("                ");
} else if (bean.getStringValue5() != null && bean.getStringValue5().equalsIgnoreCase("Pending")) {
      out.write("\n");
      out.write("                <td><span class=\"text-danger\">Failed</span></td>                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
}
      out.write("            \n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <div class=\"clearfix\">\n");
      out.write("        <!--        <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
      out.write("                <ul class=\"pagination\">\n");
      out.write("                    <li class=\"page-item disabled\"><a href=\"#\">Previous</a></li>\n");
      out.write("                    <li class=\"page-item\"><a href=\"#\" class=\"page-link\">1</a></li>\n");
      out.write("                    <li class=\"page-item\"><a href=\"#\" class=\"page-link\">2</a></li>\n");
      out.write("                    <li class=\"page-item\"><a href=\"#\" class=\"page-link\">3</a></li>\n");
      out.write("                    <li class=\"page-item active\"><a href=\"#\" class=\"page-link\">4</a></li>\n");
      out.write("                    <li class=\"page-item\"><a href=\"#\" class=\"page-link\">5</a></li>\n");
      out.write("                    <li class=\"page-item\"><a href=\"#\" class=\"page-link\">6</a></li>\n");
      out.write("                    <li class=\"page-item\"><a href=\"#\" class=\"page-link\">7</a></li>\n");
      out.write("                    <li class=\"page-item\"><a href=\"#\" class=\"page-link\">Next</a></li>\n");
      out.write("                </ul>-->\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    showStepsTax(0);\n");
      out.write("</script>");
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
