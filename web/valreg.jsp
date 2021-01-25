<%-- 
    Document   : valreg
    Created on : Mar 10, 2020, 12:09:49 PM
    Author     : Moazam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%   
            
            
  try {
            String uname=request.getParameter("uname");
            String pass=request.getParameter("pass");
            String cpass=request.getParameter("cpass");
            String type=request.getParameter("type");
            
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root",""); 
    
    
  PreparedStatement stmt=con.prepareStatement("INSERT INTO login(username, password, type) VALUES (?,?,?)");  
  stmt.setString(1, uname);
  stmt.setString(2, pass);
  stmt.setString(3, type);
  stmt.executeUpdate();
            response.sendRedirect("login.jsp");
 
con.close();
}

    
   
  catch(Exception e){ e.printStackTrace();
  
  response.sendRedirect("invalidpage.jsp");
  }  

  
%>

        
        <h1>Hello World!</h1>
    </body>
</html>
