<%@page import="com.voidmain.pojo.Login"%>
<%@page import="com.voidmain.pojo.JobApplication"%>
<%@page import="com.voidmain.pojo.Job"%>
<%@page import="com.voidmain.pojo.Student"%>
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
	<h1>View Student'S</h1>
	<%
		}
	%>

	<table style="width: 100%; border-spacing: 0;">
		<tr>
			<th>RNO</th>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Address</th>
			<th>Branch</th>
			<th>GPA</th>
			<th>Year</th>
			<%
				if (role.equals("admin")) {
			%>
			<th>Delete</th>
			<%
				}
			%>
		</tr>
		<%
			for (Student student : HibernateDAO.getStudents()) {
		%>
		<tr>
			<td><%=student.getRno()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getEmail()%></td>
			<td><%=student.getMobile()%></td>
			<td><%=student.getAddress()%></td>
			<td><%=student.getBranch()%></td>
			<td><%=student.getGpa()%></td>
			<td><%=student.getYear()%></td>
			<%
				if (role.equals("admin")) {
			%>
			<td><a href="viewstudents.jsp?id=<%=student.getRno()%>">delete</a></td>
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

			for (JobApplication jobApplication : HibernateDAO.getJobApplications()) {
				if (username.equals(jobApplication.getRno())) {
					HibernateTemplate.deleteObject(JobApplication.class, jobApplication.getId());
				}
			}

			if (HibernateTemplate.deleteObject(Student.class, id) == 1) {
				HibernateTemplate.deleteObject(Login.class, id);
				response.sendRedirect("viewstudents.jsp?status=success");
			} else {
				response.sendRedirect("viewstudents.jsp?status=failed");
			}
		}
	%>

</div>
<%@include file="footer.jsp"%>