<%-- 
    Document   : employee
    Created on : Dec 25, 2020, 12:05:17 PM
    Author     : Quyen Evy
--%>


<%@page import="com.g5cinemamovie.model.Role"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.g5cinemamovie.dao.AdminDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
    <head>
        <title></title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Easy Admin Panel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
        <!-- Custom CSS -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <!-- Graph CSS -->
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <!-- jQuery -->
        <!-- lined-icons -->
        <link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
        <!-- //lined-icons -->
        <!-- chart -->
        <!-- //chart -->
        <!--animate-->
        <link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
        <script src="js/jquery-1.10.2.min.js"></script>

        <script src="js/wow.min.js"></script>
        <script>
            new WOW().init();
        </script>
        <!--//end-animate-->
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/Chart.js"></script>

        <script src="js/scripts.js"></script>
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <!----webfonts--->
        <link href='//fonts.googleapis.com/css?family=Cabin:400,400italic,500,500italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>
        <!---//webfonts---> 
        <!-- Meters graphs -->

        <!-- Placed js at the end of the document so the pages load faster -->

    </head> 

    <body class="sticky-header left-side-collapsed"  onload="initMap()">
        <section>
            <jsp:include page="menu.jsp"></jsp:include>
                <!-- main content start-->
                <div class="main-content">
                <jsp:include page="header.jsp"></jsp:include>
                    <div id="page-wrapper">
                        <div class="graphs">
                            <h3 class="blank1">Employee Manage</h3>
                            <div class="tab-content">
                                <div class="tab-pane active" id="horizontal-form">
                                    <form class="form-horizontal" action="/G5CinemaMovie/AddEmployeeServlet" method="post" enctype="multipart/form-data">
                                        <div class="form-group">
                                            <label for="exampleInputFile">Avatar</label>
                                            <input type="file" id="exampleInputFile" name="Picture">
                                        </div>
                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">Full name</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control1" id="focusedinput" placeholder="Full name" name="FullName">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="radio" class="col-sm-2 control-label">Gender</label>
                                            <div class="col-sm-8">
                                                <div class="radio-inline"><label><input type="radio" checked="" name="Gender" value="Male"> Male</label></div>
                                                <div class="radio-inline"><label><input type="radio" name="Gender" value="Female"> Female</label></div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">Birthday</label>
                                            <div class="col-sm-8">
                                                <input type="date" class="form-control1" id="focusedinput" placeholder="Birthday" name="Bod">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">Address</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control1" id="focusedinput" placeholder="Address" name="Address">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">Phone</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control1" id="focusedinput" placeholder="Phone" name="Phone">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">Email</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control1" id="focusedinput" placeholder="Email" name="Email">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">User name</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control1" id="focusedinput" placeholder="Username" name="Username">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">Password</label>
                                            <div class="col-sm-8">
                                                <input type="password" class="form-control1" id="focusedinput" placeholder="Password" name="Pass">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                        <%  AdminDAO AdDAO = new AdminDAO();
                                            ArrayList<Role> list = AdDAO.FindAllRole();
                                            out.print("<label for='selector1' class='col-sm-2 control-label'>Role</label>");
                                            out.print("<div class='col-sm-8'><select name='RoleId' id='selector1' class='form-control1'>");
                                            for (Role item : list) {
                                                out.print("<option value=" + item.getRoleId() + "> " + item.getNameRole() + "</option>");
                                            }
                                            out.print("</select></div>");
                                        %>
                                    </div>
                                    <div class="panel-footer">
                                        <div class="row  container-fluid">
                                            <div class="col-sm-12 col-sm-offset-2" style="">
                                                <input type="submit" value="Add new" class="btn-success btn">
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <form action="#" method="GET">
                                    <div class="input-group input-group-ind">
                                        <input type="text" name="search" class="form-control1 input-search" placeholder="Search...">
                                        <span class="input-group-btn">
                                            <button class="btn btn-success" type="submit"><i class="fa fa-search icon-ser"></i></button>
                                        </span>
                                    </div><!-- Input Group -->
                                </form><br>
                            </div>
                        </div>
                        <jsp:include page="/EmployeeAdServlet"></jsp:include>  
                        </div>
                    </div>

                </div>
            <jsp:include page="footer.jsp"></jsp:include>
        </section>
    </body>
</html>
