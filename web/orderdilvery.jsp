


<%-- 
    Document   : servicesr
    Created on : Feb 26, 2020, 8:33:19 PM
    Author     : Moazam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Delivery</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

</head>
<style type="text/css">
  
    body{
      background: url("v1.jpeg");
      background-repeat: no-repeat;
      background-size: 100% 100%;
    }

.btn.btn-round {
    border-radius: 30px;
    width: 200px;
}
.btn.btn-fab.btn-round {
    border-radius: 50%;
}
.btn-primary {
    color: #fff;
    background-color: #72d0c3;
    border-color: #007bff;
}.col-sm{
  border-style: groove;
  margin: 6px 3px 0px 0px;
    padding: 9px;
    text-align: center;
}</style>
<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
      <a class="navbar-brand" href="#" >Delivery Details</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="login.jsp">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          
        </ul>
      </div>
    </div>
  </nav>
<div class="container" style="text-align: center;">
  <h1 ><font color="white">Book Delivery Details </font></h1>
      

<%
String id=request.getParameter("bkid");
session.setAttribute("user", id);

%>
          <form class="form-sample" action="valdetails.jsp">
                      <h5 class="card-description" style="font-weight: 600">  </h5>
                      <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label"><font color="white">Customer Name</font></label>
                            <div class="col-sm-9">
                              <input type="text" name="cname" autocomplete="off" maxlength="22" class="form-control" />
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label"><font color="white">Mobile</font></label>
                            <div class="col-sm-9">
                              <input type="text" name="mobile" autocomplete="off" maxlength="10" class="form-control" placeholder="" />
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label"><font color="white">Email</font></label>
                         <div class="col-sm-9">
                             <input type="email" name="emailid" autocomplete="off" maxlength="25" class="form-control" placeholder="" />
                          </div>
                        </div>
                      </div>
</div>

                         <div class="row">
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label"><font color="white">Payment Type</font></label>
                            <div class="col-sm-9">
                              <select name="payment" class="form-control">
                                    <option value="Cash">Cash</option>
                                    <option value="Online">Online</option>
                              </select>
                            </div>
                          </div>
                        </div>
                       
                      </div>
                      
                      <div class="row">
                        
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label"><font color="white">Order Date</font></label>
                            <div class="col-sm-9">
                              <input type="date" name="odate" autocomplete="off" maxlength="20" class="form-control" />
                            </div>
                          </div>
                        </div>
                      </div>
                      
                        <h6 class="card-description" style="font-weight: 100px"><font color="white"> Address </font></h6><br>
                        <br>
                       <div class="row">
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label"><font color="white">Address</font></label>
                            <div class="col-sm-9">
                              <input type="text" name="addr" autocomplete="off" maxlength="20" class="form-control" />
                            </div>
                          </div>
                        </div>
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label"><font color="white">PinCode</font></label>
                            <div class="col-sm-9">
                            <input type="text" name="pin" autocomplete="off" maxlength="6" class="form-control" />
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="row">
<!--                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label">Address Line 2:</label>
                            <div class="col-sm-9">
                              <input type="text" class="form-control" />
                            </div>
                          </div>
                        </div>-->
                        <div class="col-md-6">
                          <div class="form-group row">
                            <label class="col-sm-3 col-form-label"><font color="white">City</font></label>
                            <div class="col-sm-9">
                            <input type="text" name="city" autocomplete="off" maxlength="15" class="form-control" />
                            </div>
                          </div>
                        </div>
                      </div>
                        
                        <br>
                        <input type="submit" value="Confirm Order"class="btn btn-success" ><br>
                      <br>
                    </form>
</body>
<script src="vendor/jquery/jquery.slim.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</html>

  <!-- Bootstrap core JavaScript -->
  
