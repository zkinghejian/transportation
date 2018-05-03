function changeButton(id){
	// 获取每页的条数
	var pagesize = $("#selectpage").val();
	yuyuePage(1,pagesize,'null');
	$(".grid_10").each(function(i,o){
		$(o).css("display","none");
	});
	
	$(id).css("display","block");
}

// 预约申请
function yuyue(){
	var car_type = $("#yy :text[name=car_type]");

	var car_num = $("#yy :text[name=car_num]");
	var car_pro = $("#pro");
	var order_time = $("#ti");
	var uploadfile = $("#uploadfile").get(0).files[0];
	var formdata = new FormData();
	formdata.append("car_type",car_type.val());
	formdata.append("car_num",car_num.val());
	formdata.append("car_pro",car_pro.val());
	formdata.append("order_time",order_time.val().replace('T',' ')+":00");
	formdata.append("uploadfile",uploadfile);
	$.ajax({  
		url:"../user/yueyu",
		type:"post",
		data:formdata,
		async: false,    
        cache: false,   
        contentType: false, //不设置内容类型  
        processData: false, //不处理数据
		success:function(msg){
			car_type.val('');
			car_num.val('');
			car_pro.val('');
			order_time.val('');
			alert(msg);
		}
        
    }) ;
}



function yuyuePage(pageNo,pagesize,status){
	$.ajax({
		type:"post",
		url:"../order/yueyuPage",
		data:{"pageNo":pageNo,"pagesize":pagesize,"status":status},
		success:function(obj){
			var tbody = $("#yycxshow");
			tbody.empty();
			var orders = obj.results;
			for(var i=0;i<orders.length;i++){
				var tr = "<tr class='odd gradeA'>";
				tr = tr + "<td>"+orders[i].order_id+"</td>";
				tr = tr + "<td>"+orders[i].car_type+"</td>";
				tr = tr + "<td>"+orders[i].car_num+"</td>";
				tr = tr + "<td class='center'>"+orders[i].car_pro+"</td>";
				if(orders[i].order_status==0){
					tr = tr + "<td class='center'>待处理&nbsp;&nbsp;<a href='javascript:void(0)' style='color: #1B548D;' onclick=quxiao('"+orders[i].order_id+"')>取消</a></td>";
				}
				if(orders[i].order_status==1){
					tr = tr + "<td class='center'>处理中</td>";
				}
				if(orders[i].order_status==2){
					tr = tr + "<td class='center'>已处理</td>";
				}
				if(orders[i].order_status==3){
					tr = tr + "<td class='center'>已取消</td>";
				}
				tr = tr + "<td class='center'>"+timeStamp2String(orders[i].order_time)+"</td></tr>";
				tbody.append(tr);
			}
			//当前 1 页共 20 页共 100 条
			$("#yuyue_info1").html("当前 <span id='pageNo'>"+obj.pageNo+"<span> 页共 "+obj.totalPage+" 页共 "+obj.totalRecord+" 条");
		    
			var str = "<a href='javascript:void(0)' style='color: #1B548D;' onclick=page('pre','"+obj.totalPage+"')>上一页</a>&nbsp;&nbsp;";
        	str = str + "<a href='javascript:void(0)' style='color: #1B548D;' onclick=page('next','"+obj.totalPage+"')>下一页</a>";
        	str = str + "<input type='text' size='1' name='page'  />";
        	str = str + "<a href='javascript:void(0)' style='color: #1B548D;' onclick=page('defind','"+obj.totalPage+"')>跳转</a>";
        	$("#yuyue_info2").html(str);
		}
	});
}

function page(flag,totalpage,status){
	// 获取当前页
	var page = parseInt($("#pageNo").text());
	totalpage= parseInt(totalpage);
	
	// 获取总页数
	if(flag=='next'){
		page=page+1;
		if(page>totalpage){
			page = totalpage;
		}
	}
	if(flag=='pre'){
		page=page-1;
		if(page<1){
			page=1;
		}
	}
	if(flag=='defind'){
		page = $(":text[name=page]").val();
		if(page>totalpage){
			page = totalpage;
		}
		if(page<1){
			page=1;
		}
	}
	if(flag=='o'){
		page = 1;
	}
	// 获取每页的条数
	var pagesize = $("#selectpage").val();
	// 获取当前状态
	var status = $("#selectStatus").val();
	
	yuyuePage(page,pagesize,status);
	
}

function timeStamp2String (time){
    var datetime = new Date();
     datetime.setTime(time);
     var year = datetime.getFullYear();
     var month = datetime.getMonth() + 1;
     var date = datetime.getDate();
     var hour = datetime.getHours();
     var minute = datetime.getMinutes();
     //var second = datetime.getSeconds();
     //var mseconds = datetime.getMilliseconds();
     return year + "-" + month + "-" + date+" "+hour+":"+minute;//+":"+second+"."+mseconds;
}

// 取消订单
function quxiao(orderId){
	$.ajax({
		type:"post",
		url:"../order/quxiao",
		data:{"orderId":orderId},
		success:function(msg){
			// 获取每页的条数
			var pagesize = $("#selectpage").val();
			if(msg=='success'){
				yuyuePage(1,pagesize,'0');
			}
		}
	});
}



