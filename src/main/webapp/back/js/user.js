function changeButton(id){
	$(".grid_10").each(function(i,o){
		$(o).css("display","none");
	});
	
	$(id).css("display","block");
}

// 预约申请
function yuyue(){
	var car_type = $("#yy :text[name=car_type]").val();
	alert(car_type);

	var car_num = $("#yy :text[name=car_num]").val();
	var car_pro = $("#pro").val();
	var order_time = $("#ti").val();
	var uploadfile = $("#uploadfile").get(0).files[0];
	var formdata = new FormData();
	formdata.append("car_type",car_type);
	formdata.append("car_num",car_num);
	formdata.append("car_pro",car_pro);
	formdata.append("order_time",order_time);
	formdata.append("uploadfile",uploadfile);
	alert(formdata);
	$.ajax({  
		url:"../user/yueyu",
		type:"post",
		data:formdata,
		async: false,    
        cache: false,   
        contentType: false, //不设置内容类型  
        processData: false, //不处理数据
		success:function(msg){
			alert(msg);
		}
        
    }) ;
    
}
