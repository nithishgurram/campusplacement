<!DOCTYPE HTML>
<%@page import="com.voidmain.dao.HibernateDAO"%>
<html>

<head>
<title>e-BhavishyaDwar</title>
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
					<h1>
						<a href="#" style="color:white">KMIT CAMPUS PLACEMENTS</a>
					</h1>
				</div>
			</div>
			<div id="menubar">
				<ul id="menu">

					 <%
						String role = (String) request.getSession().getAttribute("role");
						String username = (String) request.getSession().getAttribute( "username");

						if (role.equals("student")) {
					%>
					        <li><a href="#"><%out.println(request.getSession().getAttribute( "username")); %></a><li>
							<li><a href="updateprofile.jsp">Update Profile</a></li>
							<li><a href="viewcompanys.jsp">Companies</a></li>
							<li><a href="viewjobs.jsp">Jobs</a></li>
							<li><a href="viewmyapplicationstatus.jsp">Applications</a></li>
							<li><a href="viewnotifications.jsp">Notifications</a></li>
							<li><a href="viewnotifications2.jsp">placed</a></li>
							<li><a href="addquestion.jsp">Post Query</a></li>
							<li><a href="viewquestions.jsp">FAQ's</a></li>
							
					<%
						}
					%>
					
					<%
						if (role.equals("admin")) {
					%>
							<li><a href="#"><%out.println(request.getSession().getAttribute( "username")); %></a><li>
							<li><a href="addnotification.jsp">Send Notification</a></li>
							<li><a href="addnotification2.jsp">Update Placed Status</a></li>
							<li><a href="viewnotifications2.jsp">placed</a></li>
							<li><a href="viewnotifications.jsp">View Notifications</a></li>
							
							<li><a href="viewcompanys.jsp">Companies</a></li>
							<li><a href="viewstudents.jsp">Students</a></li>
							
					<%
						}
					%>
					
					<%
						if (role.equals("company")) {
					%>
							<li><a href="#"><%out.println(request.getSession().getAttribute( "username")); %></a><li>
							<li><a href="addjob.jsp">Post Job</a></li>
							<li><a href="viewmyjobs.jsp">View Jobs</a></li>
							<li><a href="viewapplications.jsp">Applications</a></li>
							<li><a href="viewnotifications2.jsp">placed</a></li>
							
							
					<%
						}
					%>
					
					<%
						if (role.equals("senior")) {
					%>
							<li><a href="#"><%out.println(request.getSession().getAttribute( "username")); %></a><li>
							<li><a href="viewquestions.jsp">FAQ's</a></li>
							<li><a href="viewnotifications2.jsp">placed</a></li>
							
					<%
						}
					%>
					
					<li><a href="logout.jsp">Logout</a></li>
					
				</ul>
			</div>
		</div>
		<div id="content_header"></div>
		<div id="site_content">