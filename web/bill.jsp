<%-- 
    Document   : bill
    Created on : Feb 26, 2020, 8:31:28 PM
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

  <title>Billing</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

</head>
<style type="text/css">
  body{
      background: url("b4.jpeg");
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
}.invoice-title h2, .invoice-title h3 {
    display: inline-block;
}

.table > tbody > tr > .no-line {
    border-top: none;
}

.table > thead > tr > .no-line {
    border-bottom: none;
}

.table > tbody > tr > .thick-line {
    border-top: 2px solid;
}</style>
<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
      <a class="navbar-brand" href="#" >Bill</a>
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
  <br>
  <br>
  <br>
<div class="container">
  <div class="card">
                          <%   
                              String r1=request.getParameter("bkid");
                              int r=Integer.parseInt(r1);
                              //out.println(r);
            
  try {
    
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root",""); 
    
    //out.println(r);
  PreparedStatement stmt=con.prepareStatement("select o.oid,o.cname,o.addr,o.pin,o.city,o.emailid,o.mobile,b.price from `order` o,book b where o.oid=? and o.bid=b.bid");
  stmt.setInt(1, r);
  //stmt.setInt(2, r);
  //out.println(r);
  ResultSet rs=stmt.executeQuery();  
  //out.println(r);
if(rs.next()) 
{
 
%>
<div class="card-header">
Invoice
<strong><%=rs.getInt("o.oid")%></strong> 
  <span class="float-right"> <strong>Status:</strong> Pending</span>

</div>
<div class="card-body">
<div class="row mb-4">
<!--<div class="col-sm-6">
<h6 class="mb-3">From:</h6>
<div>
<strong>Service Center</strong>
</div>
<div>Address : Kondhwa</div>
<div>City : Pune</div>
<div>Email : vms@gmail.com</div>
<div>Phone : 9798281233</div>
</div>-->

<div class="col-sm-6">
<h6 class="mb-3">To:</h6>
<div>
<strong><%=rs.getString("o.cname")%></strong>
</div>
<div>Address : <%=rs.getString("o.addr")%></div>
<div>PinCode : <%=rs.getInt("o.pin")%> ,City : <%=rs.getString("o.city")%></div>
<div>Email : <%=rs.getString("o.emailid")%></div>
<div>Phone : <%=rs.getString("o.mobile")%></div>
</div>
        

</div>

<div class="row">

<div class="col-lg-4 col-sm-5 ml-auto">
<table class="table table-clear">
<tbody>
<tr>
<td class="left">
<strong>Subtotal</strong>
</td>
<td class="right"><%=rs.getInt("b.price")%></td>
</tr>
 <%   }                          

con.close();
  }
  catch(Exception e){ e.printStackTrace();
  out.println(e);
    }  

  
%>


</tbody>
</table>
   
<!--<a href="home.jsp" class="btn btn-sm btn-primary" role="button" style="width: 65%">Send</a>-->
   
</div>

</div>

</div>
</div>
</div>
</body>
<script src="vendor/jquery/jquery.slim.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</html>

  <!-- Bootstrap core JavaScript -->
  
