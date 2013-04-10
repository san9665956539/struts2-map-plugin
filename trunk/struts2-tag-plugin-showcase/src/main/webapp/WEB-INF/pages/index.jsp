<%-- 
    Document   : index
    Created on : 08-mar-2013, 9:40:57
    Author     : lalotech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Struts 2 Tag Plugin by Lalotech.</h1>
        <div>
            <h2>Widget's</h2>
            <ul>
                <li><s:a action="map" namespace="/">Map</s:a></li>
                <li><s:a action="calendar" namespace="/">Calendar</s:a></li>
                <li><s:a action="fieldset" namespace="/">Fieldset</s:a></li>
                <li><s:a action="panel" namespace="/">Panel</s:a></li>
                <li><s:a action="poll" namespace="/">Poll</s:a></li>
                <li><s:a action="portlet" namespace="/">Portlet</s:a></li>
            </ul>
        </div>
    </body>
</html>
