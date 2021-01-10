<%-- 
    Document   : header
    Created on : Oct 7, 2020, 9:04:29 AM
    Author     : Quyen Evy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <!-- left side start-->
		<div class="left-side sticky-left-side">
			<!--logo and iconic logo start-->
			<div class="logo">
				<h1><a href="tables.jsp">Easy <span>Admin</span></a></h1>
			</div>
                        
			<div class="logo-icon text-center">
                            <a href="tables.jsp"><i class="lnr lnr-home"></i> </a>
			</div>

			<!--logo and iconic logo end-->
			<div class="left-side-inner">
				<!--sidebar nav start-->
                                
					<ul class="nav nav-pills nav-stacked custom-nav">
                                            <li class="active"><a href="statistic.jsp"><i class="lnr lnr-power-switch"></i><span>Statistic</span></a></li>
						<li class="menu-list">
							<a href="#"><i class="lnr lnr-cog"></i>
								<span>Manage</span></a>
								<ul class="sub-menu-list">
                                                                
									<li><a href="tables.jsp">Movie</a> </li>
                                                                        <li><a href="showtimes_manage.jsp">Showtimes</a></li>
									<li><a href="employees.jsp">Employees</a></li>
                                                                        <li><a href="customers.jsp">Members</a></li>
                                                                        <li><a href="sellingticket.jsp">Payment</a></li>
								</ul>
						</li>
					</ul>
				<!--sidebar nav end-->
			</div>
		</div>
    
    <!-- left side end-->
    
</html>
