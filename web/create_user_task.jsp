<%@page import="com.instgrs.dao.UserDAO"%>
<jsp:useBean id="user" class="com.instgrs.model.User" scope="request"/>
<jsp:setProperty name="user" property="*"/>
<%
    if(UserDAO.registerUser(user)){
        %>
    <script>
        window.location.href="create_user.jsp";
    </script>
    <%
    }
    else
    {
    %>
    <script>
        alert("Registration Failed");
        window.location.href="create_user.jsp";
    </script>
    <%
    }
%>