package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeStruts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notPresent_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_base_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html_lang;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notPresent_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_base_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_html_lang = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_logic_notPresent_scope_name.release();
    _jspx_tagPool_html_base_nobody.release();
    _jspx_tagPool_html_html_lang.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html_lang.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      _jspx_th_html_html_0.setLang(true);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <head>\r\n");
          out.write("\r\n");
          out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
          out.write("        <title>");
          if (_jspx_meth_bean_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</title>\r\n");
          out.write("        ");
          if (_jspx_meth_html_base_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
request.setAttribute("home", "1");
          out.write("\r\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
          out.write("\r\n");
          out.write("\r\n");
          out.write("        </head>\r\n");
          out.write("        <body style=\"background-color: white\">\r\n");
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_logic_notPresent_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "JSP/corousel.jsp", out, false);
          out.write("\r\n");
          out.write("\r\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "JSP/services.jsp", out, false);
          out.write("\r\n");
          out.write("        \r\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
          out.write("\r\n");
          out.write("\r\n");
          out.write("        </body>\r\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_html_lang.reuse(_jspx_th_html_html_0);
        return;
      }
      _jspx_tagPool_html_html_lang.reuse(_jspx_th_html_html_0);
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_0.setKey("welcome.title");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
      return true;
    }
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_html_base_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:base
    org.apache.struts.taglib.html.BaseTag _jspx_th_html_base_0 = (org.apache.struts.taglib.html.BaseTag) _jspx_tagPool_html_base_nobody.get(org.apache.struts.taglib.html.BaseTag.class);
    _jspx_th_html_base_0.setPageContext(_jspx_page_context);
    _jspx_th_html_base_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    int _jspx_eval_html_base_0 = _jspx_th_html_base_0.doStartTag();
    if (_jspx_th_html_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_base_nobody.reuse(_jspx_th_html_base_0);
      return true;
    }
    _jspx_tagPool_html_base_nobody.reuse(_jspx_th_html_base_0);
    return false;
  }

  private boolean _jspx_meth_logic_notPresent_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_0 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_scope_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_notPresent_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_notPresent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_logic_notPresent_0.setName("org.apache.struts.action.MESSAGE");
    _jspx_th_logic_notPresent_0.setScope("application");
    int _jspx_eval_logic_notPresent_0 = _jspx_th_logic_notPresent_0.doStartTag();
    if (_jspx_eval_logic_notPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div  style=\"color: red\">\r\n");
        out.write("                ERROR:  Application resources not loaded -- check servlet container\r\n");
        out.write("                logs for error messages.\r\n");
        out.write("            </div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_logic_notPresent_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notPresent_scope_name.reuse(_jspx_th_logic_notPresent_0);
      return true;
    }
    _jspx_tagPool_logic_notPresent_scope_name.reuse(_jspx_th_logic_notPresent_0);
    return false;
  }
}
