<%@page import="com.instgrs.model.Branch"%>
<%@page import="com.instgrs.dao.BranchDAO"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="branch" class="com.instgrs.model.Branch" scope="request"/>
<jsp:setProperty name="branch" property="*"/>
<%
    ArrayList<Branch> al = BranchDAO.getBranch(branch);
    Gson gson = new Gson();
    String data = gson.toJson(al);
    out.print(data);
%>