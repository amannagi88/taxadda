<%@page import="com.tax.form.SessionForm"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%
    SessionForm form = (SessionForm) request.getSession(false).getAttribute("sessionForm");
%>
<%if (request.getAttribute("home") != null && request.getAttribute("home").equals("1")) {%>
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/footer.css">
<link rel="stylesheet" href="css/transactions.css">
<%} else {%>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/main.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/footer.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/transactions.css">
<%}%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<nav class="navbar navbar-expand-sm navbar-light navbar-custom" style="padding-left:0px;padding-right:0px;padding-top: 0px !important">


    <div class="container-fluid">
        <a class="navbar-brand" onmouseover="style='float:left;font-size: x-large;background-color: transparent;color:black !important'" style="float:left;font-size: x-large;" href="#">
            <%if (request.getAttribute("home") != null && request.getAttribute("home").equals("1")) {%>
            <img src="assets/favicon.jpg" alt="" height="32" width="32">
            <%} else {%>
            <img src="../assets/favicon.jpg" alt="" height="32" width="32">
            <%}%>
            <span class="ml-2"><bean:message key="welcome.title"></bean:message></span>
        </a>

            <button class="navbar-toggler" type="button" data-toggle="collapse">
                <span class="fa fa-fw fa-home"></span>
            </button>
            <button class="navbar-toggler" type="button" data-toggle="collapse">
                <span class="fa fa-bars"></span>
            </button>

            <div class="collapse navbar-collapse flex-column align-items-start ml-lg-2 ml-0 mr-3" style="font-weight:700"  id="navbarCollapse">
                <ul class="navbar-nav  ml-auto">
                    <li class="nav-item"><a href="javascript:;"  class="nav-link">+91-782-741-4928 <span style="font-weight:bold">  | </span></a></li>
                    <li class="nav-item" >
                        <a class="nav-link" href="<%=request.getContextPath()%>/link.do?Method=home"> Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" >About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" >Contact Us </a>
                </li>			
                <%if (form != null && form.getUserId() > 0) {%>
                <li class="nav-item" id="logBtnErp">
                    <a class="nav-link" href="<%=request.getContextPath()%>/link.do?Method=login"> Logout</a>
                </li>
                <%} else {%>
                <li class="nav-item" id="logBtnErp">
                    <a class="nav-link" href="<%=request.getContextPath()%>/link.do?Method=login"> Login</a>
                </li>
                <%}%>
<!--                <li class="nav-item">				    
                    <span style="font-size:30px;cursor:pointer">
                        <i class="fa fa-bars nav-link">
                        </i>
                    </span>
                </li>-->
            </ul>
            <ul class="navbar-nav flex-row mb-md-1 mt-md-0 mb-3 mt-2  ml-auto">
                <li class="nav-item">
                    <a style="cursor:pointer"  class="nav-link py-0 pr-1" ><i class="fa fa-facebook"></i></a>
                </li>
                <li class="nav-item">
                    <a style="cursor:pointer" class="nav-link py-0 pr-1" ><i class="fa fa-instagram"></i></a>
                </li>
<!--                <li class="nav-item">
                    <a class="nav-link py-0 pr-3" href="#"><i class="fa fa-twitter"></i></a>
                </li>-->
            </ul>
        </div>
    </div>

</nav>