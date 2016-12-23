<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Destructive Grails</title>
    <asset:stylesheet href="bootstrap.css"/>
</head>

<body>
    <div class="container">
        <div class="jumbotron">
            <h1>Hi :-) my name is ${instanceName}.</h1>
            <p>Go ahead and <g:link controller="destructive" action="destroy">destroy me.</g:link></p>
        </div>
    </div>
</body>
</html>