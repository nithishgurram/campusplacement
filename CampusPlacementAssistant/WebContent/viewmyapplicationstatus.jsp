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
				<th>Job ID</th>
				<th>Status</th>
			</tr>
			<%
				for (JobApplication jobApplication : HibernateDAO.getJobApplications()) {
					
					if(jobApplication.getRno().equals(username))
					{
			%>
						<tr>
							<td><%=jobApplication.getId()%></td>
							<td><%=jobApplication.getJobid()%></td>
							<td><%=jobApplication.getStatus()%></td>
						</tr>
			<%
					}
				}
			%>
		</table>
		
	</div>
<%@include file="footer.jsp"%>