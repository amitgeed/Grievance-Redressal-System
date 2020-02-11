<%@page import="com.instgrs.model.Institute"%>
<%@page import="com.instgrs.dao.InstituteDAO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Institutional GRS</title>
        <%@include file="_links.jsp" %>
        <script>
            function validateFormdata() {
                var status = true;
                var email = document.getElementById('email').value;
                var password = document.getElementById('password').value;

                var emailError = document.getElementById('emailError');
                var passwordError = document.getElementById('passwordError');

                if (email.length == 0) {
                    emailError.innerHTML = "*Email required";
                    status = false;
                } else {
                    emailError.innerHTML = "";
                }
                if (password.length == 0) {
                    passwordError.innerHTML = "*Enter valid Password";
                    status = false;
                } else {
                    passwordError.innerHTML = "";
                }
                return status;
            }
        </script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row d-flex">
                <div class="col-md-4 d-flex">

                </div>	

                <div class="col-md-4 p-4 bg-light" id="main-form">
                    <center><h2 id="main_head"><b><span style="">Institutional-</span><span class="text-primary">GRS</span></b></h2></center><hr>
                    <form action="login_task.jsp" method="post">

                        <center><h3>Sign In </h3></center>
                        <div class="">

                            <div class="form-group">
                                <input type="email" name="email" id="email" class="form-control" placeholder="Username" onkeyup="return validateFormdata()">
                                <small id="emailError"></small>
                            </div>

                            <div class="form-group">
                                <input type="password" name="password" id="password" class="form-control" placeholder="Password" onkeyup="validateFormdata()">
                                <small id="passwordError"></small>
                            </div>

                        </div>

                        <div class="">
                            <div class="form-group">
                                <a href="forgot_password.jsp"><span style="color:blue">Forgot Password ?</span></a>
                                <input style="float: right" type="submit" value="Login" onclick="return validateFormdata()" class="btn btn-primary">
                            </div>
                        </div>

                    </form>
                    <div>
                        <a href="register.jsp"><button class="btn btn-primary" style="float: left"><span style="color:black">New User ?</span></button></a>
                    </div>

                </div>
                <div class="col-md-4 d-flex" >

                </div>
            </div>
        </div>
    </body>
</html>