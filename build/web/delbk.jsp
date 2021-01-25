<%-- 
    Document   : admin
    Created on : Mar 9, 2020, 8:40:38 PM
    Author     : Moazam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Book Store</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="theme-color" content="#03a6f3">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800,900" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/styles.css">
</head>
<style type="text/css">
    
     .center{
       
        margin: auto;
        padding: 10px;
     
         text-align: center;
    }
    .img{
       
         width: 100%;
        height: 700px;
    }
    .gray-btn{
         
            background-color: #3e3e15;
    }


.label{
color: white;
}

.table td, .table th {
    padding: .75rem;
    vertical-align: top;
    border-top: 3px solid brown;
}

</style>
<body>
    <header>
       
        <div class="main-menu">
            <div class="container">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <a class="navbar-brand" href="index.jsp"><h1>My Book Store</h1></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto">
                            <li class="navbar-item active">
                                <a href="index.jsp" class="nav-link">Home</a>
                            </li>
                            <li class="navbar-item">
                                <a href="shop.jsp" class="nav-link">Orders</a>
                            </li>
                           <li class="navbar-item">
                                <a href="books.jsp" class="nav-link">Books</a>
                            </li>
                            <li class="navbar-item">
                                <a href="login.jsp" class="nav-link">Log out</a>
                            </li>
                        </ul>
                        
                    </div>
                </nav>
            </div>
        </div>
    </header>
    <div class="breadcrumb">
        <div class="container">
            <a class="breadcrumb-item" href="index.jsp">Home</a>
            <span class="breadcrumb-item active">Admin</span>
        </div>
    </div>



 <section class="static about-sec">
        <div class="container">
            <h1>Delete Books</h1>
            <p> </p>
           
           <div class="img"> 
               <form action="valdel.jsp">
               <table class="table">
<tr>
<th scope="col">Title</th>
<th scope="col">Author</th>
<th scope="col"> Price</th>
<th scope="col">Edit</th>
</tr>
<%   
           
            
           
  try {
    
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root",""); 
    
    
  PreparedStatement stmt=con.prepareStatement("select * from book ");  
  
  ResultSet rs=stmt.executeQuery();  
while(rs.next()) 
{
    
%>
     <tr>
    <td value="<%=rs.getString("title")%>" name="title"><%=rs.getString("title")%></td>
    <td value="<%=rs.getString("author")%>" name="author"><%=rs.getString("author")%></td>
    <td value="<%=rs.getInt("price")%>" name="price"><%=rs.getInt("price")%></td>
    <td> <input type="submit" class="btn btn-info" value="<%=rs.getInt("bid")%>" name="delid"></td>
  </tr>           

<%

 }

con.close();
  }
  catch(Exception e){ e.printStackTrace();
    }  
%>
   </table>
   </form>
</div>
        </div>
    </section>


     <footer>
    <div class="container">
         
                <div class="row" style="text-align: center;">
              <div class="col-md-6">
                  <div class="address">
                        <h4>Our Address</h4>
                        <h6>My BookStore, 4th Store
                        Beside that building,Pune</h6>
                        <h6>Call : +91 9730602871</h6>
                        <h6>Email : info@Mybookstore.com</h6>
                    </div>
              </div>
                    <div class="col-md-6">
                    <div class="timing">
                        <h4>Timing</h4>
                        <h6>Mon - Fri: 7am - 10pm</h6>
                        <h6>​​Saturday: 8am - 10pm</h6>
                        <h6>​Sunday: 8am - 11pm</h6>
                    </div>
                </div>
                </div>
 
            
          
        </div>
        <div class="copy-right">
            <div class="container">
                <div class="row">
                 
                    <div class="col-md-6">
                        <div class="share align-middle">
                            <span class="fb"><i class="fa fa-facebook-official"></i></span>
                            <span class="instagram"><i class="fa fa-instagram"></i></span>
                            <span class="twitter"><i class="fa fa-twitter"></i></span>
                            <span class="pinterest"><i class="fa fa-pinterest"></i></span>
                            <span class="google"><i class="fa fa-google-plus"></i></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/owl.carousel.min.js"></script>
    <script src="js/custom.js"></script>
</body>

</html>
