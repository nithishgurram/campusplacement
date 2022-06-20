<%@page import="java.util.Date"%>
<%@page import="com.voidmain.dao.HibernateDAO"%>
<%@include file="header.jsp"%>
<div id="content">
	<!-- insert the page content here -->
	<%
		String status = request.getParameter("status");

		if (status != null) 
		{
	%>
			<h1><%=status%></h1>
	<%
		} 
		else 
		{
	%>
			<h1>Add Placed Student</h1>
	<%
		}
	%>

	<form action="VoidmainServlet" method="post">

		<input type="hidden" name="type" value="com.voidmain.pojo.Notification2">
		<input type="hidden" name="operation" value="add"> 
		<input type="hidden" name="redirect" value="addnotification2.jsp">
		
		<input type="hidden" name="ndate" value="<%=new Date().toString()%>">

		<div class="form_settings">
			<p>
				<span>Companyname:</span><input class="contact" type="text" name="title2"
					value="" required="required"/>
			</p>
			<p>
				<span>Studentname:</span><input class="contact" type="text" name="description2"
					value="" required="required"/>
			</p>
			<p>
				<span>CTC:</span><input class="contact" type="text" name="ndate2"
					value="" required="required"/>
			</p>
			<p style="padding-top: 15px">
				<span>&nbsp;</span><input class="submit" type="submit"
					name="contact_submitted" value="Add " />
			</p>
		</div>
	</form>
</div>
<%@include file="footer.jsp"%>