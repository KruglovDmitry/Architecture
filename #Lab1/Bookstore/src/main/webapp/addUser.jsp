<%--
  Created by IntelliJ IDEA.
  User: kruglovdy
  Date: 30.12.2022
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add user</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container row">
<form class="col col-md-5" action="add-book-servlet" method="post">
    <div class="mb-3">
        <label for="name" class="form-label">Введите имя:</label>
        <input class="form-control" type="text" id="name" value="${user.name}" name="name" />
    </div>
    <div class="mb-3">
        <label for="surname" class="form-label">Введите фамилию:</label>
        <input class="form-control" type="text" id="surname" value="${user.surname}" name="surname" />
    </div>
    <div class="mb-3">
        <label for="login" class="form-label">Введите логин:</label>
        <input class="form-control" type="text" id="login" value="${user.login}" name="login" />
    </div>
    <div class="mb-3">
        <label for="password" class="form-label">Введите пароль:</label>
        <input class="form-control" type="text" id="password" value="${user.password}" name="password" />
    </div>
    <div class="mb-3">
        <label for="age" class="form-label">Введите возраст:</label>
        <input class="form-control" type="number" id="age" value="${user.age}" name="age" />
    </div>
    <input type="hidden" id="id" value="${user.id}" name="id" />
    <input class="btn btn-primary" type="submit" value="Сохранить" />
</form>
</div>
</body>
</html>
