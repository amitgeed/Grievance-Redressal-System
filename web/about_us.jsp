<!DOCTYPE html>
<html>
    <head>
        <title>About Us</title>
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
                <center><h3>About Us</h3></center>
                <p>
                Grievance Redressal System is a mechanism commonly used to receive and act on complaints or grievances reported by stakeholders of private or public institutions, enabling prompt actions on any issue raised by them and to avail services more effectively. 
            </p>
            <p>
                Unlike the traditional Grievance Redressal approach through letters and complaint forms, the new online based approach such as grievance portals have very great appeal and its usage highly reflects the actual state of customer satisfaction. Grievance Redressal can be handled directly by institutes through their own websites. Also the smart web portal for grievance processing connects stakeholders and action-takers directly through online platform. Grievance Redressal System helps to pursue quick action for solving the grievance, while maintaining affordability and ease to the users. Online grievance redressal mechanism in higher education institutions facilitates the main constituents of the institute including students, teachers and other non-teaching staff to lodge grievances and ensure satisfactory solutions in a hassle-free manner.
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