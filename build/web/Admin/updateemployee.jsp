<%-- 
    Document   : editprofile
    Created on : Dec 25, 2020, 9:08:44 PM
    Author     : Quyen Evy
--%>

<%@page import="com.g5cinemamovie.model.Role"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.g5cinemamovie.model.Admin"%>
<%@page import="com.g5cinemamovie.dao.AdminDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Easy Admin Panel an Admin Panel Category Flat Bootstrap Responsive Website Template | Tables :: w3layouts</title>
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
        <script src="js/Chart.js"></script>
        <!-- //chart -->
        <!--animate-->
        <link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
        <script src="js/wow.min.js"></script>
        <script>
            new WOW().init();
        </script>
        <!--//end-animate-->
        <!----webfonts--->
        <link href='//fonts.googleapis.com/css?family=Cabin:400,400italic,500,500italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>
        <!---//webfonts---> 
        <!-- Meters graphs -->
        <script src="js/jquery-1.10.2.min.js"></script>
    </head> 
    <body class="sticky-header left-side-collapsed"  onload="initMap()">
        <section>

            <jsp:include page="menu.jsp"></jsp:include>
                <!-- main content start-->
                <div class="main-content main-content4">
                <jsp:include page="header.jsp"></jsp:include>
                    <div id="page-wrapper">
                        <div class="graphs">
                            <h3 class="blank1">Update employee</h3>
                            <div class="tab-content">
                                <div class="tab-pane active" id="horizontal-form">
                                    <form class="form-horizontal" action="/G5CinemaMovie/UpdateEmployeeServlet" method="post" enctype="multipart/form-data">
                                    <%
                                        int id = Integer.parseInt(request.getParameter("AdId"));
                                        AdminDAO adDAO = new AdminDAO();
                                        Admin rs = adDAO.FindAdmin(id);
                                    %>
                                  
                                    <div class="form-group">
                                        <label for="exampleInputFile">Avatar</label>
                                        <br>
                                        <input type='hidden' name="AdId" value='<%out.print(rs.getAdmId());%>' />
                                        <input type="file" id="exampleInputFile" name="Picture">
                                        <br>
                                        <img src='/G5CinemaMovie/Admin/images/<%out.print(rs.getAvata());%>' width="100px" style=""/>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Full name</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getFullName());%>' name="FullName">
                                        </div>
                                    </div>
                                         <div class="form-group">
                                            <label for="radio" class="col-sm-2 control-label">Gender</label>
                                            <div class="col-sm-8">
                                                <% 
                                                if(rs.getGender().equals("Male")){
                                                    out.print("<div class='radio-inline'><label><input type='radio' checked='' name='Gender' value='Male'> Male</label></div>");
                                                    out.print("<div class='radio-inline'><label><input type='radio' name='Gender' value='Female'> Female</label></div>");
                                                }   
                                                else{
                                                    out.print("<div class='radio-inline'><label><input type='radio' name='Gender' value='Male'> Male</label></div>");
                                                    out.print("<div class='radio-inline'><label><input type='radio' checked='' name='Gender' value='Female'> Female</label></div>");
                                                }
                                                %>
                                            </div>
                                        </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Birthday</label>
                                        <div class="col-sm-8">
                                            <input type="date" class="form-control1" id="focusedinput" value='<%out.print(rs.getBod());%>' name="Bod">

                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Address</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getAddress());%>' name="Address">

                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Phone</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getPhone());%>' name="Phone">
                                          
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Email</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getEmail());%>' name="Email">
                                            
                                        </div>
                                    </div>
                                             <div class="form-group">
                                     <%  AdminDAO AdDAO = new AdminDAO();
                                            ArrayList<Role> list = AdDAO.FindAllRole();
                                            out.print("<label for='selector1' class='col-sm-2 control-label'>Role</label>");
                                            out.print("<div class='col-sm-8'><select name='RoleId' id='selector1' class='form-control1'>");
                                            for (Role item : list) {
                                                if (item.getRoleId()== (rs.getRoleId())) {
                                                    out.print("<option value=" + item.getRoleId() + " selected=\"selected\"> " + item.getNameRole()+ "</option>");
                                                } else {
                                                    out.print("<option value=" + item.getRoleId() + "> " + item.getNameRole()+ "</option>");
                                                }
                                            }
                                            out.print("</select></div>");

                                        %>
                                             </div>
                                    <div class="panel-footer">
                                        <div class="row  container-fluid">
                                            <div class="col-sm-12 col-sm-offset-2" style="">
                                                <input type="submit" value="Update" class="btn-success btn">
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <jsp:include page="footer.jsp"></jsp:include>
        </section>
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
