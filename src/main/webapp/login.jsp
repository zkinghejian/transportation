<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>会员</title>
<!-- For-Mobile-Apps-and-Meta-Tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //For-Mobile-Apps-and-Meta-Tags -->

<link href="css/style1.css" type="text/css" rel="stylesheet" media="all">
<link href="css/jquerysctipttop.css" rel="stylesheet" type="text/css">
<link rel="shortcut icon" href="ico/yueye.ico" type="image/x-icon" />
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="js/my.js"></script>
</head>
<body>
<h1>欢迎加入越野汽修</h1>
<section>
  <div class="controls w3l">
    <div class="cbcontrol" id="cbControlRight"><</div>
    <div class="cbcontrol" id="cbControlLeft">></div>
    <div class="clear"></div>
  </div>
  <div class="stage">
   
    <div class="cbImage w3">
		<h3>找回密码</h3>
		<form action="#" method="post" >
		<!--  
			<input type="text" class="email" name="email" placeholder="邮箱" required="">
		-->
			<input type="text" class="number" name="phone number" placeholder="手机号" required="">
			<input type="submit" class="done" value="找回密码">
		</form>
		<!--  
		<a href="#" class="rterms">登录</a>
		-->
	</div>
    <div class="cbImage active signin agileits">
		<h3>登 录</h3>
		<form action="user/login" method="post" id="login" onsubmit="return loginCheck();">
			<input type="text" name="phoneno" class="number" placeholder="手机号" required="">
			<input type="password" name="password" class="password" placeholder="密码" required="">
			<input  type="submit" class="done" value="登录">
			<!--  
			<ul class="bottom">
				<li><a href="#" class="forgot">忘记密码?</a></li>
				<li><a href="#" class="terms">注册</a></li>
			</ul>
			-->
		</form>
			<ul class="bottom">
				<li id="msg" style="color: red;">${msg }</li>
			</ul>
	</div>
    <div class="cbImage agileinfo">
		<h3>注 册</h3>
		<span id="sp"></span>
		<form action="user/register" method="post" onsubmit="return checkPassword();">
			<input type="text" class="name" name="username" placeholder="用户名" required="">
			<input type="password" id="pas" class="password" name="password" placeholder="密码" required="" onfocus="emptySpan();">
			<input type="password" id="cpas" class="password" name="confirmpassword" placeholder="确认密码" required="" onfocus="emptySpan();">
			<input type="text" id="pho" class="number"  name="phoneno" placeholder="手机号" required="" onblur="checkPhoneno();" onfocus="emptySpan();" >
			<input type="submit"  value="注册">
			
		</form>
	</div>
    <div class="clear"></div>
  </div>
  <div class="clear"></div>
  <div class="footer">
  <p>zking&copy; 2018 </p>
  </div>
</section>
<script src="js/jquery-1.11.1.min.js"></script> 
<script src="js/coverflow-slideshow.js"></script>
<div style="text-align:center;">
</div>
</body>
</html>