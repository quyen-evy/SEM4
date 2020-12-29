<%-- 
    Document   : editprofile_cus
    Created on : Dec 26, 2020, 10:08:27 AM
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
		<div class="contact-content">
			<jsp:include page="header.jsp"></jsp:include>
			<!---Login-->
<div class="main-contact">
		<h3 class="head">EDIT PROFILE MEMBER</h3>
			<p>Edit your information you need to change</p>
			<br/>
		 <div class="contact-form ">
                        <form action="#" method="post">
				 <div class="col-md-6 contact-left">
                                     <div class="form-group">
                                        <label for="exampleInputFile">Avatar</label>
                                        <br>
                                        <input type="file" id="exampleInputFile" name="Picture">
                                        <br>
                                        <img src='/G5CinemaMovie/images/' width="100px" style=""/>
                                    </div>
                                     <input type="text" placeholder="Full name" name="name" required/>
				     <input type="text" placeholder="Birthday"name="dob" required/>
				     <input type="text" placeholder="Address"name="address" required/>
				     <input type="text" placeholder="Phone" name="phone" required/>
				     <input type="text" placeholder="E-mail" name="email" required/>
                                      
				  </div>
                             <div class="col-md-6 contact-right">
                                     
                                      <input type="text" placeholder="User name"  name="username" required/>
                                     <input type="password" placeholder="Password"  name="password" required/>
                                      <input type="password" placeholder="Retype password"  name="password" required/>
                                     <div class="">
                                      <input type="submit" value="LOGIN"/> 
				 </div>
				  </div>
				  
				 <div class="clearfix"></div>
			 </form>
		 </div>
		 
		
		 <div class="clearfix"></div>
		 <div class="contact_info">
			 <h3>Find Us Here</h3>
			 <div class="map">
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3919.1219355600374!2d106.67715491365516!3d10.801971961678172!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x317528d9cd1360cf%3A0xed39cd2b28cf5bbb!2zNDQwIE5ndXnhu4VuIEtp4buHbSwgUGjGsOG7nW5nIDMsIFBow7ogTmh14bqtbiwgVGjDoG5oIHBo4buRIEjhu5MgQ2jDrSBNaW5oLCBWaWV0bmFt!5e0!3m2!1sen!2s!4v1608712476978!5m2!1sen!2s" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe><br><small><a href="https://goo.gl/maps/99PqAFbwd1fEJ1PJ8" style="color:#000;text-align:left;font-size:12px">View Larger Map</a></small>
			</div>
	 </div>
</div>
	 <jsp:include page="footer.jsp"></jsp:include>
	</div>
	<div class="clearfix"></div>
	</div>
</body>
</html>
