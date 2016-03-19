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

     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">


<title>Admin</title>
</head>
<body ng-app="myApp" class="ng-cloak">
<div class="generic-container" ng-controller="DocumentController">
<table class="table table-hover">
 						  <tr>
                              <th>Logo </th>
                              <th>Path</th>
                              <th>Rss Path</th>
                              <th>Category</th>
                              <th></th>
                             
                          </tr>
	<tr ng-repeat="u in metadataList">
		<td><img src={{u.logo}} width="50"
				height="30" /></td>
		<td><span>{{u.name}}</span></td>
		<td><span><a href={{u.rssPath}}>Rss Path</a></span></td>
		<td><span>{{u.category.categoryName}}</span></td>
		<td><button type="button" ng-click="remove(u.metadataId)" class="btn btn-danger custom-width">Remove</button></td>
	</tr>

</table>

</div>
    
</body>
</html>