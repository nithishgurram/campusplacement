<%@page import="com.voidmain.pojo.JobApplication"%>
<%@page import="com.voidmain.pojo.Job"%>
<%@page import="com.voidmain.pojo.Job"%>
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
		<h1>View Job'S</h1>
		<%
			}
		%>

		<table style="width: 100%; border-spacing: 0;">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Description</th>
				<th>Interview Date</th>
				<th>Salary</th>
				<th>Work Location</th>
				<th>Percentage Required</th>
				<th>Branches can Apply</th>
				<th>Job Role</th>
				<th>Company ID</th>
				<th>Apply</th>
			</tr>
			<%
				for (Job job : HibernateDAO.getJobs()) {
			%>
			<tr>
				<td><%=job.getId()%></td>
				<td><%=job.getJobtitle()%></td>
				<td><%=job.getDescription()%></td>
				<td><%=job.getIdate()%></td>
				<td><%=job.getSalary()%></td>
				<td><%=job.getWorklocation()%></td>
				<td><%=job.getMinimumpercentage()%></td>
				<td><%=job.getBranches()%></td>
				<td><%=job.getDesignation()%></td>
				<td><%=job.getCompanyid()%></td>
				<td><a href="viewjobs.jsp?id=<%=job.getId()%>">apply</a></td>
			</tr>

			<%
				}
			%>
		</table>
		
		<%
			String id = request.getParameter("id");

			if (id != null) {
				
				JobApplication jobApplication=new JobApplication();
				jobApplication.setJobid(Integer.parseInt(id));
				jobApplication.setRno(username);
				jobApplication.setStatus("pending");
				
				if (HibernateTemplate.addObject(jobApplication) == 1) {
					response.sendRedirect("viewjobs.jsp?status=success");
				} else {
					response.sendRedirect("viewjobs?status=failed");
				}
			}
		%>
	</div>
<%@include file="footer.jsp"%>