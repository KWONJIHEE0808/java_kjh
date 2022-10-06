<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<body>
	<div class="jumbotron text-center" style="margin-bottom:0">
	<a href="http://localhost:8080/project/" height="5" width="10" target="_self">
		<img src="https://www.thebanchan.co.kr/fo/images/ico/logo.png"
		alt="로고" width="188" height="50" align="center" border="0">
	</a>
	</div>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  <a class="navbar-brand" href="#">Menu</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="collapsibleNavbar">
	    <ul class="navbar-nav">
	    	<c:if test="${user == null }">
		      <li class="nav-item">
		        <a class="nav-link" href="<c:url value="/login"></c:url>">로그인</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="<c:url value="/signup"></c:url>">회원가입</a>
		      </li>
	      	</c:if>
	      	<c:if test="${user != null }">
		      <li class="nav-item">
		        <a class="nav-link" href="#">로그아웃</a>
		      </li>  
		    </c:if>  
	    </ul>
	  </div>  
	</nav>
</body>	