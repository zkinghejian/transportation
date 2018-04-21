function changeButton(id){
	$(".grid_10").each(function(i,o){
		$(o).css("display","none");
	});
	
	$(id).css("display","block");
}