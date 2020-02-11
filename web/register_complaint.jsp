<!DOCTYPE html>
<html>
    <head>
        <title>Register Compaint</title>
        <%@include file="_links.jsp" %>
        <script>
            function validateFormData() {
                var status = true;
                var problem = document.getElementById('problem').value;
                var domain = document.getElementById('domain').value;
                
                var problemError = document.getElementById('problemError');
                var domainError = document.getElementById('domainError');
                
                if(problem.length == 0){
                    problemError.innerHTML = "Please Describe Your Problem";
                    status = false;
                }
                else{
                    problemError.innerHTML = "";
                }
                if(domain == 0){
                    domainError.innerHTML = "Select your problem domain";
                    status = false;
                }
                else{
                    domainError.innerHTML = "";
                }
                return status;
            }    
        </script>
    </head>
    <body>
        <div class="container">
        <%
            if(session.getAttribute("email")!=null)
                {
        %>   
            <%@include file="_header.jsp" %>
            
            <div class="container-fluid bg-light" id="main-form">
                <form action="register_complaint_task.jsp" method="post">

                    <center><h3>Register Complaint</h3></center><hr>
                    <div class="">

                        <div class="form-group">
                            <input type="text" name="name" class="form-control" value="<%= session.getAttribute("name") %>" >
                        </div>
                        <div class="form-group">
                            <input type="text" name="uniqueId" class="form-control" value=" <%= session.getAttribute("uniqueId") %>" >
                        </div>
                        <div class="form-group">
                            <input type="email" name="email" class="form-control" value=" <%= session.getAttribute("email") %>" >
                        </div>
                        <div class="form-group">
                            <input type="text" name="mobile" class="form-control" value=" <%= session.getAttribute("mobile") %>">
                        </div>
                        <div class="form-group">
                            <select class="form-control" name="institute">
                                <option value="<%=session.getAttribute("institute") %>"><%=session.getAttribute("institute") %></option>
                            </select>
                        </div>
                        <%
                            if(session.getAttribute("designation").equals("Student") || session.getAttribute("designation").equals("Staff") || session.getAttribute("designation").equals("HOD")){
                        %>
                        <div class="form-group">
                            <select class="form-control" name="course">
                                <option value="<%=session.getAttribute("course") %>"><%=session.getAttribute("course") %></option>
                            </select>
                        </div>
                        <div class="form-group">
                            <select class="form-control" name="branch">
                                <option value="<%=session.getAttribute("branch") %>"><%=session.getAttribute("branch") %></option>
                            </select>
                        </div>
                        <%
                            }
                        %>
                        <div class="form-group">
                            <select class="form-control" name="designation">
                                <option value="<%=session.getAttribute("designation") %>"><%=session.getAttribute("designation") %></option>
                            </select>
                        </div>

                        <div class="form-group">
                            <select class="form-control" name="domain" id="domain">
                                <option value="0">Select Your Problem Domain</option>
                                <option value="Maintainance">Electricity</option>
                                <option value="Server_Room">Computer</option>
                                <option value="Principal">Academic</option>
                                <option value="HOD">Class</option>
                                <option value="Registrar">Administrator</option>
                                <option value="Maintainance">Cleaning</option>
                                <option value="Transport_Incharge">Transport</option>
                            </select>
                            <small id="domainError"></small>
                        </div>

                        <div class="form-group">
                            <textarea class="form-control" name="problem" id="problem" placeholder="Describe your problem" onkeyup="validateFormData()">

                            </textarea>
                            <small id="problemError"></small>
                        </div>

                    </div>

                    <div class="">
                        <div class="form-group">
                            <input onclick="return validateFormData()" type="submit" value="Register" class="btn btn-primary">
                        </div>
                    </div>
                </form>
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