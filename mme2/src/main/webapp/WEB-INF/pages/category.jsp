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
  <script src="<c:url value='/assets/js/app.js' />"></script>
      <script src="<c:url value='/assets/js/service/metadata_service.js' />"></script>
      <script src="<c:url value='/assets/js/controller/metadata_controller.js' />"></script>
<style>

</style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<title>Admin</title>
</head>

<body ng-app="myApp" class="ng-cloak">
<div class="generic-container" ng-controller="DocumentController">
<div class="tablecontainer">

prEvEd :D

<table class="table table-hover">
 						  <tr>
                              <th>ID </th>
                              <th>Name</th>
                             
                          </tr>
	<tr ng-repeat="u in categoryList">
		<td><span ng-bind="u.categoryId"></span></td>
		<td><span ng-bind="u.categoryName"></span></td>
<!-- 		<td><button type="button" ng-click="removeCategory(u.categoryId)" class="btn btn-danger custom-width">Remove</button></td>
 -->		

	</tr>

</table>
</div>
</div>
</body>
</html>