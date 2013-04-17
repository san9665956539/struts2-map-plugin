<%-- 
    Document   : portlet
    Created on : 10-abr-2013, 11:20:18
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
        <div style="width: 400px">
            <s:a action="index" namespace="/">Return to menu</s:a>
                <h1>Portlet Tag</h1>
            <sl:portlet title="portlet 1" >
                Content 1
            </sl:portlet>
            <sl:portlet title="portlet 2">
                Content 2
            </sl:portlet>
            <sl:portlet title="portlet 3">
                Content 3
            </sl:portlet>
        </div>
    </body>
</html>
