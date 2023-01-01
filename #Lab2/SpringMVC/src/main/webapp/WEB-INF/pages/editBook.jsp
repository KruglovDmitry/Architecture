<%--
  Created by IntelliJ IDEA.
  User: kruglovdy
  Date: 31.12.2022
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Add/edit book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container-md row">
    <h3>Форма редактирования книги:</h3>
    <form class="col col-md-5"  action="save" method="post" modelAttribute="book">
        <div class="mb-3">
            <label class="form-label">Введите название книги:</label>
            <form:input path="book.title" class="form-control" type="text"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Введите автора:</label>
            <form:input path="book.author" class="form-control" type="text"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Введите описание:</label>
            <form:input path="book.description" class="form-control" type="text"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Введите цену:</label>
            <form:input path="book.price" class="form-control" type="number"/>
        </div>
        <div class="mb-3">
            <label class="form-label">Введите количество:</label>
            <form:input path="book.quant" class="form-control" type="number"/>
        </div>
        <form:input path="book.id" type="hidden"/>
        <input class="btn btn-primary" type="submit" value="Сохранить" />
    </form>
</div>
</body>
</html>
