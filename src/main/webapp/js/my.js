$(function(){
	$("input").click(function(){
		$("#msg").empty();
	});
	
	
	// 主页面联系我们提交信息
	$("#indexinfo :submit").click(function(){
		var username = $("#indexinfo :text[name=username]").val();
		var email = $("#indexinfo input[name=email]").val();
		var phoneno = $("#indexinfo :text[name=phoneno]").val();
		var problem = $("#indexinfo textarea").val();
		
		$.ajax({
			type:"post",
			url:"user/indexInfo",
			data:{"username":username,"email":email,"phoneno":phoneno,"problem":problem},
			success:function(msg){
				$("#indexinfo :text[name=username]").val('');
				$("#indexinfo input[name=email]").val('');
				$("#indexinfo :text[name=phoneno]").val('');
				$("#indexinfo textarea").val('');
				alert(msg);
			}
		});
		
	});
	
})


function checkPassword(){
	var pas = $("#pas").val();
	var cpas = $("#cpas").val();
	if(pas!=cpas){
		$("#sp").text("两次密码输入不一致").css("color","red").css("font-size","6px");
		return false;
	}
	return true;
}

function emptySpan(){
	$("#sp").empty();
}

// 检查手机号
function checkPhoneno(){
	var phoneno = $("#pho").val();
	$.ajax({
		type:"post",
		url:"user/checkPhoneno",
		data:{"phoneno":phoneno},
		success:function(msg){
			var span = $("#sp").empty();
			span.text(msg).css("color","red").css("font-size","6px");
		}
	});
}


