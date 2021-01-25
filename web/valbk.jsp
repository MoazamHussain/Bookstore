<%-- 
    Document   : valbk
    Created on : Mar 10, 2020, 5:06:45 PM
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
            String t=request.getParameter("title");
            String a=request.getParameter("author");
            String p=request.getParameter("price");
            int pr=Integer.parseInt(p);
            
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root",""); 
    
    
  PreparedStatement stmt=con.prepareStatement("INSERT INTO book(title, author, price) VALUES (?,?,?)");  
  stmt.setString(1, t);
  stmt.setString(2, a);
  stmt.setInt(3, pr);
  stmt.executeUpdate();
            response.sendRedirect("addsuccess.jsp");
 
con.close();
}

    
   
  catch(Exception e){ e.printStackTrace();
  
  response.sendRedirect("invalidpage.jsp");
  }  

  
%>
        <h1>Hello World!</h1>
    </body>
</html>
