/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.0
 * Generated at: 2022-05-17 06:49:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.voidmain.pojo.Comment;
import java.util.Date;
import com.voidmain.pojo.Question;
import com.voidmain.dao.HibernateTemplate;
import com.voidmain.dao.HibernateDAO;
import java.util.List;
import com.voidmain.dao.HibernateDAO;

public final class viewquestions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
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
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("com.voidmain.dao.HibernateDAO");
    _jspx_imports_classes.add("com.voidmain.pojo.Question");
    _jspx_imports_classes.add("com.voidmain.pojo.Comment");
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
      out.write("<div id=\"content\">\r\n");
      out.write("\t<!-- insert the page content here -->\r\n");
      out.write("\r\n");
      out.write("\t");

		String status = request.getParameter("status");

		if (status != null) {
	
      out.write("\r\n");
      out.write("\t<h1>");
      out.print(status);
      out.write("</h1>\r\n");
      out.write("\t");

		} else {
	
      out.write("\r\n");
      out.write("\t<h1>View Question's</h1>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

		for (Question question : HibernateDAO.getQuestions()) 
		{
	
      out.write("\r\n");
      out.write("\t\t\t<h2>Question: ");
      out.print(question.getQuestion());
      out.write("<br/> </h2>\r\n");
      out.write("\t\t\tDate and Time :");
      out.print(question.getQdate());
      out.write("\r\n");
      out.write("\t\t\tPosted By : ");
      out.print(question.getPostedby());
      out.write(" <br/><br/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				if(question.getPostedby().equals(username))
				{
			
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"viewquestions.jsp?id=");
      out.print(question.getId());
      out.write("\">delete</a>\r\n");
      out.write("\t\t\t");
		
				}
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h3>Comments</h3>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form action=\"VoidmainServlet\" method=\"post\" name=\"appform\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"type\" value=\"com.voidmain.pojo.Comment\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"operation\" value=\"add\"> \r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"redirect\" value=\"viewquestions.jsp\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"qid\" value=\"");
      out.print(question.getId());
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"postedby\" value=\"");
      out.print(username);
      out.write("\"> \r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"cdate\" value=\"");
      out.print(new Date().toString());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"form_settings\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<span>Write Your Comment Here </span><input type=\"text\" name=\"comment\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p style=\"padding-top: 15px\">\r\n");
      out.write("\t\t\t\t\t\t<span>&nbsp;</span><input class=\"submit\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"contact_submitted\" value=\"Post Comment\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				for (Comment comment : HibernateDAO.getComments()) 
				{
					if(comment.getQid()==question.getId())
					{
			
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(comment.getComment());
      out.write(" --  posted by: ");
      out.print(comment.getPostedby());
      out.write(" -- Date: ");
      out.print(comment.getCdate());
      out.write(" <br> \r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t");
			
					}
				}
			
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");

		String id = request.getParameter("id");

		if (id != null) {
			if (HibernateTemplate.deleteObject(Question.class,Integer.parseInt(id)) == 1) {
				response.sendRedirect("viewquestions.jsp?status=success");
			} else {
				response.sendRedirect("viewquestions.jsp?status=failed");
			}
		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</div>");
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
