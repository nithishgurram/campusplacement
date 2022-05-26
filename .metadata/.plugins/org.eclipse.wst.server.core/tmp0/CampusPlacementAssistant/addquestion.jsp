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
			<h1>Add Question</h1>
	<%
		}
	%>

	<form action="VoidmainServlet" method="post">

		<input type="hidden" name="type" value="com.voidmain.pojo.Question">
		<input type="hidden" name="operation" value="add"> 
		<input type="hidden" name="redirect" value="addquestion.jsp">
		
		<input type="hidden" name="qdate" value="<%=new Date().toString()%>">
		<input type="hidden" name="postedby" value="<%=username%>">

		<div class="form_settings">
			<p>
				<span>Question:</span><input class="contact" type="text" name="question"
					value="" required="required"/>
			</p>
			<p style="padding-top: 15px">
				<span>&nbsp;</span><input class="submit" type="submit"
					name="contact_submitted" value="Add Question" />
			</p>
		</div>
	</form>
</div>
<%@include file="footer.jsp"%>