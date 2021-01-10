<%-- 
    Document   : tables
    Created on : Oct 7, 2020, 9:06:10 AM
    Author     : Quyen Evy
--%>

<%@page import="com.g5cinemamovie.dao.AdminDAO"%>
<%@page import="com.g5cinemamovie.model.TypeFilm"%>
<%@page import="java.util.ArrayList"%>
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
                            <h3 class="blank1">Search Result</h3>
                        <jsp:include page="/SearchServlet"></jsp:include> 
                        </div>
                    </div>
                </div>
            <jsp:include page="footer.jsp"></jsp:include>
        </section>
    </body>
</html>
