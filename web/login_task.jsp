<%@page import="com.instgrs.model.Admin"%>
<%@page import="com.instgrs.model.User"%>
<%@page import="com.instgrs.dao.LoginDAO"%>
<jsp:useBean id="user" class="com.instgrs.model.User" scope="request"/>
<jsp:useBean id="admin" class="com.instgrs.model.Admin" scope="request"/>
<jsp:setProperty name="admin" property="*"/>
<jsp:setProperty name="user" property="*"/>
<%
    if(LoginDAO.authenticateUser(user, session) || LoginDAO.authenticateAdmin(admin, session)){
        response.sendRedirect("dashboard.jsp");
    }
    else{
        %>
        <script>
            alert('Invalid Email or Password');
            window.location.href="index.jsp";
        </script>
        <%
    }
%>