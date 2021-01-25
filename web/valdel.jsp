<%-- 
    Document   : valdel
    Created on : Mar 10, 2020, 5:56:12 PM
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
            String id=request.getParameter("delid");
            
            int bid;
             bid=Integer.parseInt(id);
            
           
  try {
    out.println(bid);
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root",""); 
    
    
  PreparedStatement stmt=con.prepareStatement("DELETE FROM book WHERE bid =?");  
  stmt.setInt(1, bid);
  
  stmt.executeUpdate();
             
response.sendRedirect("delsuccess.jsp");
con.close();
  }
  catch(Exception e){ e.printStackTrace();
  out.println(e);
  response.sendRedirect("invalidpage.jsp");
    }  

  
%>
        
        <h1>Hello World!</h1>
    </body>
</html>
