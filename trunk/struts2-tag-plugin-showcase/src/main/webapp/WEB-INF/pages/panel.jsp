<%-- 
    Document   : panel
    Created on : 11-mar-2013, 11:28:28
    Author     : lalotech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-lalotech-tags" prefix="sl" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sl:head />
    </head>
    <body>
        <h1>Pane Tag</h1>
        <sl:pane title="pane 1" cssStyle="witdh:200px">
            <div>some code o content here!</div>
        </sl:pane>
        <sl:pane title="pane 2" cssStyle="witdh:200px">
            <div>some code o content here!</div>
        </sl:pane>
        <sl:pane title="pane 3" cssStyle="witdh:200px">
            <div>some code o content here!</div>
        </sl:pane>
        <sl:pane title="pane 4" cssStyle="witdh:200px">
            <div>some code o content here!</div>
        </sl:pane>
    </body>
</html>
