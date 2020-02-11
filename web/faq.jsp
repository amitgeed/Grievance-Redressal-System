<!DOCTYPE html>
<html>
    <head>
        <title>Features and Benifits</title>
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
                <h3><b>Benifits</b></h3>
            <p>
                The prime benefit of EduGrievance is to make users get solved their problems easily by using the online complaint system. Files are kept confidential and publishing/sharing of the complaint will not happen in any case with this online system. The system can be used by institute stakeholders to raise their grievance and it is taken up by the officer incharge of specific category to give best solution to the problem. The user-friendly interface of the system reduces the distance and time barrier between users and institute management to create responsive and cordial situation in the institute. 
            </p>
            <h5><b>Following are the benifits of Grievances Redressal System</b></h5>
            <p>
                <ul>
                    <li>Students/parents/teachers/staff need not go directly to the grievance consultants to register complaints</li>
                    <li>Encourages users to raise grievances without fear</li>
                    <li>Provides a fair and speedy means of grievance handling</li>
                    <li>Save time of aggrieved person and cell members</li>
                    <li>Students, teachers and other non-teaching staff can lodge complaints in a discreet manner</li>
                    <li>Greater confidentiality and transparency in grievance dealing procedure</li>
                    <li>Helps to build harmonious atmosphere in campus with openness and trust</li>
                    <li>Automates entire complaint process right from registration to closure</li>
                    <li>Advantage over paper-based systems as GRS can alert users immediately on the grievance, action taken etc.</li>
                    <li>Round the clock availability of system</li>
                    <li>Improved communication by way of Email alerts</li>
                    <li>Streamlined and systematic grievance reporting</li>
                </ul>
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