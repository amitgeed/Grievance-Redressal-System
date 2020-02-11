<%@page import="com.instgrs.dao.UserDAO"%>
<jsp:useBean id="user" class="com.instgrs.model.User" scope="request"/>
<jsp:setProperty name="user" property="email"/>
<%
  if(UserDAO.verifyUser(user))
    response.sendRedirect("index.jsp");
%>