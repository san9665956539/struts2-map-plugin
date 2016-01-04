# Introduction #

Simple PaneTag Container.

## Examples use PaneTag ##

### Simple ###

![http://i48.tinypic.com/10eiqlz.png](http://i48.tinypic.com/10eiqlz.png)

### JSP ###
```
<sl:head />

<sl:pane title="title of the pane" cssStyle="width:300px;float:left;margin:10px">
     <div style="margin: 10px;font-size: 10pt">
         <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>
      </div>
</sl:pane>
```


### Simple with style ###

![http://i47.tinypic.com/fz3jtv.png](http://i47.tinypic.com/fz3jtv.png)

### JSP ###
```
<sl:head />

<sl:pane title="title of the pane with custom style" cssStyleTitle="font-size:8pt;color:red" cssStyle="width:300px;float:left;margin:10px" >
     <div style="margin: 10px;font-size: 10pt">
          <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>
     </div>
</sl:pane>
```