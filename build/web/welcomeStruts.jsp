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

        <%request.setAttribute("home", "1");%>
        <jsp:include page="header.jsp"></jsp:include>

        </head>
        <body style="background-color: white">

        <logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
            <div  style="color: red">
                ERROR:  Application resources not loaded -- check servlet container
                logs for error messages.
            </div>
        </logic:notPresent>

        <jsp:include page="JSP/corousel.jsp"></jsp:include>

        <%--<jsp:include page="JSP/services.jsp"></jsp:include>--%>
        
        <jsp:include page="footer.jsp"></jsp:include>

        </body>
</html:html>
