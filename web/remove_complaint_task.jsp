<%@page import="com.instgrs.dao.ComplaintDAO"%>
<jsp:useBean id="complaint" class="com.instgrs.model.Complaint" scope="request"/>
<jsp:setProperty name="complaint" property="*"/>
<%
    if (ComplaintDAO.removeComplaint(complaint)) {
%>
<script>
    alert('Complaint Removed');
    window.location.href = "view_complaint.jsp";
</script>
<%
} else {
%>
<script>
    alert('Soething went wrong');
    window.location.href = "view_complaint.jsp";
</script>
<%
    }
%>