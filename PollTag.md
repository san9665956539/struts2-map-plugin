# PollTag #

## Details ##

Refresh automatic.

![http://i47.tinypic.com/33nchsw.png](http://i47.tinypic.com/33nchsw.png)

Action code:
```
Calendar c = Calendar.getInstance();
String h = ""+(c.get(Calendar.HOUR)<10? "0"+c.get(Calendar.HOUR):""+c.get(Calendar.HOUR));
String m = ""+(c.get(Calendar.MINUTE)<10? "0"+c.get(Calendar.MINUTE):""+c.get(Calendar.MINUTE));
String s = ""+(c.get(Calendar.SECOND)<10? "0"+c.get(Calendar.SECOND):""+c.get(Calendar.SECOND));
        time = h+":"+m+":"+s;
```

JSP code:
```
...

<%@taglib prefix="sl" uri="/struts-lalotech-tags" %>
...

<s:url action="current-time" namespace="/ajax" var="url"/>            
<sl:poll id="time1" url="%{url}" cssStyle="font-size:48pt;font-weight: bold"/>
```