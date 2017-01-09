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
	<title>LojaOnline - Login</title>
	<c:url value="/template/css" var="cssPath" />
	<link rel="stylesheet" href="${cssPath}/bootstrap.min.css" />
	<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css" />
</head>
<body>
    <div class="container">
        <h1>Login Loja Online</h1>
        <form:form servletRelativeAction="/loginAdmin" method="post">
            <div class="form-group">
                <label>Nome</label>
                <input type="text" name="username" class="form-control" />
            </div>
            <div class="form-group">
                <label>Senha</label>
                <input type="password" name="password" class="form-control" />
            </div>
            <button type="submit" class="btn btn-default">Logar</button>
        </form:form>
    </div>
</body>
</html>