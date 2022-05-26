<%@page import="com.voidmain.pojo.Login"%>
<%@page import="com.voidmain.pojo.JobApplication"%>
<%@page import="com.voidmain.pojo.Job"%>
<%@page import="com.voidmain.pojo.Company"%>
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
		<h1>View Company'S</h1>
		<%
			}
		%>

		<table style="width: 100%; border-spacing: 0;">
			<tr>
				<th>Company ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Address</th>
				<%
					if(role.equals("admin"))
					{
				%>
						<th>Delete</th>
				<%
					}
				%>
			</tr>
			<%
				for (Company company : HibernateDAO.getCompanys()) {
			%>
			<tr>
				<td><%=company.getUsername()%></td>
				<td><%=company.getName()%></td>
				<td><%=company.getEmail()%></td>
				<td><%=company.getMobile()%></td>
				<td><%=company.getAddress()%></td>
				<%
					if(role.equals("admin"))
					{
				%>
					<td><a href="viewcompanys.jsp?id=<%=company.getUsername()%>">delete</a></td>
				<%
					}
				%>
			</tr>

			<%
				}
			%>
		</table>
		
		<%
		String id = request.getParameter("id");

		if (id != null) {
			
			for(Job job : HibernateDAO.getJobs())
			{
				if(job.getCompanyid().equals(id))
				{
					for(JobApplication jobApplication : HibernateDAO.getJobApplications())
					{
						if(job.getId()==jobApplication.getJobid())
						{
							HibernateTemplate.deleteObject(JobApplication.class,jobApplication.getId());
						}
					}
					
					HibernateTemplate.deleteObject(Job.class,job.getId());
				}
			}
			
			if (HibernateTemplate.deleteObject(Company.class,id) == 1) {
				HibernateTemplate.deleteObject(Login.class,id);
				response.sendRedirect("viewcompanys.jsp?status=success");
			} else {
				response.sendRedirect("viewcompanys.jsp?status=failed");
			}
		}
	%>

	</div>
<%@include file="footer.jsp"%>