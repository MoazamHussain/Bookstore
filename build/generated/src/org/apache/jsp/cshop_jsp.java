package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class cshop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Book Store</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"theme-color\" content=\"#03a6f3\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\"><a href=\"index.jsp\" class=\"web-url\">MyBookStore.com</a></div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <h5>Free Shipping Over Rs.99 + 3 Free Samples With Every Order</h5></div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <span class=\"ph-number\">Call :+91 9730602871</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-menu\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\"><h1>My Book Store</h1></a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"navbar-item active\">\n");
      out.write("                                <a href=\"index.jsp\" class=\"nav-link\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"navbar-item\">\n");
      out.write("                                <a href=\"shop.jsp\" class=\"nav-link\">Shop</a>\n");
      out.write("                            </li>\n");
      out.write("                          \n");
      out.write("                            <li class=\"navbar-item\">\n");
      out.write("                                <a href=\"login.jsp\" class=\"nav-link\">Login</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"breadcrumb\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"breadcrumb-item\" href=\"index.jsp\">Home</a>\n");
      out.write("            <span class=\"breadcrumb-item active\">Shop</span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <section class=\"static about-sec\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("   \n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"recent-book-sec\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <form action=\"deliver.jsp\">\n");
      out.write("                            \n");
      out.write("                             ");
   
           
            
           
  try {
    
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root",""); 
    
    
  PreparedStatement stmt=con.prepareStatement("select * from book ");  
  
  ResultSet rs=stmt.executeQuery();  
while(rs.next()) 
{
    

      out.write("\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                     \n");
      out.write("                            <h3><input type=\"text\" value=\"");
      out.print(rs.getString("title"));
      out.write("\" name=\"t\"></h3><br>\n");
      out.write("                            <h3><input type=\"text\" value=\"");
      out.print(rs.getString("author"));
      out.write("\" name=\"a\"></h3>\n");
      out.write("                            <h6><input type=\"text\" value=\"");
      out.print(rs.getInt("price"));
      out.write("\" name=\"p\"></h6>\n");
      out.write("                            <input type=\"submit\" value=\"");
      out.print(rs.getInt("bid"));
      out.write("\" name=\"id\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        ");

}
  }
  catch(Exception e)
  {
      e.printStackTrace();
  }
  
      out.write("\n");
      out.write("\n");
      out.write("  </form>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("         \n");
      out.write("                <div class=\"row\" style=\"text-align: center;\">\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"address\">\n");
      out.write("                        <h4>Our Address</h4>\n");
      out.write("                        <h6>My BookStore, 4th Store\n");
      out.write("                        Beside that building,Pune</h6>\n");
      out.write("                        <h6>Call : +91 9730602871</h6>\n");
      out.write("                        <h6>Email : info@Mybookstore.com</h6>\n");
      out.write("                    </div>\n");
      out.write("              </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"timing\">\n");
      out.write("                        <h4>Timing</h4>\n");
      out.write("                        <h6>Mon - Fri: 7am - 10pm</h6>\n");
      out.write("                        <h6>​​Saturday: 8am - 10pm</h6>\n");
      out.write("                        <h6>​Sunday: 8am - 11pm</h6>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write(" \n");
      out.write("            \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <div class=\"copy-right\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                 \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"share align-middle\">\n");
      out.write("                            <span class=\"fb\"><i class=\"fa fa-facebook-official\"></i></span>\n");
      out.write("                            <span class=\"instagram\"><i class=\"fa fa-instagram\"></i></span>\n");
      out.write("                            <span class=\"twitter\"><i class=\"fa fa-twitter\"></i></span>\n");
      out.write("                            <span class=\"pinterest\"><i class=\"fa fa-pinterest\"></i></span>\n");
      out.write("                            <span class=\"google\"><i class=\"fa fa-google-plus\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
