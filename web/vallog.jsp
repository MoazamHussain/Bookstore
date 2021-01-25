<%-- 
    Document   : vallog
    Created on : Mar 10, 2020, 12:23:56 PM
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
            String uname=request.getParameter("uname");
            String pass=request.getParameter("pass");
            String type=request.getParameter("type");
            
           
  try {
    
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root",""); 
    
    
  PreparedStatement stmt=con.prepareStatement("select username,password,type from login where username=? and password=? and type=?");  
  stmt.setString(1, uname);
  stmt.setString(2, pass);
  stmt.setString(3, type);
  ResultSet rs=stmt.executeQuery();  
if(rs.next()) 
{
if (type.equals("Admin")) {
            response.sendRedirect("admin.jsp");
        }

//else if(type.equals("Customer"))
//{
//    response.sendRedirect("cust.jsp");
//    
//}
else
{
    response.sendRedirect("cust.jsp");
}

}  
else
{
response.sendRedirect("invalidpage.jsp");    
}

con.close();

  }
  catch(Exception e){ e.printStackTrace();
  response.sendRedirect("invalidpage.jsp");
    }  

  
%>
        <h1>Hello World!</h1>
    </body>
</html>
