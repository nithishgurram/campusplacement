<!DOCTYPE HTML>

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
					String status = request.getParameter("status");

					if (status != null) {
				%>
				<h1><%=status%></h1>
				<%
					} else {
				%>
				<h1 style="text-align:center">Student Registration</h1>
				<%
					}
				%>

				<form action="VoidmainServlet" method="post" name="appform" enctype="multipart/form-data" style=" width: 50vw; margin-left : 15vw;">

					<input type="hidden" name="type" value="com.voidmain.pojo.Student">
					<input type="hidden" name="operation" value="add"> 
					<input type="hidden" name="redirect" value="studentregistration.jsp">
					
					<div class="form_settings">
						<p>
							<span>Name</span><input class="contact" type="text" name="name"
								value="" required="required"/>
						</p>
						<p>
							<span>RollNumber</span><input class="contact" type="text"
								name="rno" pattern="[1][89]BD1A0[0-9][0-9][A-Z 0-9]" title="roll number should start with 18 or 19 ex:18BD1A054X" value="" required="required"/>
						</p>
						<p>
							<span>Password</span><input class="contact" type="password"
								name="password" pattern="(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}" title="Minimum 8 characters,one Upper case,one lower case,one special character" value="" required="required" />
						</p>
						<p>
							<span>Email Address</span><input class="contact" type="email"
								name="email" pattern="[a-z0-9](\.?[a-z0-9]){3,}@[Gg][Mm][Aa][Ii][Ll]\.com$" title="please enter a valid e-mail ex:ex12@gmail.com" value="" required="required"/>
						</p>
						<p>
							<span>Mobile</span><input class="contact" type="text"
								name="mobile" pattern="[6-9]\d{9}" title="please enter a valid Mobile Number" value="" required="required"/>
						</p>
						<p>
							<span>Branch</span><input class="contact" type="text"
								name="branch" value="" required="required"/>
						</p>
						<p>
							<span>Year</span><input class="contact" type="text"
								name="year" value="" required="required"/>
						</p>
						<p>
							<span>GPA</span><input class="contact" type="number" step="0.1"
								name="gpa"  value="" required="required"/>
						</p>
						<p>
							<span>Resume</span>
							<input class="contact" type="file" name="resume" value="" required="required"/>
						</p>
						<p>
							<span>Address</span>
							<textarea class="contact" name="address" required="required"></textarea>
						</p>
						<p style="padding-top: 15px">
							<span>&nbsp;</span><input class="submit" type="submit"
								name="contact_submitted" value="Register" onclick="return validate()" />
						</p>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
