<!DOCTYPE html>
<html>
    <head>
        <title>Dashboard - User Profile</title>
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
                <center><h4 style="color: blue"><b>User Profile</b></h4></center>
                <hr>
                <span> College Unique ID : <%=session.getAttribute("uniqueId")%></span><br><br>
                <span> Name : <%=session.getAttribute("name")%> </span><br><br>
                <span> Mobile Number : <%=session.getAttribute("mobile")%></span><br><br>
                <span> Email ID : <%= session.getAttribute("email")%></span><br><br>
                <span> Designation : <%= session.getAttribute("designation")%></span><br><br>
                
                <span> Institute : <%= session.getAttribute("institute")%></span><br><br>
                <%
                    if(session.getAttribute("designation").equals("Student") || session.getAttribute("designation").equals("Staff") || session.getAttribute("designation").equals("HOD") ){
                %>
                <span> Course : <%= session.getAttribute("course")%></span><br><br>
                <span> Branch : <%= session.getAttribute("branch")%></span>
                <%
                }
                %>
            </div>

            <%@include file="_footer.jsp" %>

        </div>

        <%@include file="_script.jsp" %>
        <%
        }
        else{
            response.sendRedirect("index.jsp");
        }
        %>
    </body>

</html>