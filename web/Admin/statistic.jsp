<%-- 
    Document   : statistic
    Created on : Dec 25, 2020, 12:18:50 PM
    Author     : Quyen Evy
--%>

<!DOCTYPE HTML>
<html>
    <head>
        <title>Easy Admin Panel an Admin Panel Category Flat Bootstrap Responsive Website Template | Charts :: w3layouts</title>
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
            <!-- left side start-->
            <jsp:include page="menu.jsp"></jsp:include>
                <!-- left side end-->

                <!-- main content start-->
                <div class="main-content main-content5">
                    <!-- header-starts -->
                <jsp:include page="header.jsp"></jsp:include>
                    <!-- //header-ends -->
                    <div id="page-wrapper">
                        <div class="graphs">
                            <div class="widgets_top">
                                <div class="col_3">
                                    <div class="col-md-3 widget widget1">
                                        <div class="r3_counter_box">
                                            <i class="fa fa-mail-forward"></i>
                                            <div class="stats">
                                                <h5>45 <span>%</span></h5>
                                                <div class="grow">
                                                    <p>Growth</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3 widget widget1">
                                        <div class="r3_counter_box">
                                            <i class="fa fa-users"></i>
                                            <div class="stats">
                                                <h5>50 <span>%</span></h5>
                                                <div class="grow grow1">
                                                    <p>New Users</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3 widget widget1">
                                        <div class="r3_counter_box">
                                            <i class="fa fa-eye"></i>
                                            <div class="stats">
                                                <h5>70 <span>%</span></h5>
                                                <div class="grow grow3">
                                                    <p>Visitors</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3 widget">
                                        <div class="r3_counter_box">
                                            <i class="fa fa-usd"></i>
                                            <div class="stats">
                                                <h5>70 <span>%</span></h5>
                                                <div class="grow grow2">
                                                    <p>Profit</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="clearfix"> </div>
                                </div>
                            </div>
                            <div class="widget_middle">
                                <div class="col-md-4 widget_middle_left">
                                    <div class="widget_middle_left_slider">
                                        <div class="main-grid1-grids">
                                            <div class="friday">
                                                <h4>Friday<span>December, 25th</span></h4>
                                            </div>
                                            <div class="friday-bottom">
                                                <h5>32<sup class="degree">0</sup></h5>
                                                <p>Ho Chi Minh,Viet Nam.</p>
                                            </div>
                                        </div>
                                        <div class="flexi_bottom">
                                            <ul id="flexiselDemo3">
                                                <li>
                                                    <div class="biseller-column">
                                                        <p>Monday</p>
                                                        <a class="lightbox" href="#">
                                                            <i class="lnr lnr-sun"></i>
                                                        </a> 
                                                        <p>30<sup class="degree">0</sup></p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="biseller-column">
                                                        <p>Tuesday</p>
                                                        <a class="lightbox" href="#">
                                                            <i class="lnr lnr-moon"></i>
                                                        </a> 
                                                        <p>28<sup class="degree">0</sup></p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="biseller-column">
                                                        <p>Wednesday</p>
                                                        <a class="lightbox" href="#">
                                                            <i class="lnr lnr-cloud"></i>
                                                        </a> 
                                                        <p>32<sup class="degree">0</sup></p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="biseller-column">
                                                        <p>Thursday</p>
                                                        <a class="lightbox" href="#">
                                                            <i class="lnr lnr-poop"></i>
                                                        </a> 
                                                        <p>31<sup class="degree">0</sup></p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="biseller-column">
                                                        <p>Monday</p>
                                                        <a class="lightbox" href="#">
                                                            <i class="lnr lnr-sun"></i>
                                                        </a> 
                                                        <p>27<sup class="degree">0</sup></p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="biseller-column">
                                                        <p>Tuesday</p>
                                                        <a class="lightbox" href="#">
                                                            <i class="lnr lnr-moon"></i>
                                                        </a> 
                                                        <p>27<sup class="degree">0</sup></p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="biseller-column">
                                                        <p>Wednesday</p>
                                                        <a class="lightbox" href="#">
                                                            <i class="lnr lnr-cloud"></i>
                                                        </a> 
                                                        <p>30<sup class="degree">0</sup></p>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="biseller-column">
                                                        <p>Thursday</p>
                                                        <a class="lightbox" href="#">
                                                            <i class="lnr lnr-poop"></i>
                                                        </a> 
                                                        <p>31<sup class="degree">0</sup></p>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-8 widget_middle_left grid_2 grid_2_bot">

                                    <div class="grid_1">
                                        <h4>Pie</h4>
                                        <div class="legend">
                                            <div id="os-Win-lbl">Chrome <span>100%</span></div>
                                            <div id="os-Mac-lbl">Internet Explorer <span> 50%</span></div>
                                            <div id="os-Other-lbl">Safari<span>30%</span></div>
                                        </div>

                                        <canvas id="pie" height="315" width="470" style="width: 470px; height: 315px;"></canvas>
                                        <script>
                                            var pieData = [
                                                {
                                                    value: 30,
                                                    color: "#ef553a"
                                                },
                                                {
                                                    value: 50,
                                                    color: "#00aced"
                                                },
                                                {
                                                    value: 100,
                                                    color: "#8BC34A"
                                                }

                                            ];
                                            new Chart(document.getElementById("pie").getContext("2d")).Pie(pieData);
                                        </script>

                                    </div>	
                                </div>

                                <div class="clearfix"> </div>
                                <script type="text/javascript">
                                    $(window).load(function () {
                                        $("#flexiselDemo3").flexisel({
                                            visibleItems: 4,
                                            animationSpeed: 1000,
                                            autoPlay: true,
                                            autoPlaySpeed: 3000,
                                            pauseOnHover: true,
                                            enableResponsiveBreakpoints: true,
                                            responsiveBreakpoints: {
                                                portrait: {
                                                    changePoint: 480,
                                                    visibleItems: 3
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
                        <jsp:include page="statis_tables.jsp"></jsp:include>
                        </div>
                    </div>
                </div>
            </div>
            <!--footer section start-->
        <jsp:include page="footer.jsp"></jsp:include>
        <!--footer section end-->
    </section>

    <script src="js/jquery.nicescroll.js"></script>
    <script src="js/scripts.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
