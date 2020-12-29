<%-- 
    Document   : reviews
    Created on : Sep 30, 2020, 10:00:44 AM
    Author     : Quyen Evy
--%>
<%@page import="com.g5cinemamovie.dao.FilmDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.g5cinemamovie.model.Film"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <head>
        <title>Cinema A Entertainment Category Flat Bootstrap Responsive Website Template | Reviews :: w3layouts</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- Custom Theme files -->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!-- Custom Theme files -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Cinema Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--webfont-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <!-- header-section-starts -->
        <div class="full">
            <jsp:include page="menu.jsp"></jsp:include>
                <div class="main">
                    <div class="review-content">
                    <jsp:include page="header.jsp"></jsp:include>
                        <div class="reviews-section">
                            <h3 class="head">Movie</h3>
                            <div class="col-md-9 reviews-grids">
                            <%FilmDAO filmDAO = new FilmDAO();
                                ArrayList<Film> list = filmDAO.FindAll();
                                for (Film item : list) {
                                    out.print("<div class='review'>"
                                            + "<div class='movie-pic'>"
                                            + "<a href=reviews.jsp?id=" + item.getFilId() + "><img src='images/" + item.getPicture() + "' alt='' /></a>"
                                            + "</div>"
                                            + "<div class='review-info'>"
                                            + "<a class='span' href='reviews.jsp?id=" + item.getFilId() + "'>" + item.getNameF() + "  <i></i></a>"
                                            + "<p class='dirctr'><a href=''>" + item.getDescription() + "</p>"
                                            + "<p class='info'>CAST:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + item.getActor() + "</p>"
                                            + "<p class='info'>DIRECTION: &nbsp;&nbsp;&nbsp;&nbsp;" + item.getDirector() + "</p>"
                                            + "<p class='info'>GENRE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; " + filmDAO.GetTypeById(item.getTypId()).getNameType() + "</p>"
                                            + "<p class='info'>DURATION:&nbsp;&nbsp;&nbsp; &nbsp; " + item.getDuration() + " minutes</p>"
                                            + "</div>"
                                            + "<div class='clearfix'></div>"
                                            + "</div>");

                                }
                            %>
                        </div>




                        <div class="col-md-3 side-bar">

                            <div class="entertainment">
                                <h3>Featured Today in Entertainment</h3>
                                <%FilmDAO filmsDAO = new FilmDAO();
                                    ArrayList<Film> list1 = filmsDAO.FindAll();
                                    for (Film item : list1) {
                                        out.print("<ul>"
                                                + "<li class='ent'>"
                                                + "<a href=reviews.jsp?id=" + item.getFilId() + "><img src='images/" + item.getPicture() + "' alt='' /></a>"
                                                + "</li>"
                                                + "<li>"
                                                + "<a href='single.html'>" + item.getNameF() + "</a>"
                                                + "</li>"
                                                + "<div class='clearfix'></div>"
                                                                         + "</ul>");
                                                             }%>


                            </div>


                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
                <div class="review-slider">
                    <ul id="flexiselDemo1">
                        <li><img src="images/r1.jpg" alt=""/></li>
                        <li><img src="images/r2.jpg" alt=""/></li>
                        <li><img src="images/r3.jpg" alt=""/></li>
                        <li><img src="images/r4.jpg" alt=""/></li>
                        <li><img src="images/r5.jpg" alt=""/></li>
                        <li><img src="images/r6.jpg" alt=""/></li>
                    </ul>
                    <script type="text/javascript">
                        $(window).load(function () {

                            $("#flexiselDemo1").flexisel({
                                visibleItems: 6,
                                animationSpeed: 1000,
                                autoPlay: true,
                                autoPlaySpeed: 3000,
                                pauseOnHover: false,
                                enableResponsiveBreakpoints: true,
                                responsiveBreakpoints: {
                                    portrait: {
                                        changePoint: 480,
                                        visibleItems: 2
                                    },
                                    landscape: {
                                        changePoint: 640,
                                        visibleItems: 3
                                    },
                                    tablet: {
                                        changePoint: 768,
                                        visibleItems: 3
                                    }
                                }
                            });
                        });
                    </script>
                    <script type="text/javascript" src="js/jquery.flexisel.js"></script>	
                </div>		
                <jsp:include page="footer.jsp"></jsp:include>	
            </div>
            <div class="clearfix"></div>
        </div>
    </body>
</html>
