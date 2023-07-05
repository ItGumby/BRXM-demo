<#assign hst=JspTaglibs["http://www.hippoecm.org/jsp/hst/core"] >
<html>
    <head>
    </head>
    <body>
      <#if document??>
        <h1>${document.title?html}</h1>
        <div>
          <@hst.html hippohtml=document.content />
        </div>
        <#else>
          <h1>DevTrail: hello world</h1>
          <h2>Goodbye? cruel world</h2>
          <p>following the instructions for
            <a href="https://xmdocumentation.bloomreach.com/trails/deep-dive/hello-world.html">
              BRXM hello-world.html
            </a>.
          </p>
      </#if>
    </body>
</html>
