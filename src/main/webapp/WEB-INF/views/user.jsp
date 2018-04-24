<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>越野汽修</title>
    <link rel="shortcut icon" href="../ico/yueye.ico" type="image/x-icon" />
   <link rel="stylesheet" type="text/css" href="../back/css/reset.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="../back/css/text.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="../back/css/grid.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="../back/css/layout.css" media="screen" />
    <link rel="stylesheet" type="text/css" href="../back/css/nav.css" media="screen" />
    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css" media="screen" /><![endif]-->
    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="css/ie.css" media="screen" /><![endif]-->
    <!-- BEGIN: load jquery -->
    <script src="../back/js/jquery-1.6.4.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="../back/js/jquery-ui/jquery.ui.core.min.js"></script>
    <script src="../back/js/jquery-ui/jquery.ui.widget.min.js" type="text/javascript"></script>
    <script src="../back/js/jquery-ui/jquery.ui.accordion.min.js" type="text/javascript"></script>
    <script src="../back/js/jquery-ui/jquery.effects.core.min.js" type="text/javascript"></script>
    <script src="../back/js/jquery-ui/jquery.effects.slide.min.js" type="text/javascript"></script>
    <script src="../back/js/table/jquery.dataTables.min.js" type="text/javascript"></script>
    <!-- END: load jquery -->
    <script type="text/javascript" src="js/table/table.js"></script>
    <!-- BEGIN: load jqplot -->
    <link href="../back/css/table/demo_page.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="../back/css/jquery.jqplot.min.css" />
    <!--[if lt IE 9]><script language="javascript" type="text/javascript" src="js/jqPlot/excanvas.min.js"></script><![endif]-->
    <script language="javascript" type="text/javascript" src="../back/js/jqPlot/jquery.jqplot.min.js"></script>
    <script type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.canvasTextRenderer.min.js"></script>
    <script type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.canvasAxisLabelRenderer.min.js"></script>
    <script language="javascript" type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.barRenderer.min.js"></script>
    <script language="javascript" type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.pieRenderer.min.js"></script>
    <script language="javascript" type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.categoryAxisRenderer.min.js"></script>
    <script language="javascript" type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.highlighter.min.js"></script>
    <script language="javascript" type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.pointLabels.min.js"></script>
    <script type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.donutRenderer.min.js"></script>
    <script type="text/javascript" src="../back/js/jqPlot/plugins/jqplot.bubbleRenderer.min.js"></script>
    <!-- END: load jqplot -->
    <script type="text/javascript" src="../back/js/table/table.js"></script>
    <script src="../back/js/setup.js" type="text/javascript"></script>
    <script src="../back/js/user.js" type="text/javascript"></script>
  <script type="text/javascript">

        $(document).ready(function () {
            setupLeftMenu();

          			setSidebarHeight();


        });
    </script>

