<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/css/authorization.css"/>" >
<title>加入伟氏</title>
</head>
<body>
<jsp:include page="/pages/templates/head.jsp"></jsp:include>
<div class="content">
	<div class="join-wrapper">
		<div class="join-head">
			<h1>加入伟氏</h1>
			<p class="target">救助猫咪、狗狗，或者成为我们的一名志愿者.</p>
			<div class="createinfo"><div class="account">创建个人账户信息</div></div>
		</div>
		<div class="join-main">
			<form>
				<dl class="form">
					<dt class="input-label"><label for="user_login">用户名</label></dt>
					<dd><input type="text" id="user_login" /></dd>
				</dl>
				<dl class="form">
					<dt class="input-label"><label for="user_login">邮箱</label></dt>
					<dd><input type="text" id="user_login" /></dd>
				</dl>
				<dl class="form">
					<dt class="input-label"><label for="user_login">密码</label></dt>
					<dd><input type="password" id="user_login" /></dd>
				</dl>
				<dl class="form">
					<dt class="input-label"><label for="user_login">确认密码</label></dt>
					<dd><input type="password" id="user_login" /></dd>
				</dl>
				<p class="join-split">&nbsp;</p>
				<div class="form-actions">
					<input class="button green" type="button" value="注册" />
				</div>
				<div style="height:50px;">&nbsp;</div>
			</form>
		</div>
		<div class="join-sec"></div>
	</div>
</div>
<script type="text/javascript">
	$(document).ready(function(){
	  var params = {
			  url:"<c:url value='/test'/>"
	  };
	  Base.ajax(params,function(msg){
		  alert("name:"+msg.name);
	  });
	});
</script>
</body>
</html>