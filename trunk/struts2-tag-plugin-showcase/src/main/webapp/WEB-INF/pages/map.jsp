<%-- 
    Document   : maptag
    Created on : 11-mar-2013, 11:27:43
    Author     : lalotech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sl" uri="/struts-lalotech-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html lang="es" >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
            <style>
                .item{float: left;width: 300px;margin: 5px}
            </style>
            <sl:head googleapi="true" fullcalendarapi="true" />
    </head>
    <body>
        <s:a action="index" namespace="/">Return to menu</s:a>
            <h1>Map tag samples</h1>
            <div style="width: 950px">
                <div class="item">
                <sl:pane title="Simple Map">
                    <sl:map width="290px" height="200px" center="19,-99" mapTypeId="ROADMAP" />
                </sl:pane>
            </div>
            <div class="item">
                <sl:pane title="Markers">
                    <sl:map width="290px" height="200px" markers="markers" mapTypeId="ROADMAP"/>
                </sl:pane>
            </div>
            <div class="item">
                <sl:pane title="Markers with custom icons">
                    <sl:map width="290px" height="200px" markers="markersicons" mapTypeId="ROADMAP"/>
                </sl:pane>
            </div>
            <div class="item">
                <sl:pane title="Geocercas">
                    <sl:map width="290px" height="200px" geocercas="geocercas" mapTypeId="ROADMAP" zoom="10"/>
                </sl:pane>
            </div>
            <div class="item">
                <sl:pane title="Items in-line">
                    <sl:map width="290px" height="200px" mapTypeId="ROADMAP" zoom="4" center="18,-80">
                        <sl:markerItem latlon="18,-80" />
                        <sl:markerItem latlon="19,-80" />
                        <sl:markerItem latlon="20,-80" />
                        <sl:polylineItem from="18,-80" to="20,-70"/>
                    </sl:map>
                </sl:pane>
            </div>
            <div class="item">
                <sl:pane title="Click on Map">
                    <sl:map id="map1"
                            width="290px" height="200px"
                            mapTypeId="ROADMAP" zoom="8"
                            center="19.654789465,-99"
                            eventOnClick="clickmap">                      
                    </sl:map>
                </sl:pane>
                <script type="text/javascript">
                    function clickmap(event, map) {
                        alert("lat: " + event.latLng.lat() + " Lng: " + event.latLng.lng());
                    }
                </script>
            </div>
            <div class="item">
                <sl:pane title="DblClick on Map">
                    <sl:map id="map2"
                            width="290px" height="200px"
                            mapTypeId="ROADMAP" zoom="8"
                            center="19.654789465,-99"                                                        
                            eventOnDblclick="doubleclickmap">                      
                    </sl:map>
                </sl:pane>
                <script type="text/javascript">
                    function doubleclickmap(event, map) {
                        alert("double lat: " + event.latLng.lat() + " Lng: " + event.latLng.lng());
                    }
                </script>
            </div>
            <div class="item">
                <sl:pane title="Mouse on Map">
                    <sl:map id="map3"
                            width="290px" height="200px"
                            mapTypeId="ROADMAP" zoom="8"
                            center="19.654789465,-99"                                                        
                            eventOnMouseOver="overmap"
                            eventOnMouseOut="outmap">
                    </sl:map>
                </sl:pane>
                <script type="text/javascript">
                    function overmap(event, map) {
                        alert("over map!");
                    }
                    function outmap(event, map) {
                        alert("out map!");
                    }
                </script>
            </div>
                <div class="item">
                <sl:pane title="RightClick on Map">
                    <sl:map 
                            width="290px" height="200px"
                            mapTypeId="ROADMAP" zoom="8"
                            center="19.654789465,-99"                                                        
                            eventOnRightClick="rightmap">
                    </sl:map>
                </sl:pane>
                <script type="text/javascript">
                    function rightmap(event, map) {
                        alert("rightclick on map!");
                    }                    
                </script>
            </div>
            <div style="clear: both"></div>
        </div>
    </body>
</html>
