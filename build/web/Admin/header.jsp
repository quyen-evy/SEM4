<%-- 
    Document   : header
    Created on : Oct 7, 2020, 9:09:03 AM
    Author     : Quyen Evy
--%>
<%@page import="com.g5cinemamovie.dao.AdminDAO"%>
<%@page import="com.g5cinemamovie.model.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <!-- header-starts -->
    <div class="header-section">
        <!--toggle button start-->
        <a class="toggle-btn  menu-collapsed"><i class="fa fa-bars"></i></a>
        <!--toggle button end-->

        <!--notification menu start -->
        <div class="menu-right">
            <div class="user-panel-top">  	
                <div class="profile_details">		
                    <ul>
                        <li class="dropdown profile_details_drop">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                <div class="profile_img">	
                                    <% if (session.getAttribute("USER") == null)
                                            out.print("<div class='user-name'>"
                                                    + "<p>Login</span></p>"
                                                    + "</div>");
                                        else {
                                            AdminDAO adDAO = new AdminDAO();
                                            Admin rs = new Admin();
                                            String user = (String) session.getAttribute("USER");
                                            String pass = (String) session.getAttribute("PASS");
                                            rs = adDAO.FindCustomerByUserPass(user, pass);
                                            out.print(""
                                                    + "<div class='user-name'>"
                                                    + "<p>" + rs.getFullName() + "<span>Administrator</span></p>"
                                                    + "</div>"
                                                    + "<i class='lnr lnr-chevron-down'></i>"
                                                    + "<i class='lnr lnr-chevron-up'></i>"
                                                    + "<div class='clearfix'></div>");
                                        }
                                    %>
                                </div>	
                            </a>
                            <ul class="dropdown-menu drp-mnu">
                                <li> <a href="#"><i class="fa fa-cog"></i> Settings</a> </li> 
                                <li> <a href="editprofile.jsp"><i class="fa fa-user"></i>Profile</a> </li> 
                                <li> <a href="login.jsp"><i class="fa fa-sign-out"></i> Logout</a> </li>
                            </ul>
                        </li>
                        <div class="clearfix"> </div>
                    </ul>
                </div>		

                <div class="clearfix"></div>
            </div>
        </div>
        <!--notification menu end -->
    </div>
    <!-- //header-ends -->
    <script src="js/jquery-1.10.2.min.js"></script>
 <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        
        
</html>
