<%-- 
    Document   : quickitr
    Created on : 22 Mar, 2020, 12:59:57 PM
    Author     : PromoVision
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
        <%
            String header = "../header.jsp";
        %>
        <jsp:include page="<%=header%>"></jsp:include>
        </head>
        <script>var ctx = "${pageContext.request.contextPath}"</script>


    <link rel="stylesheet" href="../css/dropzone.css">

    <script src="../js/dropzone.js" type="text/javascript"></script>
    <script src="../js/tax-basic.js" type="text/javascript"></script>
    <script src="../js/login.js" type="text/javascript"></script>

    <script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>

    <meta name="google-signin-client_id" content="940242960621-k3vlncaph159k53tfr19uco13u4dh5td.apps.googleusercontent.com">





    <body>

        <img src="../img/1_.jpg" width="100%" height='150px;'>

        <div class="container">

            <div id="my-signin2" style="padding:150px 10px 100px 430px;display:none" class="g-signin2" data-width="300" data-height="200" data-longtitle="true" ></div>
            <!--data-onsuccess="onSignIn"-->


            <div id="tableDiv">

            </div>


            <div class="row smpl-step" style="border-bottom: 0; min-width: 500px;display: none">
                <div class="col-xs-3 smpl-step-step complete" style="display:none">
                    <div class="text-xs-center smpl-step-num">Step 1</div>
                    <div class="progress">
                        <div class="progress-bar"></div>
                    </div>
                    <a class="smpl-step-icon"><i class="fa fa-user" style="font-size: 30px; padding-left: 14px; padding-top: 7px; color: black;"></i></a>
                    <div class="smpl-step-info text-xs-center">Basic Details.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                </div>

                <div class="col-xs-3 smpl-step-step disabled step2-cls" style="cursor: pointer;display:none">           
                    <div class="text-xs-center smpl-step-num">Step 2</div>
                    <div class="progress">
                        <div class="progress-bar"></div>
                    </div>
                    <a class="smpl-step-icon"><i class="fa fa-upload" style="font-size: 30px; padding-left: 11px; padding-top: 8px; color: black;"></i></a>
                    <div class="smpl-step-info text-xs-center">Upload Documents.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                </div>
                <div class="col-xs-3 smpl-step-step disabled step3-cls" style="cursor: pointer;display:none">          
                    <div class="text-xs-center smpl-step-num">Step 3</div>
                    <div class="progress">
                        <div class="progress-bar"></div>
                    </div>
                    <a class="smpl-step-icon"><i class="fa fa-repeat" style="font-size: 30px; padding-left: 12px; padding-top: 9px; color: black;opacity: 0.3;"></i></a>
                    <div class="smpl-step-info text-xs-center">Payment.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
                </div>
                <div class="col-xs-3 smpl-step-step disabled" style="display:none">           
                    <div class="text-xs-center smpl-step-num">Step 4</div>
                    <div class="progress">
                        <div class="progress-bar"></div>
                    </div>
                    <a class="smpl-step-icon"><i class="fa fa-download" style="font-size: 30px; padding-left: 8px; padding-top: 4px; color: black; opacity: 0.3;"></i></a>
                    <div class="smpl-step-info text-xs-center">Download product after receiving confirmation email.</div>
                </div>
            </div>


            <div class="row" id="first_div" style="display: none">
                <!--                <div class="col-md-12 col-md-offset-3 regis_form" >
                                    <div>
                                        <div class="form-group ">
                                            <label>Pan Number</label> 
                                            <input type="text" maxlength="10" class="form-control custom_cs user-pan" placeholder="Enter Pan Number">
                                        </div>
                                        <div class="form-group ">
                                            <label>Adhaar Number</label> 
                                            <input type="text" maxlength="12" class="form-control custom_cs user-adhaar" placeholder="Enter Adhaar Number">
                                        </div>
                                        <div class="form-group ">
                                            <label>Mobile Number</label> 
                                            <input type="email" maxlength="10" class="form-control custom_cs user-mobile" placeholder="Enter Mobile Number">
                                        </div>
                                        <div class="col-md-4 col-md-offset-4 " style="text-align:center">
                                            <button class="btn btn-default custom_btn" >Submit</button>
                                        </div>
                                    </div>
                                </div>-->

                <h2 class="mainHd">Basic Details</h2>
                <div class="clearfix"></div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 offset-md-2">        
                            <!--<form id="contact-form" method="post" action="" role="form">-->

                            <div class="contact-form">
                                <div class="messages"></div>

                                <div class="controls">

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="form_name">Pan Number *</label>
                                                <input id="form_name" maxlength="10" type="text" class="form-control user-pan" placeholder="Enter Pan Number" required="required" data-error="Pan is required.">
                                                <div class="help-block with-errors"></div>
                                            </div>
                                        </div>                                
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="form_email">Adhaar Number *</label>
                                                <input id="form_email" maxlength="12" class="form-control user-adhaar" placeholder="Enter Adhaar Number" required="required" data-error="Adhaar is required.">
                                                <div class="help-block with-errors"></div>
                                            </div>
                                        </div>                                
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="form_email">Mobile Number *</label>
                                                <input id="form_email" maxlength="10" class="form-control user-mobile" placeholder="Enter Mobile Number" required="required" data-error="Mobile is required.">
                                                <div class="help-block with-errors"></div>
                                            </div>
                                        </div> 

                                    </div>

                                    <div class="row">                                        
                                        <div class="col-md-6">
                                            <button class="btn btn-success custom_btn" >Submit</button>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <!--</form>-->
                        </div>
                    </div>


                </div>
            </div>


            <div class="row" id="second_div" style="text-align: center;display:none;width:1160px">
                <h2 class="mainHd">Attach your documents</h2>

                <div class="row" style="margin-left: 380px">  
                    <div class="col-md-12">
                        <form id="drop_your_files" 
                              class="dropzone" 
                              action="/UploadFile.do"
                              enctype="multipart/form-data" 
                              method="post">
                        </form>
                    </div>
                </div>   
                <!--                <form action="/UploadFile.do" class="dropzone">
                                    <div class="fallback">
                                        <input name="file" type="file" multiple />
                                    </div>
                                </form>-->

                <!--<div id="drop_your_files" class="dropzone">Upload</div>-->

                <div class="row" style="width: 1220px;margin-top: 20px;">                                        
                    <div class="col-md-12">
                        <button class="btn btn-success custom_btn1">Submit</button>
                    </div>
                </div>

                <div class="col-md-4 col-md-offset-4 " style="text-align:center;display: none">
                    <a class="btn btn-default" id="__make_payment" href="<%=request.getContextPath()%>/addDetails.do?Method=loadStep3">Submit</a>
                </div>
            </div>

            <div class="row" id="third_div">

            </div>


        </div>


        <jsp:include page="../footer.jsp"></jsp:include>        

    </body>
</html>

