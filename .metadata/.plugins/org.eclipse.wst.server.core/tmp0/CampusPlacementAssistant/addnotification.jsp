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
			<h1>Add Notification</h1>
	<%
		}
	%>

	<form action="VoidmainServlet" method="post">

		<input type="hidden" name="type" value="com.voidmain.pojo.Notification">
		<input type="hidden" name="operation" value="add"> 
		<input type="hidden" name="redirect" value="addnotification.jsp">
		
		<input type="hidden" name="ndate" value="<%=new Date().toString()%>">

		<div class="form_settings">
			<p>
				<span>Title:</span><input class="contact" type="text" name="title"
					value="" required="required"/>
			</p>
			<p>
				<span>Description:</span><input class="contact" type="text" name="description"
					value="" required="required"/>
			</p>
			<p style="padding-top: 15px">
				<span>&nbsp;</span><input class="submit" type="submit"
					name="contact_submitted" value="Add Notification" />
			</p>
		</div>
	</form>
</div>
<%@include file="footer.jsp"%>