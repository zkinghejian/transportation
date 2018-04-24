$(function(){
	
	// 登录js
	$("#login").click(function(){
		var phoneno = $("#login :text[name=phoneno]").val();
		var password = $("#login :password[name=password]").val();
		$.ajax({
			type:"post",
			url:"user/login",
			data:{"phoneno":phoneno,"password":password},
			success:function(msg){
				alert(user.msg);
				location.href="back/user.html";
			}
		});
	});
	
})