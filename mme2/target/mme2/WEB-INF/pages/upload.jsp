<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-route.js"></script>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-resource.js"></script>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<title>Upload</title>
</head>
<body>
<form method="POST" id="submit" action="upload" enctype="multipart/form-data">
Upload cover photo: <input type="file" name="document" class="multi" accept="image/*"/><br /><br>
Rss Path: <input type="text" name="rssPath" required><br /> <br />
Domain: <input type="text" name="name" required><br /> <br />
Category:
<select class="btn btn-primary dropdown-toggle" data-toggle="dropdown" id="selectedCategory" name="selectedCategory">

				<c:forEach var="category" items="${categoryList}">

                <option value="${category.categoryId}">${category.categoryName}</option>

            </c:forEach>

</select>
</form>

<button class="btn btn-primary" type="submit" form="submit" value="Submit">Submit</button>


</body>
</html>