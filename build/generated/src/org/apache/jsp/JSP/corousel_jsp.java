package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class corousel_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ul class=\"carousel-indicators\">\n");
      out.write("        <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("        <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <!-- The slideshow -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("        <div class=\"carousel-item active\">\n");
      out.write("\n");
      out.write("            <img src=\"img/5_.jpg\"  alt = \" #\"  width=\"1380px\">\n");
      out.write("            <div class=\"carousel_text hidden-xs\">\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("\n");
      out.write("                    <h2>Welcome to <b>");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("</b></h2>\n");
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <div style=\"margin-top:15px\">                            \n");
      out.write("                            <a href=\"");
      out.print(request.getContextPath());
      out.write("/services.do?Method=services\" class=\"btn btn-primary\" style=\"margin:10px\">Services</a>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" style=\"margin:10px\">Packages</button>\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/link.do?Method=quickITR\" class=\"btn btn-primary\" style=\"margin:10px\">Virtual CFO</a>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" style=\"margin:10px\">Request Callback</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--        <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"img/1_.jpg\" alt = \"#\" width=\"1380px\">            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"img/2_.jpg\" alt = \"#\" width=\"1380px\">\n");
      out.write("                </div>-->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("        <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("        <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("</div>");
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
