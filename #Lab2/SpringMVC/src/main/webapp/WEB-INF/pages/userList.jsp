<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>User list page</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
	<body>
	<div class="container-md">
		<h3>Список пользователей:</h3>
		<ul class="list-group" style="width: 550px">
			<c:forEach items="${users}" var="user">
				<li class="list-group-item">
					<div class="row" style="width: inherit">
						<div class="col-sm-7">
							<span>${user.name}</span>
							<span>${user.surname}</span>
						</div>
						<div class="col-sm-5">
							<a class="btn btn-sm btn-outline-warning" href="/update?id=${user.id}">Редактировать</a>
							<a class="btn btn-sm btn-outline-danger" href="/delete?id=${user.id}">Удалить</a>
						</div>
					</div>
				</li>
			</c:forEach>
		</ul>
	</div>
	</body>
</html>