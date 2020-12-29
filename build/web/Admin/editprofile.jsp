<%-- 
    Document   : editprofile
    Created on : Dec 25, 2020, 9:08:44 PM
    Author     : Quyen Evy
--%>

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
                            <h3 class="blank1">Update profile</h3>
                            <div class="tab-content">
                                <div class="tab-pane active" id="horizontal-form">
                                    <form class="form-horizontal" action="" method="post" enctype="multipart/form-data">
                                         <!--
                                        int id = Integer.parseInt(request.getParameter("id"));
                                        FilmDAO filDAO = new FilmDAO();
                                        Film rs = filDAO.FindProduct(id);
                                    -->  
                                     <div class="form-group">
                                        <label for="exampleInputFile">Avatar</label>
                                        <br>
                                        <input type="file" id="exampleInputFile" name="Picture">
                                        <br>
                                        <img src='/G5CinemaMovie/images/' width="100px" style=""/>
                                    </div>
                                     <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Fullname</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='' name="Fullname">
                                            <input type='hidden' name="id" value='' />
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Birthday</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='' name="Birthday">
                                            <input type='hidden' name="id" value='' />
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Address</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='' name="Address">
                                            <input type='hidden' name="id" value='' />
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Phone</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='' name="Phone">
                                            <input type='hidden' name="id" value='' />
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Email</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='' name="Email">
                                            <input type='hidden' name="id" value='' />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Username</label>
                                        <div class="col-sm-8">
                                            <input type="text" class="form-control1" id="focusedinput" value='' name="Username" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Password</label>
                                        <div class="col-sm-8">
                                            <input type="password" class="form-control1" id="focusedinput" value=""name="Password">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="focusedinput" class="col-sm-2 control-label">Retype password</label>
                                        <div class="col-sm-8">
                                            <input type="password" class="form-control1" id="focusedinput" value='' name="Password">
                                        </div>
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
