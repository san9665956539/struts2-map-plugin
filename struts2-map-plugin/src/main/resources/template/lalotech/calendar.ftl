<#assign escapedId="${parameters.id?string?replace('.', '_')}">
<div id="${escapedId?html}"  <#if parameters.cssStyle??>   style="${parameters.cssStyle}"    </#if>    <#if parameters.cssClass??>    class="${parameters.cssClass}"    </#if>></div>