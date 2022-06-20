<%@page import="com.voidmain.pojo.Student"%>
<%@page import="com.voidmain.pojo.Job"%>
<%@page import="com.voidmain.pojo.JobApplication3"%>
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
		<h1> Placement Status</h1>
		<%
			}
		%>

		<table style="width: 100%; border-spacing: 0;">
			<tr>
				<th>ID</th>
				<th>RNO</th>
				<th>Job ID</th>
				<th>Placed Status</th>
				<th>Approve</th>
				<th>Reject</th>
			</tr>
			<%
				for (Job job : HibernateDAO.getJobs()) {
						
						if(job.getCompanyid().equals(username))
						{
							for (JobApplication3 jobApplication3 : HibernateDAO.getJobApplications3()) {
								if(jobApplication3.getJobid3()== job.getId())
								{
									Student student=HibernateDAO.getStudentById(jobApplication3.getRno3());
			%>
								<tr>
									<td><%=jobApplication3.getId3()%></td>
									<td><%=jobApplication3.getRno3()%></td>
									<td><%=jobApplication3.getJobid3()%></td>
									
									
									
									<td><%=jobApplication3.getStatus3()%></td>
									<td> <a href="viewapplications3.jsp?id=<%=jobApplication3.getId3()%>&applicationstatus=yes">Approve</a></td>
									<td> <a href="viewapplications3.jsp?id=<%=jobApplication3.getId3()%>&applicationstatus=no">Reject</a></td>
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
				JobApplication3 jobApplication3=HibernateDAO.getJobApplication3ById(Integer.parseInt(id));
				
				if(jobApplication3!=null)
				{
					jobApplication3.setStatus3(status);
					
					if(HibernateTemplate.updateObject(jobApplication3)==1)
					{
						response.sendRedirect("viewapplications3.jsp?status=success");
					}
					else
					{
						response.sendRedirect("viewapplications3.jsp?status=failed");
					}
				}
			}
		%>

	</div>
<%@include file="footer.jsp"%>