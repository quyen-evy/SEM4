<%-- 
    Document   : customers
    Created on : Dec 25, 2020, 9:40:31 PM
    Author     : Quyen Evy
--%>

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
                            <h3 class="blank1">Member Manage</h3>
                            <div class="tab-content">
                                <div class="tab-pane active" id="horizontal-form">
                                    <form class="form-horizontal" action="/G5CinemaMovie/AddCusAdServlet" method="post" enctype="multipart/form-data">

                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">Fullname</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control1" id="focusedinput" value='' name="Fullname">
                                                <input type='hidden' name="id" value='' />
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
                                                <input type="date" class="form-control1" id="focusedinput" value='' name="Bod">
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
                                                <input type="number" class="form-control1" id="focusedinput" value='' name="Phone">
                                                <input type='hidden' name="id" value='' />
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="focusedinput" class="col-sm-2 control-label">Credit card</label>
                                            <div class="col-sm-8">
                                                <input type="number" class="form-control1" id="focusedinput" value='' name="CreditCard">
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
                        </form> <br/>
                            
                                </div>
                        </div>
                               <jsp:include page="/CustomerAdServlet"></jsp:include>
                    </div>
                  
                    </div>
                </div>
            <jsp:include page="footer.jsp"></jsp:include>
        </section>
    </body>
</html>
