package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/_links.jsp");
    _jspx_dependants.add("/_header.jsp");
    _jspx_dependants.add("/_footer.jsp");
    _jspx_dependants.add("/_script.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>About Us</title>\n");
      out.write("        ");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Nanum+Gothic:400,700,800\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"fonts/flaticon/font/flaticon.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/rangeslider.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function validateFormData() {\n");
      out.write("                var status = true;\n");
      out.write("                var problem = document.getElementById('problem').value;\n");
      out.write("                var domain = document.getElementById('domain').value;\n");
      out.write("                \n");
      out.write("                var problemError = document.getElementById('problemError');\n");
      out.write("                var domainError = document.getElementById('domainError');\n");
      out.write("                \n");
      out.write("                if(problem.length == 0){\n");
      out.write("                    problemError.innerHTML = \"Please Describe Your Problem\";\n");
      out.write("                    status = false;\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    problemError.innerHTML = \"\";\n");
      out.write("                }\n");
      out.write("                if(domain == 0){\n");
      out.write("                    domainError.innerHTML = \"Select your problem domain\";\n");
      out.write("                    status = false;\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    domainError.innerHTML = \"\";\n");
      out.write("                }\n");
      out.write("                return status;\n");
      out.write("            }    \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        ");

            if(session.getAttribute("email")!=null)
                {
        
      out.write("   \n");
      out.write("            ");
      out.write("<div class=\"site-mobile-menu\">\n");
      out.write("    <div class=\"site-mobile-menu-header\">\n");
      out.write("        <div class=\"site-mobile-menu-close mt-3\">\n");
      out.write("            <span class=\"icon-close2 js-menu-toggle\"></span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"site-mobile-menu-body\"></div>\n");
      out.write("</div>\n");
      out.write("<header class=\"site-navbar container-fluid py-0 \" role=\"banner\">\n");
      out.write("\n");
      out.write("    <!-- <div class=\"container\"> -->\n");
      out.write("    <div class=\"row align-items-center\">\n");
      out.write("        <div class=\"col-6 col-xl-3\">\n");
      out.write("            <h1 class=\"mb-0 site-logo\"><a href=\"index.jsp\" class=\"text-light mb-0\"> &nbsp; Institutional-<span class=\"text-primary\">GRS</span>  </a></h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 col-md-9 d-none d-xl-block\">\n");
      out.write("            <nav class=\"site-navigation position-relative text-right\" role=\"navigation\">\n");
      out.write("\n");
      out.write("                <ul class=\"site-menu js-clone-nav mr-auto d-none d-lg-block\">\n");
      out.write("                    <li><a href=\"dashboard.jsp\">Profile</a></li>\n");
      out.write("                    <li><a href=\"register_complaint.jsp\">Register Complaint</a></li>\n");
      out.write("                    <li><a href=\"view_status.jsp\">View Status</a></li>\n");
      out.write("                    ");

                        if(session.getAttribute("designation").equals("Student") || session.getAttribute("designation").equals("Staff")){
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");

                        }
                        else{
                    
      out.write("\n");
      out.write("                    <li><a href=\"view_complaint.jsp\">View Complaints</a></li>\n");
      out.write("                    \n");
      out.write("                    ");

                        }
                        if(session.getAttribute("designation").equals("Admin")){
                    
      out.write("\n");
      out.write("                        <li><a href=\"create_user.jsp\">Create User</a>\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                    <li></li>\n");
      out.write("                    <li class=\"ml-xl-3 login\"><a href=\"logout.jsp\"><span class=\"border-left pl-xl-4\"></span>Log Out</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"d-inline-block d-xl-none ml-auto py-3 col-6 text-right\" style=\"position: relative; top: 3px;\">\n");
      out.write("            <a href=\"#\" class=\"site-menu-toggle js-menu-toggle text-black\"><span class=\"icon-menu h3\" style=\"color:white\"></span></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"container-fluid bg-light\" id=\"main-form\">\n");
      out.write("                <center><h3>About Us</h3></center>\n");
      out.write("                <p>\n");
      out.write("                Grievance Redressal System is a mechanism commonly used to receive and act on complaints or grievances reported by stakeholders of private or public institutions, enabling prompt actions on any issue raised by them and to avail services more effectively. \n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Unlike the traditional Grievance Redressal approach through letters and complaint forms, the new online based approach such as grievance portals have very great appeal and its usage highly reflects the actual state of customer satisfaction. Grievance Redressal can be handled directly by institutes through their own websites. Also the smart web portal for grievance processing connects stakeholders and action-takers directly through online platform. Grievance Redressal System helps to pursue quick action for solving the grievance, while maintaining affordability and ease to the users. Online grievance redressal mechanism in higher education institutions facilitates the main constituents of the institute including students, teachers and other non-teaching staff to lodge grievances and ensure satisfactory solutions in a hassle-free manner.\n");
      out.write("            </p>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("<footer class=\"site-footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <h2 class=\"footer-heading mb-4\">About</h2>\n");
      out.write("                        <p>This is official website for Grievance Redressal System !</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <h2 class=\"footer-heading mb-4\">Navigations</h2>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("                            <li><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("                            <li><a href=\"faq.jsp\">FAQ's</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <h2 class=\"footer-heading mb-4\">Follow Us</h2>\n");
      out.write("                        <a href=\"https://www.facebook.com/amit.geed.1\" class=\"pl-0 pr-3\"><span class=\"icon-facebook\"></span></a>\n");
      out.write("                        <a href=\"https://www.instagram.com/amit_geed_0808/\" class=\"pl-3 pr-3\"><span class=\"icon-instagram\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row pt-12 mt-12 text-center\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"border-top pt-5\">\n");
      out.write("                    <p>\n");
      out.write("                        Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved<br>\n");
      out.write("                        Designed by <a href=\"https://www.instagram.com/amit_geed_0808/\">Amit Geed</a> and <a href=\"https://www.instagram.com/vaishali_1278/\">Vaishali Chauhan</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("        ");

        }
        else{
            response.sendRedirect("index.jsp");
        }
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("            ");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-ui.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.countdown.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("<script src=\"js/aos.js\"></script>\n");
      out.write("<script src=\"js/rangeslider.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
