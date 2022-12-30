<%--
  Created by IntelliJ IDEA.
  User: kruglovdy
  Date: 30.12.2022
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container row">
<form class="col col-md-5"  action="add-book-servlet" method="post">
    <div class="mb-3">
        <label for="title" class="form-label">Введите название книги:</label>
        <input class="form-control" type="text" id="title" value="${book.title}" name="title" />
    </div>
    <div class="mb-3">
        <label for="author" class="form-label">Введите автора:</label>
        <input class="form-control" type="text" id="author" value="${book.author}" name="author" />
    </div>
    <div class="mb-3">
        <label for="description" class="form-label">Введите описание:</label>
        <input class="form-control" type="text" id="description" value="${book.description}" name="description" />
    </div>
    <div class="mb-3">
        <label for="price" class="form-label">Введите цену:</label>
        <input class="form-control" type="number" id="price" value="${book.price}" name="price" />
    </div>
    <div class="mb-3">
        <label for="quant" class="form-label">Введите количество:</label>
        <input class="form-control" type="number" id="quant" value="${book.quant}" name="quant" />
    </div>
    <input type="hidden" id="id" value="${book.id}" name="id" />
    <input class="btn btn-primary" type="submit" value="Сохранить" />
</form>
</div>
</body>
</html>
