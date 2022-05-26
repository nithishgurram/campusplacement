<%@page import="com.voidmain.pojo.Comment"%>
<%@page import="java.util.Date"%>
<%@page import="com.voidmain.pojo.Question"%>
<%@page import="com.voidmain.dao.HibernateTemplate"%>
<%@page import="com.voidmain.dao.HibernateDAO"%>
<%@page import="java.util.List"%>
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
	<h1>View Question's</h1>
	<%
		}
	%>
	
	<%
		for (Question question : HibernateDAO.getQuestions()) 
		{
	%>
			<h2>Question: <%=question.getQuestion()%><br/> </h2>
			Date and Time :<%=question.getQdate()%>
			Posted By : <%=question.getPostedby()%> <br/><br/>
			
			<%
				if(question.getPostedby().equals(username))
				{
			%>
					<a href="viewquestions.jsp?id=<%=question.getId()%>">delete</a>
			<%		
				}
			%>
			

			<h3>Comments</h3>
			
			<form action="VoidmainServlet" method="post" name="appform">
			
				<input type="hidden" name="type" value="com.voidmain.pojo.Comment">
				<input type="hidden" name="operation" value="add"> 
				<input type="hidden" name="redirect" value="viewquestions.jsp">
				
				<input type="hidden" name="qid" value="<%=question.getId()%>">
				<input type="hidden" name="postedby" value="<%=username%>"> 
				<input type="hidden" name="cdate" value="<%=new Date().toString()%>">
					
				<div class="form_settings">
					<p>
						<span>Write Your Comment Here </span><input type="text" name="comment">
					</p>
					<p style="padding-top: 15px">
						<span>&nbsp;</span><input class="submit" type="submit"
							name="contact_submitted" value="Post Comment" />
					</p>
				</div>
			</form>
			
			<%
				for (Comment comment : HibernateDAO.getComments()) 
				{
					if(comment.getQid()==question.getId())
					{
			%>
						<p>
							<%=comment.getComment()%> --  posted by: <%=comment.getPostedby()%> -- Date: <%=comment.getCdate()%> <br> 
						</p>
			<%			
					}
				}
			%>
			<br>
			<hr>
	<%
		}
	%>
	
	<%
		String id = request.getParameter("id");

		if (id != null) {
			if (HibernateTemplate.deleteObject(Question.class,Integer.parseInt(id)) == 1) {
				response.sendRedirect("viewquestions.jsp?status=success");
			} else {
				response.sendRedirect("viewquestions.jsp?status=failed");
			}
		}
	%>
	
</div>