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
						<a href="#"style="color:white">KMIT CAMPUS PLACEMENTS</a>
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
					<li><a href="notification.jsp">Notification</a></li>
					<li><a href="viewnotifications2.jsp">Placed</a></li>
					
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
<%@page import="com.voidmain.pojo.Notification2"%>
<%@page import="com.voidmain.dao.HibernateTemplate"%>
<%@page import="com.voidmain.dao.HibernateDAO"%>
<%@page import="java.util.List"%>

	<div id="content">
		<!-- insert the page content here -->
<table style="width: 100%; border-spacing: 0;">
<h1>Placed Students</h1>
			<tr>
				<th>SNO</th>
				<th>Company Name</th>
				<th>Student Name</th>
				<th>CTC</th>
				
			</tr>
			<%
				for (Notification2 notification : HibernateDAO.getNotifications2()) {
			%>
			<tr>
				<td><%=notification.getId2()%></td>
				<td><%=notification.getTitle2()%></td>
				<td><%=notification.getDescription2()%></td>
				<td><%=notification.getNdate2()%></td>
				
			</tr>

			<%
				}
			%>
		</table>
		
		</div>
			</div>
		</div>
	</div>
</body>
</html>
