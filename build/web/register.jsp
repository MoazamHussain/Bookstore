<%-- 
    Document   : register
    Created on : Mar 9, 2020, 8:39:17 PM
    Author     : Moazam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

<body>
    <header>
        <div class="header-top">
            <div class="container">
                <div class="row">
                    <div class="col-md-3"><a href="#" class="web-url">MyBookStore.com</a></div>
                    <div class="col-md-6">
                        <h5>Free Shipping Over Rs.99 + 3 Free Samples With Every Order</h5></div>
                    <div class="col-md-3">
                        <span class="ph-number">Call :+91 9730602871</span>
                    </div>
                </div>
            </div>
        </div>
        <div class="main-menu">
            <div class="container">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <a class="navbar-brand" href="index.html"><h1>My Book Store</h1></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto">
                            <li class="navbar-item active">
                                <a href="index.html" class="nav-link">Home</a>
                            </li>
<!--                            <li class="navbar-item">
                                <a href="shop.html" class="nav-link">Shop</a>
                            </li>-->
                          
                            <li class="navbar-item">
                                <a href="login.html" class="nav-link">Login</a>
                            </li>
                        </ul>
                        
                    </div>
                </nav>
            </div>
        </div>
    </header>
    <div class="breadcrumb">
        <div class="container">
            <a class="breadcrumb-item" href="index.html">Home</a>
            <span class="breadcrumb-item active">Register</span>
        </div>
    </div>
    <section class="static about-sec">
        <div class="container">
            <h1>My Account / Register</h1>
            <p></p>
            <div class="form">
                <form action="valreg.jsp">
                    <div class="row">
                        <div class="col-md-4">
                            <input placeholder="Enter User Name" name="uname" required>
                            <span class="required-star">*</span>
                        </div>
                        <div class="col-md-4">
                            <input type="text" placeholder="Enter Password" name="pass" required>
                            <span class="required-star">*</span>
                        </div>
                        <div class="col-md-4">
                            <input type="text" placeholder="Confirm Password" name="cpass" required>
                            <span class="required-star">*</span>
                        </div>
                        <div class="col-md-4">
                            <input type="text" name="type" value="Customer" name="type" required readonly>
                            <span class="required-star">*</span>
                        </div>
                       
                        <div class="col-lg-8 col-md-12">
                            <br><br><br><br><br>
                            <button class="btn black">Register</button>
                            <h5>not Registered? <a href="login.jsp">Login here</a></h5>
                        </div>
                    </div>
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