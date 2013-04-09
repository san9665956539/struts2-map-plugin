<%-- 
    Document   : fieldset
    Created on : 11-mar-2013, 11:28:23
    Author     : lalotech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
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
        <h1>Fielset Tag.</h1>
        <div style="width: 850px">
            <sl:fieldset title="panel 1" cssStyle="float:left;width:150px">
                content here!
            </sl:fieldset>
            <sl:fieldset title="panel 2" cssStyle="float:left;width:150px">
                content here!
            </sl:fieldset>
                <sl:fieldset title="panel 3" cssStyle="float:left;width:150px">
                content here!
            </sl:fieldset>
                <sl:fieldset title="panel 4" cssStyle="float:left;width:150px">
                content here!
            </sl:fieldset>
        </div>
    </body>
</html>
