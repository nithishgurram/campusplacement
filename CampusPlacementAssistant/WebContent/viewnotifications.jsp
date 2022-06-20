<%@page import="com.voidmain.pojo.JobApplication"%>
<%@page import="com.voidmain.pojo.Job"%>
<%@page import="com.voidmain.pojo.Notification"%>
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
		<h1>View Notification'S</h1>
		<%
			}
		%>

		<table style="width: 100%; border-spacing: 0;">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Description</th>
				<!-- <th>Date</th> -->
				<%
					if(role.equals("admin"))
					{
				%>
						<th>Delete</th>
				<%
					}
				%>
			</tr>
			<%
				for (Notification notification : HibernateDAO.getNotifications()) {
			%>
			<tr>
				<td><%=notification.getId()%></td>
				<td><%=notification.getTitle()%></td>
				<td><%=notification.getDescription()%></td>
				<%-- <td><%=notification.getNdate()%></td> --%>
				<%
					if(role.equals("admin"))
					{
				%>
					<td><a href="viewnotifications.jsp?id=<%=notification.getId()%>">delete</a></td>
				<%
					}
				%>
			</tr>

			<%
				}
			%>
		</table>
		
		<%
		String id = request.getParameter("id");

		if (id != null) {
			
			if (HibernateTemplate.deleteObject(Notification.class,Integer.parseInt(id)) == 1) {
				response.sendRedirect("viewnotifications.jsp?status=success");
			} else {
				response.sendRedirect("viewnotifications.jsp?status=failed");
			}
			
		}
	%>

	</div>
<%@include file="footer.jsp"%>