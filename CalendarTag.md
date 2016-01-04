# Introduction #

Fullcalendar implementation in Struts2

### Calendar Day ###

![http://i45.tinypic.com/158606g.png](http://i45.tinypic.com/158606g.png)

### Action ###
```
List<EventModel> events = new ArrayList<EventModel>();        
events.add(new EventModel("title5", "2013-01-16 07:00", "2013-01-16 08:00"));
events.add(new EventModel("title6", "2013-01-16 07:00", "2013-01-16 11:00"));
events.add(new EventModel("title7", "2013-01-16 07:00", "2013-01-16 08:00"));
events.add(new EventModel("title8", "2013-01-16 07:00", "2013-01-16 08:00"));
```
### JSP ###
```
<%@taglib  prefix="sl" uri="/struts-lalotech-tags" %>
<sl:head fullcalendarapi="true"/>  

<sl:calendar minTime="7" maxTime="18"
             allDaySlot="false" firstHour="6"
             defaultView="agendaDay" firstDay="1"
             cssStyle="font-size:7pt"
             events="events" headerCenter=""
             headerLeft="" headerRight=""
             gotoDate="2013,00,16"
             />
```

### Calendar Week ###

![http://i47.tinypic.com/16aa140.png](http://i47.tinypic.com/16aa140.png)

### Action ###
```
List<EventModel> events = new ArrayList<EventModel>();        
events.add(new EventModel("title5", "2013-01-14 07:00", "2013-01-14 08:00"));
events.add(new EventModel("title6", "2013-01-15 07:00", "2013-01-15 11:00"));
events.add(new EventModel("title7", "2013-01-18 07:00", "2013-01-18 08:00"));
events.add(new EventModel("title8", "2013-01-19 07:00", "2013-01-19 08:00"));
```
### JSP ###
```
<%@taglib  prefix="sl" uri="/struts-lalotech-tags" %>
<sl:head fullcalendarapi="true"/>  

<sl:calendar events="events"                             
             defaultView="agendaWeek" firstDay="1"/>
```

### Calendar Month ###

![http://i46.tinypic.com/2d797j8.png](http://i46.tinypic.com/2d797j8.png)

### Action ###
```
List<EventModel> events = new ArrayList<EventModel>();        
events.add(new EventModel("title5", "2013-01-14 07:00", "2013-01-14 08:00"));
events.add(new EventModel("title6", "2013-01-15 07:00", "2013-01-15 11:00"));
events.add(new EventModel("title7", "2013-01-18 07:00", "2013-01-18 08:00"));
events.add(new EventModel("title8", "2013-01-19 07:00", "2013-01-19 08:00"));
```
### JSP ###
```
<%@taglib  prefix="sl" uri="/struts-lalotech-tags" %>
<sl:head fullcalendarapi="true"/> 
<sl:calendar events="events"
             allDaySlot="false" firstHour="6"
             defaultView="month" firstDay="1"/>
```