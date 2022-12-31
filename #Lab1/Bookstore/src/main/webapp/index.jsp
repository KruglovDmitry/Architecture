<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bookstore</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h3><%= "Hello, User!" %></h3>
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
            <td><a href="user-servlet">Show all</a></td>
            <td><a href="book-servlet">Show all</a></td>
        </tr>
        <tr>
            <td>2</td>
            <td><a href="add-user-servlet">Add</a></td>
            <td><a href="add-book-servlet">Add</a></td>
        </tr>
    </tbody>
</table>
</body>
</html>