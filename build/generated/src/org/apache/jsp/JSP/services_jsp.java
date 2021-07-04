package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_base_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html_lang;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_base_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_html_lang = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html_lang.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      _jspx_th_html_html_0.setLang(true);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <head>\n");
          out.write("\n");
          out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
          out.write("        <title>");
          if (_jspx_meth_bean_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</title>\n");
          out.write("        ");
          if (_jspx_meth_html_base_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("        ");
request.setAttribute("home", "0");
          out.write("\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
          out.write("\n");
          out.write("\n");
          out.write("        </head>\n");
          out.write("\n");
          out.write("        <style>\n");
          out.write("            /*    .card-group h4 {\n");
          out.write("                    font-family: \n");
          out.write("                }*/\n");
          out.write("            .thumbnail{height:330px !important;}\n");
          out.write("            .card-width-cstm{width:40%}\n");
          out.write("            /*    .card-block{-webkit-box-flex:1;\n");
          out.write("                            flex:1 1 auto;\n");
          out.write("                            padding:1.25rem;\n");
          out.write("                            line-height:1.5}\n");
          out.write("                .card-title{margin-bottom:.75rem;}*/\n");
          out.write("            /*.card{border:1px solid rgba(0,0,0,.125);border-radius:.25rem;margin-top:6%;padding:0}*/\n");
          out.write("            .card h4{text-align:left;font-weight:bold;font-size:18px}\n");
          out.write("            .btn-primary1{background:#258fe0;margin-left: 60px}\n");
          out.write("            i{font-size:30px;}\n");
          out.write("        </style>\n");
          out.write("\n");
          out.write("        <body style=\"background-color: white\">\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("            <div class=\"container\">\n");
          out.write("                <div class=\"row\">\n");
          out.write("                    <div class='col-md-12'>\n");
          out.write("                        <br>\n");
          out.write("                        <h2 style='text-align :center;color:#777777 '>Our Services</h2>\n");
          out.write("                        <hr>\n");
          out.write("                        <div class=\"card-group\">\n");
          out.write("                            <div class=\"row\">\n");
          out.write("                                <br>\n");
          out.write("                                <h3 style='text-align :center;color:#777777 '>Compliance Services</h3>\n");
          out.write("                                <br>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"row\">\n");
          out.write("                                <div class='col-md-4'>\n");
          out.write("                                    <div class=\"card\">\n");
          out.write("                                        <div style='width:100%;height:200px; '>\n");
          out.write("                                            <img class=\"card-img-top card-width-cstm\" style='float:none;margin:9% 30%' src=\"");
          out.print(request.getContextPath());
          out.write("/img/s1.png\" alt=\"Card image\" style=\"width:100%\"/>\n");
          out.write("                                    </div>\n");
          out.write("                                    <hr>\n");
          out.write("                                    <div class=\"card-block\">\n");
          out.write("                                        <h4 class=\"card-title\">Startup Compliance Package</h4>\n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <!--<a href=\"#\" class=\"btn btn-primary btn-primary1\">See Profile</a>-->\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card\" style=\"\">\n");
          out.write("                                    <div style='width:100%;height:200px;'>\n");
          out.write("                                        <img class=\"card-img-top card-width-cstm\" src=\"");
          out.print(request.getContextPath());
          out.write("/img/m1.png\" style='float:none;margin: 10% 33%;' width='38%' alt=\"Card image cap\">\n");
          out.write("                                    </div>\n");
          out.write("                                    <hr>    \n");
          out.write("                                    <div class=\"card-block\">\n");
          out.write("                                        <h4 class=\"card-title\">Medium Compliance Package</h4>\n");
          out.write("                                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
          out.write("                                        <!--<a href=\"#\" class=\"btn btn-primary btn-primary1\">Learn More</a>-->\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card\" style=\"\">\n");
          out.write("                                    <div style='width:100%;height:200px;'>\n");
          out.write("                                        <img class=\"card-img-top card-width-cstm\" src=\"");
          out.print(request.getContextPath());
          out.write("/img/a1.png\" style='float:none;margin: 10% 31%' width='39%' alt=\"Card image cap\">\n");
          out.write("                                    </div>\n");
          out.write("                                    <hr>\n");
          out.write("                                    <div class=\"card-block\">\n");
          out.write("                                        <h4 class=\"card-title\">Premium Package</h4>\n");
          out.write("                                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
          out.write("                                        <!--<a href=\"#\" class=\"btn btn-primary\">Learn More</a>-->\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                        <!--                        <div class='col-md-4'>\n");
          out.write("                                                    <div class=\"card\" style=\"\">\n");
          out.write("                                                        <div style='width:100%;height:200px;'>\n");
          out.write("                                                            <img class=\"card-img-top card-width-cstm\" src=\"");
          out.print(request.getContextPath());
          out.write("/img/e1.png\" style='float:none;margin: 9% 30%;' width='39%' alt=\"Card image cap\">\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <hr>\n");
          out.write("                                                        <div class=\"card-block\">\n");
          out.write("                                                            <h4 class=\"card-title\">TDS Returns</h4>\n");
          out.write("                                                            <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>                                      \n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class='col-md-4'>\n");
          out.write("                                                    <div class=\"card\" style=\"\">\n");
          out.write("                                                        <div style='width:100%;height:200px;'>\n");
          out.write("                                                            <img class=\"card-img-top card-width-cstm\" src=\"");
          out.print(request.getContextPath());
          out.write("/img/h1.png\" style='float:none;margin: 10% 32%;' width='38%' alt=\"Card image cap\">\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <hr>\n");
          out.write("                                                        <div class=\"card-block\" style=\"border-top: 1px;border-color: black\">\n");
          out.write("                                                            <h4 class=\"card-title\">Book Keeping</h4>\n");
          out.write("                                                            <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>                                       \n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class='col-md-4'>\n");
          out.write("                                                    <div class=\"card\" style=\"\">\n");
          out.write("                                                        <div style='width:100%;height:200px;'>\n");
          out.write("                                                            <img class=\"card-img-top card-width-cstm\" src=\"");
          out.print(request.getContextPath());
          out.write("/img/su1.png\" style='float:none;margin: 11% 30%;' width='38%' alt=\"Card image cap\">\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <hr>\n");
          out.write("                                                        <div class=\"card-block\">\n");
          out.write("                                                            <h4 class=\"card-title\">ROC Filing</h4>\n");
          out.write("                                                            <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>                                        \n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>-->\n");
          out.write("\n");
          out.write("                    </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                    <div class=\"card-group\">\n");
          out.write("                        <div class=\"row\">\n");
          out.write("                            <br>\n");
          out.write("                            <h3 style='text-align :center;color:#777777 '>Individual Services</h3>\n");
          out.write("                            <br>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"row\">\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">Business Registration / Incorporation</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Select</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">Digital Accounting</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Book</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">GST</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Select</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">TDS Returns</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Book</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">Income Tax</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Select</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            \n");
          out.write("                             <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">Audit</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Select</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">Payroll Services</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Book</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">Hire Staff</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Book</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class='col-md-4'>\n");
          out.write("                                <div class=\"card border-secondary mb-3\" style=\"padding:0px !important\">    \n");
          out.write("                                    <div class=\"card-header\">Business Agreements</div>\n");
          out.write("                                    <div class=\"card-body text-primary\">                                        \n");
          out.write("                                        <p class=\"card-text\">Some example text some example text. John Doe is an architect and engineer engineer</p>\n");
          out.write("                                        <a href=\"#\" class=\"btn btn-primary btn-primary1\">Book</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                </div>\n");
          out.write("            </div><!---row ends-->\n");
          out.write("        </div><!---container ends-->\n");
          out.write("        ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
          out.write("\n");
          out.write("        </body>\n");
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
}
