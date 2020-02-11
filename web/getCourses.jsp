<%@page import="com.instgrs.dao.CoursesDAO"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.instgrs.model.Courses"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="course" class="com.instgrs.model.Courses" scope="request"/>
<jsp:setProperty name="course" property="*"/>
<%
    ArrayList<Courses> al = CoursesDAO.getCourses(course);
    Gson gson = new Gson();
    String data = gson.toJson(al);
    out.print(data);
%>