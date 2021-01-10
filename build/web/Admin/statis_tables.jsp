<%-- 
    Document   : statis_tables
    Created on : Dec 25, 2020, 12:55:49 PM
    Author     : Quyen Evy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <script src="js/jquery-1.10.2.min.js"></script>
 <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-md-12 inbox_right">
            <form action="#" method="GET">
                <div class="input-group input-group-ind">
                    <input type="text" name="search" class="form-control1 input-search" placeholder="Search...">
                    <span class="input-group-btn">
                        <button class="btn btn-success" type="submit"><i class="fa fa-search icon-ser"></i></button>
                    </span>
                </div><!-- Input Group -->
            </form>
            <div class="mailbox-content">
                <div class="mail-toolbar clearfix">
                    <div class="float-left">
                       
                        <div class="dropdown">
                            <a href="#" title="" class="btn btn-default" data-toggle="dropdown" aria-expanded="false">
                                <i class="fa fa-cog icon_8"></i>
                                <i class="fa fa-chevron-down icon_8"></i>
                                <div class="ripple-wrapper"></div></a>
                            <ul class="dropdown-menu float-right">
                                <li>
                                    <a href="#" title="">
                                        <i class="fa fa-pencil-square-o icon_9"></i>
                                        Edit
                                    </a>
                                </li>
                                <li>
                                    <a href="#" title="">
                                        <i class="fa fa-calendar icon_9"></i>
                                        Schedule
                                    </a>
                                </li>
                                <li>
                                    <a href="#" title="">
                                        <i class="fa fa-download icon_9"></i>
                                        Download
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="#" class="font-red" title="">
                                        <i class="fa fa-times" icon_9=""></i>
                                        Delete
                                    </a>
                                </li>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="float-right">


                      
                        <div class="btn-group">
                            <a class="btn btn-default"><i class="fa fa-angle-left"></i></a>
                            <a class="btn btn-default"><i class="fa fa-angle-right"></i></a>
                        </div>


                    </div>
                </div>
               <div class="bs-example4" data-example-id="simple-responsive-table">
						<div class="table-responsive">
						  <table class="table">
							<thead>
							  <tr>
								<th>#</th>
								<th>Table heading</th>
								<th>Table heading</th>
								<th>Table heading</th>
								<th>Table heading</th>
								<th>Table heading</th>
								<th>Table heading</th>
							  </tr>
							</thead>
							<tbody>
							  <tr>
								<th scope="row">1</th>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
							  </tr>
							  <tr>
								<th scope="row">2</th>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
							  </tr>
							  <tr>
								<th scope="row">3</th>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
								<td>Table cell</td>
							  </tr>
							</tbody>
						  </table>
						</div><!-- /.table-responsive -->
						
						</div>
            </div>
        </div>
        <div class="clearfix"> </div>
    </body>
</html>
