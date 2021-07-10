<%-- 
    Document   : services
    Created on : 22 Mar, 2020, 11:50:50 AM
    Author     : PromoVision
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>

        <%request.setAttribute("home", "0");%>
        <jsp:include page="../header.jsp"></jsp:include>

        </head>

        <style>
            /*    .card-group h4 {
                    font-family: 
                }*/
            .thumbnail{height:330px !important;}
            .card-width-cstm{width:40%}
            /*    .card-block{-webkit-box-flex:1;
                            flex:1 1 auto;
                            padding:1.25rem;
                            line-height:1.5}
                .card-title{margin-bottom:.75rem;}*/
            /*.card{border:1px solid rgba(0,0,0,.125);border-radius:.25rem;margin-top:6%;padding:0}*/
            .card h4{text-align:left;font-weight:bold;font-size:18px}
            .btn-primary1{background:#258fe0;margin-left: 60px}
            i{font-size:30px;}
        </style>

        <body style="background-color: white">



            <div class="container">
                <div class="row">
                    <div class='col-md-12'>
                        <br>
                        <h2 style='text-align :center;color:#777777 '>Our Services</h2>
                        <hr>
                        <div class="card-group">
                            <div class="row">
                                <br>
                                <h3 style='text-align :center;color:#777777 '>Compliance Services</h3>
                                <br>
                            </div>
                            <div class="row">
                                <div class='col-md-4'>
                                    <div class="card">
                                        <div style='width:100%;height:200px; '>
                                            <img class="card-img-top card-width-cstm" style='float:none;margin:9% 30%' src="<%=request.getContextPath()%>/img/s1.png" alt="Card image" style="width:100%"/>
                                    </div>
                                    <hr>
                                    <div class="card-block">
                                        <h4 class="card-title">Startup Compliance Package</h4>
                                        <p class="card-text"> This Package is for Startups who have just started or who ants to start business, it covers Business Registration, Tax Registrations, Basic Accounting, GST and Income Tax Compliances for business having upto 100 transactions per month
 </p>
                                        <!--<a href="#" class="btn btn-primary btn-primary1">See Profile</a>-->
                                    </div>
                                </div>
                            </div>
                            <div class='col-md-4'>
                                <div class="card" style="">
                                    <div style='width:100%;height:200px;'>
                                        <img class="card-img-top card-width-cstm" src="<%=request.getContextPath()%>/img/m1.png" style='float:none;margin: 10% 33%;' width='38%' alt="Card image cap">
                                    </div>
                                    <hr>    
                                    <div class="card-block">
                                        <h4 class="card-title">Medium Compliance Package</h4>
                                        <p class="card-text">This Package is for Medium Sized Businesses , it covers all applicable legal and taxation compliances including Accounting for your businss, GST, Income Tax Compliances, ROC Compliances etc  for business .</p>
                                        <!--<a href="#" class="btn btn-primary btn-primary1">Learn More</a>-->
                                    </div>
                                </div>
                            </div>
                            <div class='col-md-4'>
                                <div class="card" style="">
                                    <div style='width:100%;height:200px;'>
                                        <img class="card-img-top card-width-cstm" src="<%=request.getContextPath()%>/img/a1.png" style='float:none;margin: 10% 31%' width='39%' alt="Card image cap">
                                    </div>
                                    <hr>
                                    <div class="card-block">
                                        <h4 class="card-title">Premium Package</h4>
                                        <p class="card-text"This Package includes all features of Medium Enterprise Package plus you get dedicated Virtual Accounts Manager for your company, Full support of team of CA, CS and lawyers related to any of your business query and Monthly Reports/ MIS  .</p>
                                        <!--<a href="#" class="btn btn-primary">Learn More</a>-->
                                    </div>
                                </div>
                            </div>
                        </div>



                        <!--                        <div class='col-md-4'>
                                                    <div class="card" style="">
                                                        <div style='width:100%;height:200px;'>
                                                            <img class="card-img-top card-width-cstm" src="<%=request.getContextPath()%>/img/e1.png" style='float:none;margin: 9% 30%;' width='39%' alt="Card image cap">
                                                        </div>
                                                        <hr>
                                                        <div class="card-block">
                                                            <h4 class="card-title">TDS Returns</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>                                      
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class='col-md-4'>
                                                    <div class="card" style="">
                                                        <div style='width:100%;height:200px;'>
                                                            <img class="card-img-top card-width-cstm" src="<%=request.getContextPath()%>/img/h1.png" style='float:none;margin: 10% 32%;' width='38%' alt="Card image cap">
                                                        </div>
                                                        <hr>
                                                        <div class="card-block" style="border-top: 1px;border-color: black">
                                                            <h4 class="card-title">Book Keeping</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>                                       
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class='col-md-4'>
                                                    <div class="card" style="">
                                                        <div style='width:100%;height:200px;'>
                                                            <img class="card-img-top card-width-cstm" src="<%=request.getContextPath()%>/img/su1.png" style='float:none;margin: 11% 30%;' width='38%' alt="Card image cap">
                                                        </div>
                                                        <hr>
                                                        <div class="card-block">
                                                            <h4 class="card-title">ROC Filing</h4>
                                                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>                                        
                                                        </div>
                                                    </div>
                                                </div>-->

                    </div>





                    <div class="card-group">
                        <div class="row">
                            <br>
                            <h3 style='text-align :center;color:#777777 '>Individual Services</h3>
                            <br>
                        </div>
                        <div class="row">
                            <div class='col-md-4'>
                                <div class="card border-secondary mb-3" style="padding:0px !important">    
                                    <div class="card-header">Business Registration / Incorporation</div>
                                    <div class="card-body text-primary">                                        
                                        <p class="card-text">Incorporate your company and give your business a legal identity starting at 9999/- + Govt. Fees
</p>
                                        <a href="#" class="btn btn-primary btn-primary1">Select</a>
                                    </div>
                                </div>
                            </div>
                            <div class='col-md-4'>
                                <div class="card border-secondary mb-3" style="padding:0px !important">    
                                    <div class="card-header">Digital Accounting</div>
                                    <div class="card-body text-primary">                                        
                                        <p class="card-text">In this digital Era, your company’s accounting process needs to go digital to save unnecessary expense and to experience contact less high quality accounting service starting at just 2999/- per month 
</p>
                                        <a href="#" class="btn btn-primary btn-primary1">Book</a>
                                    </div>
                                </div>
                            </div>
                            <div class='col-md-4'>
                                <div class="card border-secondary mb-3" style="padding:0px !important">    
                                    <div class="card-header">GST</div>
                                    <div class="card-body text-primary">                                        
                                        <p class="card-text">If you are registered under GST, but your business is just at starting stage, you can hire us for your GST Return filing to avoid heavy penalties, starting at Rs 499/- 
</p>
                                        <a href="#" class="btn btn-primary btn-primary1">Select</a>
                                    </div>
                                </div>
                            </div>
                            <div class='col-md-4'>
                                <div class="card border-secondary mb-3" style="padding:0px !important">    
                                    <div class="card-header">TDS Returns</div>
                                    <div class="card-body text-primary">                                        
                                        <p class="card-text">If you have deducted TDS, you have to file TDS Returns, you cana hire us for this service starting from 499/- per TDS return
</p>
                                        <a href="#" class="btn btn-primary btn-primary1">Book</a>
                                    </div>
                                </div>
                            </div>
                            <div class='col-md-4'>
                                <div class="card border-secondary mb-3" style="padding:0px !important">    
                                    <div class="card-header">Income Tax Return</div>
                                    <div class="card-body text-primary">                                        
                                        <p class="card-text">Give Basic details and Upload your docs, our executive will call you within 10 minutes and will assist you and file your ITR. Price Starting at 499/-
</p>
                                        <a href="#" class="btn btn-primary btn-primary1">Select</a>
                                    </div>
                                </div>
                            </div>
                            
                             <div class='col-md-4'>
                                <div class="card border-secondary mb-3" style="padding:0px !important">    
                                    <div class="card-header">Audit</div>
                                    <div class="card-body text-primary">                                        
                                        <p class="card-text">We provide Income Tax Audit, Statutory Audit and Internal Audit Services suitable to the nature and size of your business</p>
                                        <a href="#" class="btn btn-primary btn-primary1">Select</a>
                                    </div>
                                </div>
                            </div>
                           
                            <div class='col-md-4'>
                                <div class="card border-secondary mb-3" style="padding:0px !important">    
                                    <div class="card-header">Business Agreements</div>
                                    <div class="card-body text-primary">                                        
                                        <p class="card-text"> For safeguarding every transaction,your business needs specific agreements like NDA's NCA's etc, our team will assist you in drafting all necessary agreements </p>
                                        <a href="#" class="btn btn-primary btn-primary1">Book</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>



                </div>
            </div><!---row ends-->
        </div><!---container ends-->
        <jsp:include page="../footer.jsp"></jsp:include>
        </body>
</html:html>
