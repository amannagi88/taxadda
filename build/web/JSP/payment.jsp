<%-- 
    Document   : payment
    Created on : 18 Apr, 2020, 1:15:39 PM
    Author     : Dell India
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page import="com.tax.form.SessionForm"%>
<%
    SessionForm sForm = (SessionForm) request.getSession(false).getAttribute("sessionForm");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
    <html:base/>
    <jsp:include page="../header.jsp"></jsp:include>
    </head>
    <form action="<%=request.getContextPath()%>/addDetails.do?Method=paymentSuccess" method="POST"> 
        <script
            src="https://checkout.razorpay.com/v1/checkout.js"
            data-key="rzp_test_uChk2k5T5fBncw" 
            data-amount="30000" 
            data-currency="INR"
            data-order_id="<%=request.getSession(false).getAttribute("orderId")%>"
        data-buttontext="Pay with Razorpay"
        data-name="TaxFilingKaro"
        data-description="TaxFilingKaro.com transaction"
        data-image="https://example.com/your_logo.jpg"
        data-prefill.name=""
        data-prefill.email="<%=sForm.getUserName()%>"
        data-prefill.contact="9999999999"
        data-theme.color="#F37254"
    ></script>
    <input type="hidden" custom="Hidden Element" name="hidden">
</form>
</html>