<%@page import="com.instgrs.dao.ComplaintDAO"%>
<jsp:useBean id="complaint" class="com.instgrs.model.Complaint" scope="request"/>
<jsp:setProperty name="complaint" property="*"/>
<%
    if (ComplaintDAO.registerComplaint(complaint)) {
%>
<script>
    alert("Yuor complaint has been registerd.");
    window.location.href = "view_status.jsp";
</script>    
<%
} else {
%>
<script>
    alert("Something went wrong please try after sometime.");
    window.location.href="register_complaint.jsp";
</script>
<%
    }
%>