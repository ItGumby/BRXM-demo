<#include "../../include/imports.ftl">

<#-- @ftlvariable name="document" type="org.example.beans.Video" -->
<#-- @ftlvariable name="cparam" type="org.onehippo.cms7.essentials.components.info.EssentialsVideoComponentInfo"--%> -->
<#if document??>
  <div>
    <iframe width="${cparam.width}" height="${cparam.height}" src="${document.link?html}?autoplay=1" frameborder="0" allowfullscreen></iframe>
  </div>
<#-- @ftlvariable name="editMode" type="java.lang.Boolean"-->
<#elseif editMode>
  <div>
    <img src="<@hst.link path="/images/essentials/catalog-component-icons/video.svg" />"> Click to edit Video
  </div>
</#if>
