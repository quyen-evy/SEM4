<%-- 
    Document   : updatepro
    Created on : Oct 17, 2020, 10:48:45 AM
    Author     : Quyen Evy
--%>

<%@page import="com.g5cinemamovie.model.Film"%>
<%@page import="com.g5cinemamovie.dao.FilmDAO"%>
<%@page import="com.g5cinemamovie.model.TypeFilm"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.g5cinemamovie.dao.AdminDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <!-- Placed js at the end of the document so the pages load faster -->

    </head> 
    <body class="sticky-header left-side-collapsed"  onload="initMap()">
        <section>

            <jsp:include page="menu.jsp"></jsp:include>
                <!-- main content start-->
                <div class="main-content main-content4">
                <jsp:include page="header.jsp"></jsp:include>
                    <div id="page-wrapper">
                        <div class="graphs">
                            <h3 class="blank1">Update Movie</h3>
                            <div class="tab-content">
                                <div class="tab-pane active" id="horizontal-form">
                                    <form class="form-horizontal" action="/G5CinemaMovie/UpdateProServlet1" method="post" enctype="multipart/form-data">
                                    <%
                                        int id = Integer.parseInt(request.getParameter("id"));
                                        FilmDAO filDAO = new FilmDAO();
                                        Film rs = filDAO.FindProduct(id);
                                    %>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Movie name</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getNameF());%>' name="NameF" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Country</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value="<%out.print(rs.getCountry());%>"name="Country">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <%  AdminDAO AdDAO = new AdminDAO();
                                            ArrayList<TypeFilm> list = AdDAO.FindAllType();
                                            out.print("<label for='selector1' class='col-sm-2 control-label'>Type</label>");
                                            out.print("<div class='col-sm-8'><select name='TypId' id='selector1' class='form-control1'>");
                                            for (TypeFilm item : list) {
                                                if (item.getTypeId() == (rs.getTypId())) {
                                                    out.print("<option value=" + item.getTypeId() + " selected=\"selected\"> " + item.getNameType() + "</option>");
                                                } else {
                                                    out.print("<option value=" + item.getTypeId() + "> " + item.getNameType() + "</option>");
                                                }
                                            }
                                            out.print("</select></div>");

                                        %>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Director</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getDirector());%>' name="Director">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Actor</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getActor());%>' name="Actor">
                                            <input type='hidden' name="id" value='<%out.print(rs.getFilId());%>' />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Duration</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getDuration());%>' name="Duration">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Description</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='<%out.print(rs.getDescription());%>' name="Description">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputFile">File input</label>
                                        <br>
                                        <input type="file" id="exampleInputFile" name="Picture">
                                        <br>
                                        <img src='/G5CinemaMovie/images/<%out.print(rs.getPicture());%>' width="100px" style=""/>
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
