<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<html>
</head>
<body>

<security:authentication property="principal.username" var="uName"/>
<security:authorize access="isAuthenticated()">
			
					<s:url value="/j_spring_security_logout" var="logoutUrl" />
					<a href="${logoutUrl}" style="color: #0066FF; margin-left:70%;">Logout</a>		
	<div id="uname">Welcome, ${uName} </div>
		
		</security:authorize>

<div id="dms_header">Mme2</div>	
</body>
</html>