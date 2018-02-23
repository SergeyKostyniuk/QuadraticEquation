
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1>All results</h1>
<table class="table table-dark">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">a</th>
        <th scope="col">b</th>
        <th scope="col">c</th>
        <th scope="col">x1</th>
        <th scope="col">x2</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td scope="row">${model.id}</td>
        <td>${model.a}</td>
        <td>${model.b}</td>
        <td>${model.c}</td>
        <td>${model.x1}</td>
        <td>${model.x2}</td>
    </tr>
    </tbody>
</table>
</body>
</html>
