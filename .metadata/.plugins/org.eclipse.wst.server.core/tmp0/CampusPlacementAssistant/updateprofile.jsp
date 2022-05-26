<%@page import="com.voidmain.pojo.Student"%>
<%@page import="java.util.Date"%>
<%@page import="com.voidmain.dao.HibernateDAO"%>
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
	<h1>Update Profile</h1>
	<%
		}
	%>

	<form action="UpdateStudentServlet" method="post" name="appform"
		enctype="multipart/form-data">

		<%
			Student student = HibernateDAO.getStudentById(username);
		%>

		<input type="hidden" value="<%=student.getName()%>" name="name">
		<input type="hidden" value="<%=student.getRno()%>" name="rno">
		<input type="hidden" value="<%=student.getAddress()%>" name="address">
		<input type="hidden" value="<%=student.getBranch()%>" name="branch">


		<div class="form_settings">
			<p>
				<span>Email Address</span><input class="contact" type="email"
					name="email" value="<%=student.getEmail()%>" required="required" />
			</p>
			<p>
				<span>Mobile</span><input class="contact" type="text" name="mobile"
					value="<%=student.getMobile()%>" required="required" />
			</p>
			<p>
				<span>Year</span><input class="contact" type="text" name="year"
					value="<%=student.getYear()%>" required="required" />
			</p>
			<p>
				<span>GPA</span><input class="contact" type="number"  step="0.1"name="gpa"
					value="<%=student.getGpa()%>" required="required" />
			</p>
			<p>
				<span>Resume</span> <input class="contact" type="file" name="resume"
					value="" required="required" />
			</p>
			<p style="padding-top: 15px">
				<span>&nbsp;</span><input class="submit" type="submit"
					name="contact_submitted" value="Update Profile"
					onclick="return validate()" />
			</p>
		</div>
	</form>
</div>
<%@include file="footer.jsp"%>