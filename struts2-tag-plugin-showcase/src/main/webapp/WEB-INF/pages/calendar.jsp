<%-- 
    Document   : calendar
    Created on : 11-mar-2013, 11:28:02
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
        <sl:head fullcalendarapi="true"/>
    </head>
    <body>
        <s:a action="index" namespace="/">Return to menu</s:a>
            <h1>Calendar Tag</h1>
            <div style="width: 900px" class="ui-helper-clearfix">
            <sl:pane title="Calendar Day" cssStyle="width:400px;float:left">
                <div style="padding: 5px">
                    <sl:calendar 
                        events="agendaDay"
                        height="400"
                        defaultView="agendaDay"
                        i18n="es"
                        gotoDate="2013,03,04"
                        headerLeft=""
                        headerRight=""
                        allDaySlot="false"
                        minTime="6"
                        maxTime="18"
                        slotMinutes="15"
                        />            
                </div>
            </sl:pane>
            <sl:pane title="Calendar Week" cssStyle="width:400px;float:left">
                <div style="padding: 5px">
                    <sl:calendar 
                        editable="true"
                        events="agendaWeek"
                        height="400"
                        defaultView="agendaWeek"
                        i18n="es"
                        gotoDate="2013,03,04"                    
                        headerLeft=""
                        headerRight=""
                        headerCenter="title"
                        allDaySlot="false"
                        minTime="8"
                        maxTime="18"
                        columnFormat="'ddd'"
                        eventResize="resize"
                        eventResizeStart="resizestart"
                        eventResizeStop="resizestop"                        
                        />            
                </div>
            </sl:pane>
            <sl:pane title="Calendar Month" cssStyle="width:400px;float:left">
                <div style="padding: 5px">
                    <sl:calendar                        
                        events="month"
                        height="400"
                        i18n="es"
                        gotoDate="2013,03,04"                    
                        headerLeft=""
                        headerRight=""
                        headerCenter="title"
                        allDaySlot="false"
                        minTime="6"
                        maxTime="18"
                        columnFormat="'ddd'"                       
                        />            
                </div>
            </sl:pane>
            <sl:pane title="Calendar Month - With Events" cssStyle="width:400px;float:left">
                <div style="padding: 5px">                   
                    <sl:calendar
                        eventClick="click"
                        dayClick="dayclick"
                        eventDragStart="dragstart"
                        eventDragStop="dragstop"
                        eventRender="render"                        
                        editable="true"
                        events="month"
                        height="400"
                        i18n="es"
                        gotoDate="2013,03,04"                    
                        headerLeft=""
                        headerRight=""
                        headerCenter="title"
                        allDaySlot="false"
                        minTime="6"
                        maxTime="18"
                        columnFormat="'ddd'"                        
                        /> 
                    <ul>
                        <li>eventClick</li>
                        <li>dayClick</li>
                        <li>eventResize</li>
                        <li>eventDrop</li>
                        <li>eventDragStart</li>
                        <li>eventDragStop</li>
                        <li>eventResizeStart</li>
                        <li>eventResizeStop</li>
                        <li>eventRender</li>                        
                        <li>eventAfterRender</li>                    
                    </ul>
                </div>
                <script type="text/javascript">
                    function afterrender(event, element, view ){
                        alert("event afterrender!");
                    }
                    function render(event, element, view){
                        console.log("event render!");
                    }
                    function resizestop(event, jsEvent, ui, view){
                        alert("event resizestop!");
                    }
                    function resizestart(event, jsEvent, ui, view){
                        alert("event resizestart!");
                    }
                    function dragstop(event, jsEvent, ui, view){
                        alert("event drag stop!");
                    }
                    function dragstart(event, jsEvent, ui, view){
                        alert("drag start!");
                    }
                    function drop(event, dayDelta, minuteDelta, allDay, revertFunc, jsEvent, ui, view ){
                        alert("event drop!");
                    }
                    function resize(event,dayDelta,minuteDelta,revertFunc){
                        alert("event resize!");
                    }
                    function click(calEvent, jsEvent, view){
                        alert("event click!");
                    }
                    function dayclick(date, allDay, jsEvent, view){
                        alert("day click!");
                    }
                </script>
            </sl:pane>
        </div>
    </body>
</html>
