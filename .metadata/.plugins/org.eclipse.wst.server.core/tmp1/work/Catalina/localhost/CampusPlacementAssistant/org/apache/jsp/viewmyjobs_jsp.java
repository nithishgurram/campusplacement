/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.0
 * Generated at: 2022-05-11 10:47:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.voidmain.pojo.JobApplication;
import com.voidmain.pojo.Job;
import com.voidmain.pojo.Job;
import com.voidmain.dao.HibernateTemplate;
import com.voidmain.dao.HibernateDAO;
import java.util.List;
import com.voidmain.dao.HibernateDAO;

public final class viewmyjobs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1651919304887L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1651833065589L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.voidmain.dao.HibernateTemplate");
    _jspx_imports_classes.add("com.voidmain.pojo.JobApplication");
    _jspx_imports_classes.add("com.voidmain.dao.HibernateDAO");
    _jspx_imports_classes.add("com.voidmain.pojo.Job");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>e-BhavishyaDwar</title>\r\n");
      out.write("<meta name=\"description\" content=\"website description\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("<meta http-equiv=\"content-type\"\r\n");
      out.write("\tcontent=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\"\r\n");
      out.write("\ttitle=\"style\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t<div id=\"logo_text\">\r\n");
      out.write("\t\t\t\t\t<!-- class=\"logo_colour\", allows you to change the colour of the text -->\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">STUDENT GUIDE <span class=\"logo_colour\">&nbsp;FOR CAMPUS PLACEMENTS</span></a>\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"menubar\">\r\n");
      out.write("\t\t\t\t<ul id=\"menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t ");

						String role = (String) request.getSession().getAttribute("role");
						String username = (String) request.getSession().getAttribute( "username");

						if (role.equals("student")) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"updateprofile.jsp\">Update Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewcompanys.jsp\">Companies</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewjobs.jsp\">Jobs</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewmyapplicationstatus.jsp\">Applications</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewnotifications.jsp\">Notifications</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"addquestion.jsp\">Post Question</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewquestions.jsp\">Questions</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

						if (role.equals("admin")) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"addnotification.jsp\">Send Notification</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewnotifications.jsp\">Notifications</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewcompanys.jsp\">Companies</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewstudents.jsp\">Students</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

						if (role.equals("company")) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"addjob.jsp\">Post Job</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewmyjobs.jsp\">View Jobs</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewapplications.jsp\">Applications</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

						if (role.equals("senior")) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"viewquestions.jsp\">Questions</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"content_header\"></div>\r\n");
      out.write("\t\t<div id=\"site_content\">");
      out.write("\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<!-- insert the page content here -->\r\n");
      out.write("\r\n");
      out.write("\t\t");

			String status = request.getParameter("status");
				
			if (status != null) {
		
      out.write("\r\n");
      out.write("\t\t<h1>");
      out.print(status);
      out.write("</h1>\r\n");
      out.write("\t\t");

			} else {
		
      out.write("\r\n");
      out.write("\t\t<h1>View Job'S</h1>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<table style=\"width: 100%; border-spacing: 0;\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t<th>Title</th>\r\n");
      out.write("\t\t\t\t<th>Description</th>\r\n");
      out.write("\t\t\t\t<th>Interview Date</th>\r\n");
      out.write("\t\t\t\t<th>Salary</th>\r\n");
      out.write("\t\t\t\t<th>Work Location</th>\r\n");
      out.write("\t\t\t\t<th>Percentage Required</th>\r\n");
      out.write("\t\t\t\t<th>Branches can Apply</th>\r\n");
      out.write("\t\t\t\t<th>Job Role</th>\r\n");
      out.write("\t\t\t\t<th>Company ID</th>\r\n");
      out.write("\t\t\t\t<th>View Applications</th>\r\n");
      out.write("\t\t\t\t<th>Delete</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				for (Job job : HibernateDAO.getJobs()) {
					
					if(job.getCompanyid().equals(username))
					{
			
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getId());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getJobtitle());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getDescription());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getIdate());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getSalary());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getWorklocation());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getMinimumpercentage());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getBranches());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getDesignation());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(job.getCompanyid());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"viewapplications.jsp?id=");
      out.print(job.getId());
      out.write("\">view applications</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"viewmyjobs.jsp?id=");
      out.print(job.getId());
      out.write("\">delete</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");

					}
				}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

		String id = request.getParameter("id");

		if (id != null) {
			
			if (HibernateTemplate.deleteObject(Job.class,Integer.parseInt(id)) == 1) {
				response.sendRedirect("viewjobs.jsp?status=success");
			} else {
				response.sendRedirect("viewjobs.jsp?status=failed");
			}
			
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("<div id=\"content_footer\"><footer style=\"background: black;\" class=\"page-footer font-small blue\">\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"footer-copyright text-center py-3\">© 2022 Copyright:\r\n");
      out.write("    <a href=\"https://kmitonline.com/\"> kmitonline.com</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("</footer></div>\r\n");
      out.write("<p class=\"text-footer\">\r\n");
      out.write("            Copyright @-All rights are reserved\r\n");
      out.write("        </p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
