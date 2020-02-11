<%@page import="com.instgrs.dao.DesignationDAO"%>
<%@page import="com.instgrs.model.Designation"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.instgrs.dao.InstituteDAO"%>
<%@page import="com.instgrs.model.Institute"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration Page</title>
        <%@include file="_links.jsp" %>
        <script>
            function validateFormData() {
                var status = true;
                var name = document.getElementById('name').value;
                var uniqueId = document.getElementById('uniqueId').value;
                var email = document.getElementById('email').value;
                var mobile = document.getElementById('mobile').value;
                var instituteId = document.getElementById('institutes').value;
                var courseId = document.getElementById('courses').value;
                var branchId = document.getElementById('branches').value;
                var designationId = document.getElementById('designationId').value;
                var password = document.getElementById('password').value;

                var nameError = document.getElementById('nameError');
                var idError = document.getElementById('idError');
                var emailError = document.getElementById('emailError');
                var mobileError = document.getElementById('mobileError');
                var instError = document.getElementById('instError');
                var courseError = document.getElementById('courseError');
                var branchError = document.getElementById('branchError');
                var designationError = document.getElementById('designationError');
                var passwordError = document.getElementById('passwordError');

                //validate username
                if (name.length == 0) {
                    nameError.innerHTML = "*Username required";
                    status = false;
                } else {
                    nameError.innerHTML = "";
                }
                if (uniqueId.length == 0) {
                    idError.innerHTML = "*Please Enter Your College unique ID";
                    status = false;
                } else {
                    idError.innerHTML = "";
                }
                if (email.length == 0) {
                    emailError.innerHTML = "*Please Enter email id";
                    status = false;
                } else {
                    emailError.innerHTML = "";
                }
                if (mobile.length == 0) {
                    mobileError.innerHTML = "*Please Enter Mobile Number";
                    status = false;
                } else if (mobile.length < 10 || mobile.length > 10) {
                    mobileError.innerHTML = "*Enter Valid Mobile Number";
                    staus = false;
                } else if (isNaN(mobile)) {
                    mobileError.innerHTML = "*Enter Valid Mobile Number";
                } else {
                    mobileError.innerHTML = "";
                }
                if (instituteId == 0) {
                    instError.innerHTML = "*Please select your Institute";
                    status = false;
                } else {
                    instError.innerHTML = "";
                }
                if (courseId == 0) {
                    courseError.innerHTML = "*Please select your Institute";
                    status = false;
                } else {
                    courseError.innerHTML = "";
                }
                if (branchId == 0) {
                    branchError.innerHTML = "*Please select your Institute";
                    status = false;
                } else {
                    branchError.innerHTML = "";
                }
                if (designationId == 0) {
                    designationError.innerHTML = "*Please select your designation";
                    status = false;
                } else {
                    designationError.innerHTML = "";
                }
                if (password.length == 0) {
                    passwordError.innerHTML = "*Plrase Enter Password";
                    status = false;
                } else if (password.length < 5 || password.length > 20) {
                    passwordError.innerHTML = "*Inavlid Password length";
                    status = false;
                } else {
                    passwordError.innerHTML = "";
                }
                return status;
            }


            function getCourses(id) {
                var xhttp = new XMLHttpRequest();
                xhttp.open("GET", "getCourses.jsp?instituteId=" + id, true);
                xhttp.send();
                xhttp.onreadystatechange = function () {
                    if (xhttp.readyState == 4 && xhttp.status == 200) {
                        var data = xhttp.responseText;
                        data = JSON.parse(data);
                        var courseList = "<option value='0'>Select Course</option>";
                        for (var i = 0; i < data.length; i++) {
                            courseList = courseList + "<option value='" + data[i].id + "'>" + data[i].course + "</option>"
                        }
                        document.getElementById("courses").innerHTML = courseList;
                    }
                }
            }
            function getBranches(cid) {
                var xhttp = new XMLHttpRequest();
                xhttp.open("GET", "getBranches.jsp?courseId=" + cid, true);
                xhttp.send();
                xhttp.onreadystatechange = function () {
                    if (xhttp.readyState == 4 && xhttp.status == 200) {
                        var data = xhttp.responseText;
                        data = JSON.parse(data);
                        var branchList = "<option value='0'>Select Branch</option>";
                        for (var i = 0; i < data.length; i++) {
                            branchList = branchList + "<option value='" + data[i].id + "'>" + data[i].branch + "</option>";
                        }
                        document.getElementById("branches").innerHTML = branchList;
                    }
                }
            }
        </script>

    </head>
    <body>
        <div class="container-fluid">
            <div class="row d-flex">
                <div class="col-md-4 d-flex">

                </div>	

                <div class="col-md-4 p-4 bg-light" id="main-form">
                    <form action="register_task.jsp" method="post">
                        <center><h2 id="main_head"><b><span style="">Institutional-</span><span class="text-primary">GRS</span></b></h2></center><hr>
                        <center><h3>Register</h3></center>
                        <div class="">

                            <div class="form-group">
                                <input onkeyup="return validateFormData()" type="text" name="name" id="name" class="form-control" placeholder="Enter your name">
                                <small id="nameError"></small>
                            </div>
                            <div class="form-group">
                                <input onkeyup="return validateFormData()" type="text" name="uniqueId" id="uniqueId" class="form-control" placeholder="Enter your College Unique ID">
                                <small id="idError"></small>
                            </div>
                            <div class="form-group">
                                <input onkeyup="return validateFormData()" type="email" name="email" id="email" class="form-control" placeholder="Enter your Email ID">
                                <small id="emailError"></small>
                            </div>
                            <div class="form-group">
                                <input onkeyup="return validateFormData()" type="text" name="mobile" id="mobile" class="form-control" placeholder="Enter your Mobile Number">
                                <small id="mobileError"></small>
                            </div>
                            <div class="form-group">

                                <select onchange="getCourses(this.value)" onkeyup="return validateFormData()" name="instituteId" id="institutes" class="form-control">
                                    <option value="0">Select Your Institute</option>
                                    <%
                                        for (Institute i : InstituteDAO.getInstitutes()) {
                                    %>
                                    <option value="<%=i.getId()%>"><%=i.getInstitute()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                                <small id="instError"></small>
                            </div>
                            <div class="form-group">

                                <select onchange=" getBranches(this.value)" onkeyup="return validateFormData()" id="courses" name="courseId" class="form-control">
                                    <option>Select Your Course</option>

                                </select>
                                <small id="courseError"></small>
                            </div>
                            <div class="form-group">
                                <select id="branches" name="branchId" onchange="return validateFormData()" class="form-control">
                                    <option>Select Your Branch</option>
                                </select>
                                <small id="branchError"></small>
                            </div>
                            <div class="form-group">
                                <select name="designationId" id="designationId" onchange="return validateFormData()" class="form-control">
                                    <option value="0">Designation</option>
                                    <%
                                        for (Designation d : DesignationDAO.getDesignation()) {
                                            if (d.getId() < 3) {
                                    %>
                                    <option value="<%=d.getId()%>"> <%=d.getDesignation()%></option>
                                    <%
                                            }
                                        }
                                    %>
                                </select>
                                <small id="designationError"></small>
                            </div>
                            <div class="form-group">
                                <input onkeyup="return validateFormData()" type="password" name="password" id="password" class="form-control" placeholder="Create password">
                                <small id="passwordError"></small>
                            </div>
                        </div>

                        <div class="">
                            <div class="form-group">
                                <input type="submit" value="Register" onclick="return  validateFormData()" class="btn btn-primary">
                                <a href="index.jsp"><input style="float: right;" type="button" value="Login Here" class="btn btn-primary"></a>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-4 d-flex" >

                </div>
            </div>
        </div>
    </body>
</html>