<%-- 
    Document   : header
    Created on : Sep 30, 2020, 9:34:43 AM
    Author     : Quyen Evy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <div class="top-header">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo.png" alt="" /></a>
					<p>Movie Theater</p>
				</div>
				
				<div class="search">
					
					<form>
						<input type="text" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}"/>
						<input type="submit" value="">
					</form>
					
				</div>
				<div class="clearfix"></div>
			</div>
</html>
