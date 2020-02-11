<%@page import="com.instgrs.dao.AdminDAO"%>
<%@page import="com.instgrs.dao.UserDAO"%>
<%@page import="com.instgrs.model.Admin"%>
<%@page import="com.instgrs.model.User"%>
<%@page import="com.instgrs.dao.LoginDAO"%>
<jsp:useBean id="user" class="com.instgrs.model.User" scope="request"/>
<jsp:useBean id="admin" class="com.instgrs.model.Admin" scope="request"/>
<jsp:setProperty name="admin" property="*"/>
<jsp:setProperty name="user" property="*"/>
<%
    if(UserDAO.updatePassword(user) || AdminDAO.updatePassword(admin)){
        response.sendRedirect("index.jsp");
    }
    else{
        %>
    <script>
        alert("Something went wrong please try again later");
        window.location.href="index.jsp";
    </script>
    <%
    }
%>