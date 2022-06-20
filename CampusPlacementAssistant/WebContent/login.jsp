<!DOCTYPE HTML>
<html>

<head>
<title>e-BhasvishyaDwar</title>
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
						<a href="#" style="color:white">KMIT CAMPUS PLACEMENTS</a>
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
					<li><a href="viewnotifications2.jsp">placed</a></li>
					<li><a href="contact.jsp">contact us</a></li>

				</ul>
			</div>
		</div>
		<div id="content_header"></div>
		<div id="site_content">
			<div id="content">
				<!-- insert the page content here -->
				<%
					String status=request.getParameter("status");
									
					if(status!=null)
					{
				%>
						<h1><%=status%></h1>
				<%		
					}
					else
					{
				%>
						<h1 style="text-align:center">Login Here</h1>
				<%		
					}
				%>
				
				<form action="LoginServlet" style=" width: 50vw; margin-left : 15vw;">
					<div class="form_settings">
						
						<p>
							<span>User Name :</span><input class="contact" type="text"
								name="username" value="" />
						</p>
						<p>
							<span>Password :</span><input class="contact" type="password"
								name="password" value="" />
						</p>
						<p style="padding-top: 15px">
							<span>&nbsp;</span><input class="submit" type="submit"
								name="contact_submitted" value="Login" />
						</p>
					</div>
				</form>
				
			</div>
		</div>
	</div>
</body>
</html>
