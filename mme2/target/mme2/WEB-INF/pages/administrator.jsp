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
      <script src="<c:url value='/assets/js/service/category_service.js' />"></script>
      <script src="<c:url value='/assets/js/controller/category_controller.js' />"></script>
<title>Admin</title>
</head>
<body ng-app="myApp" class="ng-cloak">
<div class="generic-container" ng-controller="DocumentController as ctrl">
<table class="table table-hover">
 						  <tr>
                              <th>ID </th>
                              <th>Name</th>
                             
                          </tr>
	<tr ng-repeat="u in ctrl.category">
		<td><span>{{u.CategoryId"}}</span></td>
		<td><span>{{u.CategoryName"}}</span></td>

	</tr>

</table>

</div>
      
</body>
</html>