<%--
  Created by IntelliJ IDEA.
  User: kruglovdy
  Date: 31.12.2022
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BookstoreApp</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container-md">
<h3><%= "Добрый день!" %></h3>
<table class="table table-hover" style="width: 450px">
    <thead>
    <tr>
        <th>#</th>
        <th>User</th>
        <th>Book</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td><a href="/users/all">Show all</a></td>
        <td><a href="/books/all">Show all</a></td>
    </tr>
    <tr>
        <td>2</td>
        <td><a href="/users/add">Add</a></td>
        <td><a href="/books/add">Add</a></td>
    </tr>
    </tbody>
</table>
</div>
</body>
</html>
