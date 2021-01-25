<%-- 
    Document   : valdetails
    Created on : Mar 12, 2020, 5:37:56 PM
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
            try
            {
        String i=(String)session.getAttribute("user");
        int id=Integer.parseInt(i);
        String n=request.getParameter("cname");
        String m=request.getParameter("mobile");
        String e=request.getParameter("emailid");
        String p=request.getParameter("payment");
        String od=request.getParameter("odate");
        String a=request.getParameter("addr");
        String pin=request.getParameter("pin");
        String c=request.getParameter("city");
        
        Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root",""); 
    
    
  PreparedStatement stmt=con.prepareStatement("INSERT INTO `order`(bid,cname,mobile,emailid,payment,odate,addr,pin,city) VALUES (?,?,?,?,?,?,?,?,?)");  
  stmt.setInt(1, id);
  stmt.setString(2, n);
  stmt.setString(3, m);
  stmt.setString(4, e);
  stmt.setString(5, p);
  stmt.setString(6, od);
  stmt.setString(7, a);
  stmt.setString(8, pin);
  stmt.setString(9, c);
  stmt.executeUpdate();
            response.sendRedirect("osuccess.jsp");
 
con.close();
        
        
            }
            
            catch(Exception e)
            {
                out.println(e);
                //response.sendRedirect("invalidpage.jsp");
                e.printStackTrace();
            }
        
        
        %>
        
        <h1>Hello World!</h1>
    </body>
</html>
