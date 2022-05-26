<!DOCTYPE HTML>

<html>

<head>

<title>e-BhavishyaDwar</title>
<style>
body{
background:Hex #45B8AC;
}
img {
  border-radius: 50%;
  display: block;
  margin-left: auto;
  margin-right: auto;
}
h1,p{
text-align:center;
}

table.center {
  margin-left: 50px; 
  margin-right: auto;
}
</style>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type"
	content="text/html; charset=windows-1252" />
<link rel="stylesheet" type="text/css" href="style/style.css"
	title="style" />
</head>

<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<div id="logo_text">
					<!-- class="logo_colour", allows you to change the colour of the text -->
					<h1 style="text-align:center ">
						<a href="#">STUDENT GUIDEFOR CAMPUS PLACEMENTS</a>
					</h1>
				</div>
			</div>
			<div id="menubar">
				<ul id="menu">
					
					<li><a href="index.jsp">Home</a></li>
					<li><a href="login.jsp">Login</a></li>
					<li><a href="studentregistration.jsp">Student Registration</a></li>
					<li><a href="seniorregistration.jsp">Senior Registration</a></li>
					<li><a href="companyregistration.jsp">Company Registration</a></li>
					<li><a href="viewcompanys.jsp">Notification</a></li>
					<li><a href="contact.jsp">contact us</a></li>

				</ul>
			</div>
		</div>
		<div id="content_header"></div>
		<div id="site_content">
			<div id="content">
				<%@page import="com.voidmain.pojo.Login"%>
<%@page import="com.voidmain.pojo.JobApplication"%>
<%@page import="com.voidmain.pojo.Job"%>
<%@page import="com.voidmain.pojo.Company"%>
<%@page import="com.voidmain.dao.HibernateTemplate"%>
<%@page import="com.voidmain.dao.HibernateDAO"%>
<%@page import="java.util.List"%>

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
		<h1 style="text-align: right">Recent Job Notifications</h1>
		<%
			}
		%>

		<table class="center">
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
				
				jobApplication.setStatus("pending");
				
				if (HibernateTemplate.addObject(jobApplication) == 1) {
					response.sendRedirect("viewjobs.jsp?status=success");
				} else {
					response.sendRedirect("viewjobs?status=failed");
				}
			}
		%></div>
			</div>
		</div>
	</div>
</body>
</html>
