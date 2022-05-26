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
			<h1>Add Job</h1>
	<%
		}
	%>

	<form action="VoidmainServlet" method="post">

		<input type="hidden" name="type" value="com.voidmain.pojo.Job">
		<input type="hidden" name="operation" value="add"> 
		<input type="hidden" name="redirect" value="addjob.jsp">
		
		<input type="hidden" name="companyid" value="<%=username%>">

		<div class="form_settings">
			<p>
				<span>Title:</span><input class="contact" type="text" name="jobtitle"
					value="" required="required"/>
			</p>
			<p>
				<span>Description:</span><input class="contact" type="text" name="description"
					value="" required="required"/>
			</p>
			<p>
				<span>Interview Date:</span><input class="contact" type="text" name="idate"
					value="" required="required"/>
			</p>
			<p>
				<span>Salary:</span><input class="contact" type="text" name="salary"
					value="" required="required"/>
			</p>
			<p>
				<span>Work Location:</span><input class="contact" type="text" name="worklocation"
					value="" required="required"/>
			</p>
			<p>
				<span>Percentage Required:</span><input class="contact" type="text" name="minimumpercentage"
					value="" required="required"/>
			</p>
			<p>
				<span>Branches can Apply:</span><input class="contact" type="text" name="branches"
					value="" required="required"/>
			</p>
			<p>
				<span>Designation:</span><input class="contact" type="text" name="designation"
					value="" required="required"/>
			</p>
			<p style="padding-top: 15px">
				<span>&nbsp;</span><input class="submit" type="submit"
					name="contact_submitted" value="Add Job" />
			</p>
		</div>
	</form>
</div>
<%@include file="footer.jsp"%>