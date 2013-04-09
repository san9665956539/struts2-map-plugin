<%-- 
    Document   : poll
    Created on : 09-abr-2013, 17:49:42
    Author     : lalotech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sl" uri="/struts-lalotech-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sl:head />
    </head>
    <body>
        <s:a action="index" namespace="/">Return to menu</s:a>
        <h1>Poll Tag</h1>
        <sl:pane title="relog" cssStyle="width:350px">
            <s:url action="current-time" namespace="/ajax" var="url"/>            
            <sl:poll id="time1" url="www.google.com" cssStyle="font-size:4pt;font-weight: bold" />
        </sl:pane>
    </body>
</html>
