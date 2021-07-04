package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tax.form.SessionForm;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_nobody.release();
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

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    SessionForm form = (SessionForm) request.getSession(false).getAttribute("sessionForm");

      out.write('\r');
      out.write('\n');
if (request.getAttribute("home") != null && request.getAttribute("home").equals("1")) {
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/footer.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/transactions.css\">\r\n");
} else {
      out.write("\r\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\">-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/footer.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/transactions.css\">\r\n");
}
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-sm navbar-light navbar-custom\" style=\"padding-left:0px;padding-right:0px;padding-top: 0px !important\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" onmouseover=\"style='float:left;font-size: x-large;background-color: transparent;color:black !important'\" style=\"float:left;font-size: x-large;\" href=\"#\">\r\n");
      out.write("            ");
if (request.getAttribute("home") != null && request.getAttribute("home").equals("1")) {
      out.write("\r\n");
      out.write("            <img src=\"assets/favicon.jpg\" alt=\"\" height=\"32\" width=\"32\">\r\n");
      out.write("            ");
} else {
      out.write("\r\n");
      out.write("            <img src=\"../assets/favicon.jpg\" alt=\"\" height=\"32\" width=\"32\">\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            <span class=\"ml-2\">");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\">\r\n");
      out.write("                <span class=\"fa fa-fw fa-home\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\">\r\n");
      out.write("                <span class=\"fa fa-bars\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse flex-column align-items-start ml-lg-2 ml-0 mr-3\" style=\"font-weight:700\"  id=\"navbarCollapse\">\r\n");
      out.write("                <ul class=\"navbar-nav  ml-auto\">\r\n");
      out.write("                    <li class=\"nav-item\"><a href=\"javascript:;\"  class=\"nav-link\">+91-782-741-4928 <span style=\"font-weight:bold\">  | </span></a></li>\r\n");
      out.write("                    <li class=\"nav-item\" >\r\n");
      out.write("                        <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/link.do?Method=home\"> Home</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" >About</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" >Contact Us </a>\r\n");
      out.write("                </li>\t\t\t\r\n");
      out.write("                ");
if (form != null && form.getUserId() > 0) {
      out.write("\r\n");
      out.write("                <li class=\"nav-item\" id=\"logBtnErp\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/link.do?Method=login\"> Logout</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");
} else {
      out.write("\r\n");
      out.write("                <li class=\"nav-item\" id=\"logBtnErp\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/link.do?Method=login\"> Login</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("<!--                <li class=\"nav-item\">\t\t\t\t    \r\n");
      out.write("                    <span style=\"font-size:30px;cursor:pointer\">\r\n");
      out.write("                        <i class=\"fa fa-bars nav-link\">\r\n");
      out.write("                        </i>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>-->\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"navbar-nav flex-row mb-md-1 mt-md-0 mb-3 mt-2  ml-auto\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a style=\"cursor:pointer\"  class=\"nav-link py-0 pr-1\" ><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a style=\"cursor:pointer\" class=\"nav-link py-0 pr-1\" ><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                </li>\r\n");
      out.write("<!--                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link py-0 pr-3\" href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                </li>-->\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</nav>");
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

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setKey("welcome.title");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }
}