</head>
<body>
	<div class="container_12">
        
        <div class="grid_12 header-repeat">
            <div id="branding">
                <div class="floatleft">
                    <!--  
                    <img src="img/logo.png" alt="Logo" />
                    -->
                    <span style="font-size: 35px;color: white;">越野汽修</span>
                    </div>
                <div class="floatright">
                    <div class="floatleft">
                        <img src="../back/img/img-profile.jpg" alt="Profile Pic" /></div>
                    <div class="floatleft marginleft10">
                        <ul class="inline-ul floatleft">
                            <li>你好 ${user.username}</li>
                            <!--  
                            <li><a href="#">Config</a></li>
                            -->
                            <li><a href="../user/logout">退出</a></li>
                        </ul>
                        <br />
                        <span class="small grey">最后登录: ${user.lastLoginTime}</span>
                    </div>
                </div>
                <div class="clear">
                </div>
            </div>
        </div>
        
        <div class="clear">
        </div>
        
        <div class="grid_2">
            <div class="box sidemenu">
                <div class="block" id="section-menu">
                    <ul class="section menu">
                        <li><a class="menuitem">预约</a>
                            <ul class="submenu">
                                <li><a href="javascript:void(0)" onclick="changeButton('#yysq')">预约申请</a> </li>
                                <li><a href="javascript:void(0)" onclick="changeButton('#yycx')">预约查询</a> </li>
                                <!--  
                                <li><a class="active">Submenu 3</a> </li>
                                <li><a>Submenu 4</a> </li>
                                <li><a>Submenu 5</a> </li>
                                -->
                            </ul>
                        </li>
                        <li><a class="menuitem">打印发票</a>
                            <ul class="submenu">
                                <li><a href="javascript:void(0)" onclick="changeButton('#ywcyy')">已完成预约</a> </li>
                                <!--  
                                <li><a>Submenu 2</a> </li>
                                <li><a>Submenu 3</a> </li>
                                <li><a>Submenu 4</a> </li>
                                <li><a>Submenu 5</a> </li>
                                -->
                            </ul>
                        </li>
         
                    </ul>
                </div>
            </div>
        </div>
        
        <div class="grid_10" style="display: block;" >
        	<div class="box round">
                <h2>亲爱的会员您好：</h2>
                <div class="block">
                    <p class="start">
                        <img src="../back/img/vertical.jpg" alt="Ginger" class="right" />Lorem Ipsum is simply dummy
                        text of the printing and typesetting industry. Lorem Ipsum has been the industry's
                        standard dummy text ever since the 1500s, when an unknown printer took a galley
                        of type and scrambled it to make a type specimen book. It has survived not only
                        five centuries, but also the leap into electronic typesetting, remaining essentially
                        unchanged. It was popularised in the 1960s with the release of Letraset sheets containing
                        Lorem Ipsum passages, and more recently with desktop publishing software like Aldus
                        PageMaker including versions of Lorem Ipsum.</p>
                    <p>
                        It is a long established fact that a reader will be distracted by the readable content
                        of a page when looking at its layout. The point of using Lorem Ipsum is that it
                        has a more-or-less normal distribution of letters, as opposed to using 'Content
                        here, content here', making it look like readable English. Many desktop publishing
                        packages and web page editors now use Lorem Ipsum as their default model text, and
                        a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various
                        versions have evolved over the years, sometimes by accident, sometimes on purpose
                        (injected humour and the like).</p>
                </div>
            </div>
        </div>
        
        <div id="yysq" class="grid_10" style="display: none;">
            <div class="box round">
                <h2>预约申请</h2>
                <div class="block ">
                    <form action="#" method="post" enctype="application/x-www-form-urlencoded">
                    <table class="form">
                        <tr>
                            <td class="col1">
                                <label>车型</label>
                            </td>
                            <td class="col2">
                                <input type="text" id="grumble" name="car_type" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>车牌</label>
                            </td>
                            <td>
                                <input type="text" class="grumble" name="car_num"/>
                            </td>
                        </tr>
                        <tr>
                            <td style="vertical-align: top; padding-top: 9px;">
                                <label>车况问题</label>
                            </td>
                            <td>
                                <textarea class="tinymce" name="car_pro" cols="70" rows="4"></textarea>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label>预约时间</label>
                            </td>
                            <td>
                                <input type="datetime-local" name="order_time" />
                            </td>
                        </tr>
                       
                        <tr>
                            <td>
                                <label>问题图片</label>
                            </td>
                            <td>
                                <input class="btn btn-teal" type="file" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label></label>
                            </td>
                            <td>
                                <input class="btn btn-teal"  type="submit" value="预      约" />
                            </td>
                        </tr>
                    </table>
                    </form>
                </div>
            </div>
        </div>
        
        <div id="yycx" class="grid_10" style="display: none;">
        	<div class="box round">
                <h2>预约查询</h2>
                <div class="block">
                    
                    <div class="dataTables_wrapper" id="example_wrapper">
                    	<div id="example_length" class="dataTables_length">
							<label>每页显示 
								<select size="1" name="example_length">
									<option value="10" selected="selected">5</option>
									<option value="25">15</option><option value="50">10</option>
									<option value="100">20</option>
								</select> 
							条</label>
						</div>
						<div class="dataTables_filter" id="example_filter">
							<label>搜索: <input type="text" /> </label>
						</div>
		                <table class="data display datatable" id="example">
							<thead>
								<tr>
									<th class="sorting_desc" rowspan="1" colspan="1" style="width: 197px;">Rendering engine</th>
									<th class="sorting" rowspan="1" colspan="1" style="width: 249px;">Browser</th>
									<th class="sorting" rowspan="1" colspan="1" style="width: 235px;">Platform(s)</th>
									<th class="sorting" rowspan="1" colspan="1" style="width: 165px;">Engine version</th>
									<th class="sorting" rowspan="1" colspan="1" style="width: 119px;">CSS grade</th>
								</tr>
							</thead>
							<tbody>
								<tr class="odd gradeX">
									<td>Trident</td>
									<td>Internet
										 Explorer 4.0</td>
									<td>Win 95+</td>
									<td class="center"> 4</td>
									<td class="center">X</td>
								</tr>
								<tr class="even gradeC">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.0</td>
									<td>Win 95+</td>
									<td class="center">5</td>
									<td class="center">C</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
							</tbody>
						</table>
                    	<div class="dataTables_info" id="example_info">当前 1 页共 20 页共 100 条</div>
                        <div class="dataTables_page" id="example_info">
                        	<a href="javascript:void(0)" style="color: #1B548D;">上一页</a>
                        	<a href="javascript:void(0)" style="color: #1B548D;">下一页</a>
                        	<input type="text" size="1" name="page"  />
                        	<a href="javascript:void(0)" style="color: #1B548D;">跳转</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <div id="ywcyy" class="grid_10" style="display: none;">
        	<div class="box round">
                <h2>已完成预约</h2>
                <div class="block">
                    
                    <div class="dataTables_wrapper" id="example_wrapper">
                    	<div id="example_length" class="dataTables_length">
							<label>每页显示 
								<select size="1" name="example_length">
									<option value="10" selected="selected">5</option>
									<option value="25">15</option><option value="50">10</option>
									<option value="100">20</option>
								</select> 
							条</label>
						</div>
						<div class="dataTables_filter" id="example_filter">
							<label>搜索: <input type="text" /> </label>
						</div>
		                <table class="data display datatable" id="example">
							<thead>
								<tr>
									<th class="sorting_desc" rowspan="1" colspan="1" style="width: 197px;">Rendering engine</th>
									<th class="sorting" rowspan="1" colspan="1" style="width: 249px;">Browser</th>
									<th class="sorting" rowspan="1" colspan="1" style="width: 235px;">Platform(s)</th>
									<th class="sorting" rowspan="1" colspan="1" style="width: 165px;">Engine version</th>
									<th class="sorting" rowspan="1" colspan="1" style="width: 119px;">CSS grade</th>
								</tr>
							</thead>
							<tbody>
								<tr class="odd gradeX">
									<td>Trident</td>
									<td>Internet
										 Explorer 4.0</td>
									<td>Win 95+</td>
									<td class="center"> 4</td>
									<td class="center">X</td>
								</tr>
								<tr class="even gradeC">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.0</td>
									<td>Win 95+</td>
									<td class="center">5</td>
									<td class="center">C</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
								<tr class="odd gradeA">
									<td>Trident</td>
									<td>Internet
										 Explorer 5.5</td>
									<td>Win 95+</td>
									<td class="center">5.5</td>
									<td class="center">A</td>
								</tr>
							</tbody>
						</table>
                    	<div class="dataTables_info" id="example_info">当前 1 页共 20 页共 100 条</div>
                        <div class="dataTables_page" id="example_info">
                        	<a href="javascript:void(0)" style="color: #1B548D;">上一页</a>
                        	<a href="javascript:void(0)" style="color: #1B548D;">下一页</a>
                        	<input type="text" size="1" name="page"  />
                        	<a href="javascript:void(0)" style="color: #1B548D;">跳转</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="clear">
        </div>
    </div>
    
    
    
    <div class="clear">
    </div>
    <div id="site_info">
        <p>
            Zking &copy; <a href="#">Zking</a>
        </p>
    </div>
    
</body>
</html>