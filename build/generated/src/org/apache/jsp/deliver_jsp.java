package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class deliver_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Delivery</title>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core CSS -->\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  \n");
      out.write("    body{\n");
      out.write("      background: url(\"v1.jpeg\");\n");
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
      out.write("}</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark static-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\" >Delivery Details</a>\n");
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
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("<div class=\"container\" style=\"text-align: center;\">\n");
      out.write("  <h1 ><font color=\"white\">Book Delivery Details </font></h1>\n");
      out.write("      \n");
      out.write("\n");

String id=request.getParameter("bkid");
session.setAttribute("user", id);


      out.write("\n");
      out.write("          <form class=\"form-sample\" action=\"valdetails.jsp\">\n");
      out.write("                      <h5 class=\"card-description\" style=\"font-weight: 600\">  </h5>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\"><font color=\"white\">Customer Name</font></label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                              <input type=\"text\" name=\"cname\" autocomplete=\"off\" maxlength=\"22\" class=\"form-control\" />\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\"><font color=\"white\">Mobile</font></label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                              <input type=\"text\" name=\"mobile\" autocomplete=\"off\" maxlength=\"10\" class=\"form-control\" placeholder=\"\" />\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\"><font color=\"white\">Email</font></label>\n");
      out.write("                         <div class=\"col-sm-9\">\n");
      out.write("                             <input type=\"email\" name=\"emailid\" autocomplete=\"off\" maxlength=\"25\" class=\"form-control\" placeholder=\"\" />\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                         <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\"><font color=\"white\">Payment Type</font></label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                              <select name=\"payment\" class=\"form-control\">\n");
      out.write("                                    <option value=\"Cash\">Cash</option>\n");
      out.write("                                    <option value=\"Online\">Online</option>\n");
      out.write("                              </select>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\"><font color=\"white\">Order Date</font></label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                              <input type=\"date\" name=\"odate\" autocomplete=\"off\" maxlength=\"20\" class=\"form-control\" />\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                        <h6 class=\"card-description\" style=\"font-weight: 100px\"><font color=\"white\"> Address </font></h6><br>\n");
      out.write("                        <br>\n");
      out.write("                       <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\"><font color=\"white\">Address</font></label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                              <input type=\"text\" name=\"addr\" autocomplete=\"off\" maxlength=\"20\" class=\"form-control\" />\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\"><font color=\"white\">PinCode</font></label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" name=\"pin\" autocomplete=\"off\" maxlength=\"6\" class=\"form-control\" />\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("<!--                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\">Address Line 2:</label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                              <input type=\"text\" class=\"form-control\" />\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>-->\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-group row\">\n");
      out.write("                            <label class=\"col-sm-3 col-form-label\"><font color=\"white\">City</font></label>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                            <input type=\"text\" name=\"city\" autocomplete=\"off\" maxlength=\"15\" class=\"form-control\" />\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" value=\"Confirm Order\"class=\"btn btn-success\" ><br>\n");
      out.write("                      <br>\n");
      out.write("                    </form>\n");
      out.write("</body>\n");
      out.write("<script src=\"vendor/jquery/jquery.slim.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
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
