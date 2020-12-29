<%-- 
    Document   : index
    Created on : Sep 30, 2020, 9:26:05 AM
    Author     : Quyen Evy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cinema A Entertainment Category Flat Bootstrap Responsive Website Template</title>
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

                    <div class="header">
                    <jsp:include page="header.jsp"></jsp:include>
                        <div class="header-info">
                            <h1>WONDER WOMAN</h1>
                            <p class="age"><a href="#">C13</a> Patty Jenkins</p>
                            <p class="review">Rating	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;  9/10</p>
                            <p class="review reviewgo">Genre	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : &nbsp;&nbsp; Action, Mythology</p>
                            <p class="review">Release &nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp; 18 December 2020</p>
                           <p class="special">Set in 1984, 66 years after the events of World War I (1918) in the first film, Wonder Woman reunites with her seemingly deceased lover Steve Trevor, while facing two new enemies.</p>
                            <a class="video" href="#"><i class="video1"></i>WATCH TRAILER</a>
                       
                          <%
                            if (session.getAttribute("CUS") == null) {
                                out.print(" <a class='book' href='login.jsp'><i class='book1'></i>BOOK TICKET</a>");
                            } else {
                                //response.sendRedirect("booking.jsp");
                            }%>    
                           
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
                                            visibleItems: 4
                                        }
                                    }
                                });
                            });
                        </script>
                        <script type="text/javascript" src="js/jquery.flexisel.js"></script>	
                    </div>
                    <div class="video">
                        <iframe width="560" height="315" src="https://www.youtube.com/embed/xOsLIiBStEs" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                    <div class="news">
                        <div class="col-md-6 news-left-grid">
                            <h3>Don’t be late,</h3>
                            <h2>Book your ticket now!</h2>
                            <h4>Easy, simple & fast.</h4>
                           
                          <%
                            if (session.getAttribute("CUS") == null) {
                                out.print("<a href='login.jsp'><i class='book'></i>BOOK TICKET</a>");
                            } else {
                               response.sendRedirect("films.jsp");
                            }
                        %>   
                        <p>Get Discount up to <strong>10%</strong> if you are a member!</p>
                    </div>
                    <div class="clearfix"></div>
                </div>


                <div class="more-reviews">
                    <ul id="flexiselDemo2">
                        <li><img src="images/m1.jpg" alt=""/></li>
                        <li><img src="images/m2.jpg" alt=""/></li>
                        <li><img src="images/m3.jpg" alt=""/></li>
                        <li><img src="images/m4.jpg" alt=""/></li>
                    </ul>
                    <script type="text/javascript">
                        $(window).load(function () {

                            $("#flexiselDemo2").flexisel({
                                visibleItems: 4,
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
        </div>
        <div class="clearfix"></div>
    </body>
</html>
