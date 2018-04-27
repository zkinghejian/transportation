<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	function test(){
		var b = $("button").text();
		alert(b);
		var formdata = new FormData();
		formdata.append("uploadfile","kjl");
		$.ajax({
			url:"user/yueyu",
			type:"post",
			data:formdata,
			async: false,    
	        cache: false,   
	        contentType: false, //不设置内容类型  
	        processData: false, //不处理数据
			success:function(msg){
				alert(msg);
			}
		});
	}
</script>
</head>
<body>
	<button onclick="test();">test</button>
</body>
</html>