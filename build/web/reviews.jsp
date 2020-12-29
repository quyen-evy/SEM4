<%-- 
    Document   : reviews
    Created on : Oct 1, 2020, 8:05:28 AM
    Author     : Quyen Evy
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.g5cinemamovie.model.Film"%>
<%@page import="com.g5cinemamovie.dao.FilmDAO"%>
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
<title>Cinema A Entertainment Category Flat Bootstarp Resposive Website Template | Single :: w3layouts</title>
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
		<div class="single-content">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="reviews-section">
				<h3 class="head">Movie Reviews</h3>
					<div class="col-md-9 reviews-grids">
						<div class="review">
						<% FilmDAO FiDAO=new FilmDAO();
						
						Film rs=FiDAO.FindFBId(Integer.parseInt(request.getParameter("id")));
							out.print("<div class='movie-pic'>"
								+"<a href='single.html'><img src='images/"+rs.getPicture()+"' alt='' /></a>"
							+"</div>"
							+"<div class='review-info'>"
								+"<a class='span' href='single.html'>"+rs.getNameF()+"<i></i></a>"
							
								+"<p class='info'>CAST:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getActor()+"</p>"
								+"<p class='info'>DIRECTION: &nbsp;&nbsp;&nbsp;&nbsp;"+rs.getDirector()+"</p>"
								+"<p class='info'>GENRE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; "+FiDAO.GetTypeById(rs.getTypId()).getNameType()+"</p>"
								+"<p class='info'>DURATION:&nbsp;&nbsp;&nbsp; &nbsp; "+rs.getDuration()+" minutes</p>"
                                                                +"<a class='book' href='booking.jsp'><i class='book1'></i>BOOK TICKET</a>"
							+"</div>"
							+"<div class='clearfix'></div>"
									+"</div>"
						+"<div class='story-review'>"
								+"<h4>REVIEW:</h4>"
								+"<p>"+rs.getDescription()+"</p>"
							+"</div>");%>
								
							<!-- comments-section-starts -->
	    <div class="comments-section">
	        <div class="comments-section-head">
				<div class="comments-section-head-text">
					<h3>25 Comments</h3>
				</div>
				<div class="clearfix"></div>
		    </div>
			<div class="comments-section-grids">
				<div class="comments-section-grid">
					<div class="col-md-2 comments-section-grid-image">
						<img src="images/eye-brow.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-10 comments-section-grid-text">
						<h4><a href="#">MARWA ELGENDY</a></h4>
						<label>5/4/2014 at 22:00   </label>
						<p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound but because those who do not know how to pursue pleasure rationally encounter consequences.</p>
						<span><a href="#">Reply</a></span>
						<i class="rply-arrow"></i>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="comments-section-grid comments-section-middle-grid">
					<div class="col-md-2 comments-section-grid-image">
						<img src="images/beauty.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-10 comments-section-grid-text">
						<h4><a href="#">MARWA ELGENDY</a></h4>
						<label>5/4/2014 at 22:00   </label>
						<p>But I must explain to you how all this idea denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound but because those who do not know how to pursue pleasure rationally encounter consequences.</p>
						<span><a href="#">Reply</a></span>
						<i class="rply-arrow"></i>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="comments-section-grid">
					<div class="col-md-2 comments-section-grid-image">
						<img src="images/stylish.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-10 comments-section-grid-text">
						<h4><a href="#">MARWA ELGENDY</a></h4>
						<label>5/4/2014 at 22:00   </label>
						<p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound but because those who do not know how to pursue pleasure rationally encounter consequences.</p>
						<span><a href="#">Reply</a></span>
						<i class="rply-arrow"></i>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
	    </div>
	  <!-- comments-section-ends -->
		  <div class="reply-section">
			  <div class="reply-section-head">
				  <div class="reply-section-head-text">
					  <h3>Leave Reply</h3>
				  </div>
			  </div> 
			<div class="blog-form">
			    <form>
					<input type="text" class="text" value="Enter Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Name';}">
					<input type="text" class="text" value="Enter Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Email';}">
					<input type="text" class="text" value="Subject" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Subject';}">
					<textarea></textarea>
					<input type="button" value="SUBMIT COMMENT">
			    </form>
			 </div>
		  </div>
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
		$(window).load(function() {
			
		  $("#flexiselDemo1").flexisel({
				visibleItems: 6,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: false,
				enableResponsiveBreakpoints: true,
				responsiveBreakpoints: { 
					portrait: { 
						changePoint:480,
						visibleItems: 1
					}, 
					landscape: { 
						changePoint:640,
						visibleItems: 2
					},
					tablet: { 
						changePoint:768,
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
