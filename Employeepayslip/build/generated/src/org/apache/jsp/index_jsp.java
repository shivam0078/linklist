package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"get.jsp\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <center>\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Id</td>\n");
      out.write("                        <td><input type=\"number\" name=\"txteid\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtname\"/></td>\n");
      out.write("                    </tr> <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"email\" name=\"txtemail\"/></td>\n");
      out.write("                    </tr> \n");
      out.write("                     <tr>\n");
      out.write("                        <td>Designation</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtdes\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                     <tr>\n");
      out.write("                        <td>Working Days</td>\n");
      out.write("                        <td><input type=\"number\" name=\"txtwd\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                     <tr>\n");
      out.write("                        <td>Per day salary</td>\n");
      out.write("                        <td><input type=\"number\" name=\"txtps\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                     <tr>\n");
      out.write("                        <td>Leaves</td>\n");
      out.write("                        <td><input type=\"number\" name=\"txtleaves\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        \n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Save\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
