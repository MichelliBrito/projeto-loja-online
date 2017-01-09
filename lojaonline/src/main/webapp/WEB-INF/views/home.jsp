<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ page isELIgnored="false" %>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>LojaOnline - Home</title>

	<c:url value="/template/css" var="cssPath" />
	<link rel="stylesheet" type="text/css" href="${cssPath}/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="${cssPath}/bootstrap-theme.min.css" />
	
</head>
<body>
	<nav class="navbar navbar-inverse">
		  <div class="container">
		    <div class="navbar-header">
		      
		      <a class="navbar-brand" href="#">LojaOnline</a>
		    </div>
		    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		      <ul class="nav navbar-nav">
		        <li><a href="#">Produtos</a></li>
		        <li><a href="#">Cadastro de Produtos</a></li>
		        <li><a href="#">Quem Somos</a></li>
		        <li><a href="#">Contato</a></li>
		      </ul>
		    </div><!-- /.navbar-collapse -->
		  </div>
	</nav>
</body>
</html>