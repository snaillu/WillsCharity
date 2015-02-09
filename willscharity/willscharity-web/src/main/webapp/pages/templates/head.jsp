
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="shortcut icon" type="image/x-icon" href="<c:url value="/images/wei.ico"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/css/common.css"/>" >
<script type="text/javascript" src="<c:url value="/js/jquery-1.11.2.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/core.js" />"></script>
<div id="header">
	<div class="nav clearfix">
		<div class="logo">偉氏救助</div>
		<div class="search"><input type="text" placeholder="搜索" /></div>
		<ul class="header-nav left">
			<li class="head-nav-item"><a href="#" class="head-nav-link current">介绍</a></li>
			<li class="head-nav-item"><a href="#" class="head-nav-link">我要领养</a></li>
			<li class="head-nav-item"><a href="#" class="head-nav-link">关于我们</a></li>
		</ul>
		<div class="head-actions">
			<a id="join" class="button green" href="<c:url value="/join"/>">注册</a>
			<a id="login" class="button" href="<c:url value="/login"/>">登录</a>
		</div>
	</div>
</div>