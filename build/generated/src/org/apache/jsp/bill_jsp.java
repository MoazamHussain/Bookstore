package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>Billing</title>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core CSS -->\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  body{\n");
      out.write("      background: url(\"b4.jpeg\");\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("      background-size: 100% 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write(".btn.btn-round {\n");
      out.write("    border-radius: 30px;\n");
      out.write("    width: 200px;\n");
      out.write("}\n");
      out.write(".btn.btn-fab.btn-round {\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write(".btn-primary {\n");
      out.write("    color: #fff;\n");
      out.write("    background-color: #72d0c3;\n");
      out.write("    border-color: #007bff;\n");
      out.write("}.col-sm{\n");
      out.write("  border-style: groove;\n");
      out.write("  margin: 6px 3px 0px 0px;\n");
      out.write("    padding: 9px;\n");
      out.write("    text-align: center;\n");
      out.write("}.invoice-title h2, .invoice-title h3 {\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table > tbody > tr > .no-line {\n");
      out.write("    border-top: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table > thead > tr > .no-line {\n");
      out.write("    border-bottom: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table > tbody > tr > .thick-line {\n");
      out.write("    border-top: 2px solid;\n");
      out.write("}</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark static-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\" >Bill</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"login.jsp\">Home\n");
      out.write("              <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"card\">\n");
      out.write("                          ");
   
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
 

      out.write("\n");
      out.write("<div class=\"card-header\">\n");
      out.write("Invoice\n");
      out.write("<strong>");
      out.print(rs.getInt("o.oid"));
      out.write("</strong> \n");
      out.write("  <span class=\"float-right\"> <strong>Status:</strong> Pending</span>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"card-body\">\n");
      out.write("<div class=\"row mb-4\">\n");
      out.write("<!--<div class=\"col-sm-6\">\n");
      out.write("<h6 class=\"mb-3\">From:</h6>\n");
      out.write("<div>\n");
      out.write("<strong>Service Center</strong>\n");
      out.write("</div>\n");
      out.write("<div>Address : Kondhwa</div>\n");
      out.write("<div>City : Pune</div>\n");
      out.write("<div>Email : vms@gmail.com</div>\n");
      out.write("<div>Phone : 9798281233</div>\n");
      out.write("</div>-->\n");
      out.write("\n");
      out.write("<div class=\"col-sm-6\">\n");
      out.write("<h6 class=\"mb-3\">To:</h6>\n");
      out.write("<div>\n");
      out.write("<strong>");
      out.print(rs.getString("o.cname"));
      out.write("</strong>\n");
      out.write("</div>\n");
      out.write("<div>Address : ");
      out.print(rs.getString("o.addr"));
      out.write("</div>\n");
      out.write("<div>PinCode : ");
      out.print(rs.getInt("o.pin"));
      out.write(" ,City : ");
      out.print(rs.getString("o.city"));
      out.write("</div>\n");
      out.write("<div>Email : ");
      out.print(rs.getString("o.emailid"));
      out.write("</div>\n");
      out.write("<div>Phone : ");
      out.print(rs.getString("o.mobile"));
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("<div class=\"col-lg-4 col-sm-5 ml-auto\">\n");
      out.write("<table class=\"table table-clear\">\n");
      out.write("<tbody>\n");
      out.write("<tr>\n");
      out.write("<td class=\"left\">\n");
      out.write("<strong>Subtotal</strong>\n");
      out.write("</td>\n");
      out.write("<td class=\"right\">");
      out.print(rs.getInt("b.price"));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" ");
   }                          

con.close();
  }
  catch(Exception e){ e.printStackTrace();
  out.println(e);
    }  

  

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("   \n");
      out.write("<!--<a href=\"home.jsp\" class=\"btn btn-sm btn-primary\" role=\"button\" style=\"width: 65%\">Send</a>-->\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<script src=\"vendor/jquery/jquery.slim.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("  \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
