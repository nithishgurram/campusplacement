<%@page import="com.voidmain.pojo.Student"%>
<%@page import="com.voidmain.pojo.Job"%>
<%@page import="com.voidmain.pojo.JobApplication"%>
<%@page import="com.voidmain.dao.HibernateTemplate"%>
<%@page import="com.voidmain.dao.HibernateDAO"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>
	<div id="content">
		<!-- insert the page content here -->

		<%
			String status = request.getParameter("status");
				
			if (status != null) {
		%>
		<h1><%=status%></h1>
		<%
			} else {
		%>
		<h1>View Application's</h1>
		<%
			}
		%>

		<table style="width: 100%; border-spacing: 0;">
			<tr>
				<th>ID</th>
				<th>RNO</th>
				<th>Job ID</th>
				<th>GPA</th>
				<th>Resume</th>
				
				<th>Status</th>
				<th>Approve</th>
				<th>Reject</th>
			</tr>
			<%
				for (Job job : HibernateDAO.getJobs()) {
						
						if(job.getCompanyid().equals(username))
						{
							for (JobApplication jobApplication : HibernateDAO.getJobApplications()) {
						
								if(jobApplication.getJobid()== job.getId())
								{
									Student student=HibernateDAO.getStudentById(jobApplication.getRno());
			%>
								<tr>
									<td><%=jobApplication.getId()%></td>
									<td><%=jobApplication.getRno()%></td>
									<td><%=jobApplication.getJobid()%></td>
									<td><%=student.getGpa()%></td>
									
									<td><a href="resumes/<%=student.getResume()%>" download>download resume</a></td>
									<td><%=jobApplication.getStatus()%></td>
									<td> <a href="viewapplications.jsp?id=<%=jobApplication.getId()%>&applicationstatus=yes">Approve</a></td>
									<td> <a href="viewapplications.jsp?id=<%=jobApplication.getId()%>&applicationstatus=no">Reject</a></td>
								</tr>
			<%
							}
						}
					}
				}
			%>
		</table>
		
		<%
			String id=request.getParameter("id");
			status=request.getParameter("applicationstatus");
		
			if(id!=null && status!=null)
			{
				JobApplication jobApplication=HibernateDAO.getJobApplicationById(Integer.parseInt(id));
				
				if(jobApplication!=null)
				{
					jobApplication.setStatus(status);
					
					if(HibernateTemplate.updateObject(jobApplication)==1)
					{
						response.sendRedirect("viewapplications.jsp?status=success");
					}
					else
					{
						response.sendRedirect("viewapplications.jsp?status=failed");
					}
				}
			}
		%>

	</div>
<%@include file="footer.jsp"%>