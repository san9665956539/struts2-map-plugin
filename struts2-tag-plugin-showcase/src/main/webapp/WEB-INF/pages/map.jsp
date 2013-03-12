<%-- 
    Document   : maptag
    Created on : 11-mar-2013, 11:27:43
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
        <style>
            .item{float: left;width: 300px;margin: 5px}
        </style>
        <sl:head googleapi="true" fullcalendarapi="true"/>
    </head>
    <body>
        <s:a action="index" namespace="/">Return to menu</s:a>
        <h1>Map tag samples</h1>
        <div>
            <div class="item">
                <h4>Simple Map</h4>
                <sl:map width="290px" height="200px" center="19,-99" mapTypeId="ROADMAP" />
            </div>
            <div class="item">
                <h4>Markers</h4>
                <sl:map width="290px" height="200px" markers="markers" mapTypeId="ROADMAP"/>
            </div>
            <div class="item">
                <h4>Markers with custom icons</h4>
                <sl:map width="290px" height="200px" markers="markersicons" mapTypeId="ROADMAP"/>
            </div>
            <div class="item">
                <h4>Geocercas</h4>
                <sl:map width="290px" height="200px" geocercas="geocercas" mapTypeId="ROADMAP" zoom="10"/>
            </div>
            <div>
                <sl:map width="290px" height="200px" mapTypeId="ROADMAP" zoom="10" center="18,-80">
                    <sl:markerItem latlon="18,-80" />
                    <sl:markerItem latlon="19,-80" />
                    <sl:markerItem latlon="20,-80" />
                </sl:map>
            </div>
            <div style="clear: both"></div>
        </div>
    </body>
</html>
