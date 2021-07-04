package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quickitr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_base_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_base_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_html_base_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("        ");
      if (_jspx_meth_html_base_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");

            String header = "../header.jsp";
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, header, out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <script>var ctx = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/dropzone.css\">\n");
      out.write("\n");
      out.write("    <script src=\"../js/dropzone.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"../js/tax-basic.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"../js/login.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"https://apis.google.com/js/platform.js?onload=renderButton\" async defer></script>\n");
      out.write("\n");
      out.write("    <meta name=\"google-signin-client_id\" content=\"940242960621-k3vlncaph159k53tfr19uco13u4dh5td.apps.googleusercontent.com\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <img src=\"../img/1_.jpg\" width=\"100%\" height='150px;'>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div id=\"my-signin2\" style=\"padding:150px 10px 100px 430px;display:none\" class=\"g-signin2\" data-width=\"300\" data-height=\"200\" data-longtitle=\"true\" ></div>\n");
      out.write("            <!--data-onsuccess=\"onSignIn\"-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"tableDiv\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row smpl-step\" style=\"border-bottom: 0; min-width: 500px;display: none\">\n");
      out.write("                <div class=\"col-xs-3 smpl-step-step complete\" style=\"display:none\">\n");
      out.write("                    <div class=\"text-xs-center smpl-step-num\">Step 1</div>\n");
      out.write("                    <div class=\"progress\">\n");
      out.write("                        <div class=\"progress-bar\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"smpl-step-icon\"><i class=\"fa fa-user\" style=\"font-size: 30px; padding-left: 14px; padding-top: 7px; color: black;\"></i></a>\n");
      out.write("                    <div class=\"smpl-step-info text-xs-center\">Basic Details.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-3 smpl-step-step disabled step2-cls\" style=\"cursor: pointer;display:none\">           \n");
      out.write("                    <div class=\"text-xs-center smpl-step-num\">Step 2</div>\n");
      out.write("                    <div class=\"progress\">\n");
      out.write("                        <div class=\"progress-bar\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"smpl-step-icon\"><i class=\"fa fa-upload\" style=\"font-size: 30px; padding-left: 11px; padding-top: 8px; color: black;\"></i></a>\n");
      out.write("                    <div class=\"smpl-step-info text-xs-center\">Upload Documents.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-3 smpl-step-step disabled step3-cls\" style=\"cursor: pointer;display:none\">          \n");
      out.write("                    <div class=\"text-xs-center smpl-step-num\">Step 3</div>\n");
      out.write("                    <div class=\"progress\">\n");
      out.write("                        <div class=\"progress-bar\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"smpl-step-icon\"><i class=\"fa fa-repeat\" style=\"font-size: 30px; padding-left: 12px; padding-top: 9px; color: black;opacity: 0.3;\"></i></a>\n");
      out.write("                    <div class=\"smpl-step-info text-xs-center\">Payment.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-3 smpl-step-step disabled\" style=\"display:none\">           \n");
      out.write("                    <div class=\"text-xs-center smpl-step-num\">Step 4</div>\n");
      out.write("                    <div class=\"progress\">\n");
      out.write("                        <div class=\"progress-bar\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"smpl-step-icon\"><i class=\"fa fa-download\" style=\"font-size: 30px; padding-left: 8px; padding-top: 4px; color: black; opacity: 0.3;\"></i></a>\n");
      out.write("                    <div class=\"smpl-step-info text-xs-center\">Download product after receiving confirmation email.</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\" id=\"first_div\" style=\"display: none\">\n");
      out.write("                <!--                <div class=\"col-md-12 col-md-offset-3 regis_form\" >\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"form-group \">\n");
      out.write("                                            <label>Pan Number</label> \n");
      out.write("                                            <input type=\"text\" maxlength=\"10\" class=\"form-control custom_cs user-pan\" placeholder=\"Enter Pan Number\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group \">\n");
      out.write("                                            <label>Adhaar Number</label> \n");
      out.write("                                            <input type=\"text\" maxlength=\"12\" class=\"form-control custom_cs user-adhaar\" placeholder=\"Enter Adhaar Number\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group \">\n");
      out.write("                                            <label>Mobile Number</label> \n");
      out.write("                                            <input type=\"email\" maxlength=\"10\" class=\"form-control custom_cs user-mobile\" placeholder=\"Enter Mobile Number\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-4 col-md-offset-4 \" style=\"text-align:center\">\n");
      out.write("                                            <button class=\"btn btn-default custom_btn\" >Submit</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>-->\n");
      out.write("\n");
      out.write("                <h2 class=\"mainHd\">Basic Details</h2>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 offset-md-2\">        \n");
      out.write("                            <!--<form id=\"contact-form\" method=\"post\" action=\"\" role=\"form\">-->\n");
      out.write("\n");
      out.write("                            <div class=\"contact-form\">\n");
      out.write("                                <div class=\"messages\"></div>\n");
      out.write("\n");
      out.write("                                <div class=\"controls\">\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"form_name\">Pan Number *</label>\n");
      out.write("                                                <input id=\"form_name\" maxlength=\"10\" type=\"text\" class=\"form-control user-pan\" placeholder=\"Enter Pan Number\" required=\"required\" data-error=\"Pan is required.\">\n");
      out.write("                                                <div class=\"help-block with-errors\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>                                \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"form_email\">Adhaar Number *</label>\n");
      out.write("                                                <input id=\"form_email\" maxlength=\"12\" class=\"form-control user-adhaar\" placeholder=\"Enter Adhaar Number\" required=\"required\" data-error=\"Adhaar is required.\">\n");
      out.write("                                                <div class=\"help-block with-errors\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>                                \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"form_email\">Mobile Number *</label>\n");
      out.write("                                                <input id=\"form_email\" maxlength=\"10\" class=\"form-control user-mobile\" placeholder=\"Enter Mobile Number\" required=\"required\" data-error=\"Mobile is required.\">\n");
      out.write("                                                <div class=\"help-block with-errors\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div> \n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"row\">                                        \n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <button class=\"btn btn-success custom_btn\" >Submit</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--</form>-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\" id=\"second_div\" style=\"text-align: center;display:none;width:1160px\">\n");
      out.write("                <h2 class=\"mainHd\">Attach your documents</h2>\n");
      out.write("\n");
      out.write("                <div class=\"row\" style=\"margin-left: 380px\">  \n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <form id=\"drop_your_files\" \n");
      out.write("                              class=\"dropzone\" \n");
      out.write("                              action=\"/UploadFile.do\"\n");
      out.write("                              enctype=\"multipart/form-data\" \n");
      out.write("                              method=\"post\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("                <!--                <form action=\"/UploadFile.do\" class=\"dropzone\">\n");
      out.write("                                    <div class=\"fallback\">\n");
      out.write("                                        <input name=\"file\" type=\"file\" multiple />\n");
      out.write("                                    </div>\n");
      out.write("                                </form>-->\n");
      out.write("\n");
      out.write("                <!--<div id=\"drop_your_files\" class=\"dropzone\">Upload</div>-->\n");
      out.write("\n");
      out.write("                <div class=\"row\" style=\"width: 1220px;margin-top: 20px;\">                                        \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <button class=\"btn btn-success custom_btn1\">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4 \" style=\"text-align:center;display: none\">\n");
      out.write("                    <a class=\"btn btn-default\" id=\"__make_payment\" href=\"");
      out.print(request.getContextPath());
      out.write("/addDetails.do?Method=loadStep3\">Submit</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\" id=\"third_div\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_html_base_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:base
    org.apache.struts.taglib.html.BaseTag _jspx_th_html_base_0 = (org.apache.struts.taglib.html.BaseTag) _jspx_tagPool_html_base_nobody.get(org.apache.struts.taglib.html.BaseTag.class);
    _jspx_th_html_base_0.setPageContext(_jspx_page_context);
    _jspx_th_html_base_0.setParent(null);
    int _jspx_eval_html_base_0 = _jspx_th_html_base_0.doStartTag();
    if (_jspx_th_html_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_base_nobody.reuse(_jspx_th_html_base_0);
      return true;
    }
    _jspx_tagPool_html_base_nobody.reuse(_jspx_th_html_base_0);
    return false;
  }
}
