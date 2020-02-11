<%@page import="com.instgrs.dao.ComplaintDAO"%>
<%@page import="com.instgrs.model.Complaint"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <title>View Complaint Status</title>
        <%@include file="_links.jsp" %>
    </head>
    <body>
        <div class="container">
            <%
            if(session.getAttribute("email")!=null)
                {
            %>
            <%@include file="_header.jsp" %>
            <div class="container-fluid bg-light" id="profile">
                <center><h4 style="color: blue"><b>View Complaint Status</b></h4></center>
                <hr>
                <div class="row" id="cstatus">
                <div class="col-md-4">
                    <center><a href="view_status.jsp"> <button class="btn btn-primary">Pending</button></a></center>
                </div>
                    <div class="col-md-4">
                        <center><a href="view_status_1.jsp"><button class="btn btn-primary">Accepted</button></a></center>
                    </div> 
                    <div class="col-md-4">
                        <center><a href="view_status_2.jsp"><button class="btn btn-primary">Solved</button></a></center>
                    </div>
            </div>
                <hr>
                <%
                    for(Complaint c : ComplaintDAO.getComplaint(session)){
                        String email = session.getAttribute("email").toString();
                        if(c.getStatus().equals("Pending") && c.getEmail().equals(email))
                        {
                %>
                <div class="container">
                    <div class="row" id="Complaint">
                        <div class="col-md-4">
                            <p><b>Complaint ID</b> : <%=c.getId() %></p>
                            <p><b>College Unique Id </b>: <%=c.getUniqueId() %></p>
                            <p><b>Name</b> : <%=c.getName() %></p>
                            <p><b>Email</b> : <%=c.getEmail() %></p>
                            <p><b>Mobile</b> : <%=c.getMobile() %></p>
                        </div>
                        <div class="col-md-4">
                            <p><b>Institute</b> : <%=c.getInstitute() %></p>
                            <%
                            if(c.getCourse() != null){
                            %>
                            <p><b>Course</b> : <%=c.getCourse() %></p>
                            <% 
                            }
                            if(c.getBranch() != null){
                            %>
                            <p><b>Branch</b> : <%=c.getBranch() %></p>
                            <% } %>
                            <p><b>Designation</b> : <%=c.getDesignation() %></p>
                        </div>
                        <div class="col-md-4">
                            
                            <p><b>Problem Sent To</b> : <%=c.getDomain() %></p>
                            <p><b>Status</b> : <%=c.getStatus() %></p>
                            <p><b>Complaint Date</b> : <%=c.getComplaintDate() %></p>
                            <p><b>Solve Date</b> : 
                            <%
                                if(c.getSolveDate() == null ){
                            %>
                                Not Solved yet !
                            <%
                                }
                                else{
                            %>
                                    <%=c.getSolveDate()%>
                                    <%
                                }
                            %>    
                            </p>
                        </div>
                        <div class="row">
                            <p style="padding:0px 25px 0px 25px"><b>Problem </b> : <%=c.getProblem() %></p>
                        </div>
                    </div>
                        <hr>
                </div>
                <%
                    }
                    }
                %>
            </div>
            <%@include file="_footer.jsp" %>
            <%
            }
            else{
            response.sendRedirect("index.jsp");
        }
            %>
        </div>
            <%@include file="_script.jsp" %>
    </body>

</html>