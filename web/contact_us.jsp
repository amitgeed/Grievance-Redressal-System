<!DOCTYPE html>
<html>
    <head>
        <title>Contact Us</title>
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
                <center><h3>Contact Us</h3></center>
                <p>
                Address: Lakshmi Narain College Of Technology Bhavrasala, Reoti Range , Sanwer Road,Indore- 453 331 (M.P.)
                <br>
                Phone: +91 731 4253100/ 01/ 02
                <br>
                Fax: +91 731 4253103
                <br>
                Email: admission@lnctindore.com
                <br>
                Website: <a href="www.lnctindore.com">www.lnctindore.com</a>
                <br>
                Admission
                <br>
                Phone: +91 97524 10847
                <br>
                Fax: +91 731 4253125
                <br>
                T & P Cell
                <br>
                Phone: +91 731 4253115
                <br>
                Email: placements@lnctindore.com
            </p>
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