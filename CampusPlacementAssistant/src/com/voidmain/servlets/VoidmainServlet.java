package com.voidmain.servlets;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.voidmain.dao.HibernateDAO;
import com.voidmain.dao.HibernateTemplate;
import com.voidmain.pojo.Login;
import com.voidmain.pojo.Notification;
import com.voidmain.pojo.Student;
import com.voidmain.service.MailService;

@WebServlet("/VoidmainServlet")
public class VoidmainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	HttpServletRequest request;
	HttpServletResponse response;

	Object obj=null;
	String redirect=null;
	String type;
	String operation=null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.request=request;
		this.response=response;

		try {
			
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);

			if(isMultipart) 
			{
				Object obj=new Student();
				
				Map<Object,List<String>> map=HttpRequestParser.parseMultiPartRequest(request,obj);
				
				List<String> list=map.get(obj);
				
				Student student=(Student)obj;
				student.setResume(list.get(1));
				
				
				
				Login login=new Login();
				login.setUsername(student.getRno());
				login.setPassword(list.get(0));
				login.setRole("student");
				
				if(!HibernateDAO.isUserRegistred(student.getRno()))
				{
					if(HibernateTemplate.addObject(student)==1 && HibernateTemplate.addObject(login)==1)
					{
						response.sendRedirect("studentregistration.jsp?status=Successfully Registered");
					}
					else
					{
						response.sendRedirect("studentregistration.jsp?status=failed");
					}
				}
				else
				{
					response.sendRedirect("studentregistration.jsp?status=User All ready Registred");
				}
			}
			else
			{
				type=request.getParameter("type");
				redirect=request.getParameter("redirect");
				operation=request.getParameter("operation");

				if(type!=null && redirect!=null && operation!=null)
				{
					obj=Class.forName(type).newInstance();
					Object object=HttpRequestParser.parseRequest(request, obj);

					if(type.equals("com.voidmain.pojo.Company") || type.equals("com.voidmain.pojo.Senior"))
					{
						Login login=new Login();
						login.setUsername(request.getParameter("username"));
						login.setPassword(request.getParameter("password"));
						login.setRole(request.getParameter("usertype"));
						
						if(!HibernateDAO.isUserRegistred(request.getParameter("username")))
						{
							if(HibernateTemplate.addObject(object)==1 && HibernateTemplate.addObject(login)==1)
							{
								response.sendRedirect(redirect+"?status=Successfully Registered");
							}
							else
							{
								response.sendRedirect(redirect+"?status=failed");
							}
						}
						else
						{
							response.sendRedirect(redirect+"?status=User All ready Registred");
						}

					}
					else if(type.equals("com.voidmain.pojo.Notification") || type.equals("com.voidmain.pojo.Notification"))
					{
						Notification notification=(Notification)object;
						
						for(Student student : HibernateDAO.getStudents())
						{
							try {
								MailService.mailsend(notification.getTitle(),notification.getDescription(),student.getEmail());
							} catch (Exception e) {
								// TODO: handle exception
							}
						}
						
						if(HibernateTemplate.addObject(object)==1)
						{
							response.sendRedirect(redirect+"?status=Successfully Registered");
						}
						else
						{
							response.sendRedirect(redirect+"?status=failed");
						}

					}
					else
					{
						if(operation.equals("add"))
						{
							if(HibernateTemplate.addObject(object)==1)
							{
								response.sendRedirect(redirect+"?status=Successfully Added");
							}
							else
							{
								response.sendRedirect(redirect+"?status=failed");
							}					
						}
						else if(operation.equals("update"))
						{
							if(HibernateTemplate.updateObject(object)==1)
							{
								response.sendRedirect(redirect+"?status=Successfully Updated");
							}
							else
							{
								response.sendRedirect(redirect+"?status=failed");
							}
						}
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
