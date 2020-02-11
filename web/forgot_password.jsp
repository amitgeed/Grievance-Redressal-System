<!DOCTYPE html>
<html>
<head>
	<title>Forgot Password</title>
        <%@include file="_links.jsp" %>
</head>
<body>
	<div class="container-fluid">
<div class="row d-flex">
	<div class="col-md-4 d-flex">
	
	</div>	
	
	<div class="col-md-4 p-4 bg-light" id="main-form">
            <form action="forgot_password_task.jsp" method="post">
    			
            	<center><h3>Forgot Password</h3></center>
            	<div class="">
                	<div class="form-group">
                            <input type="email" name="email" id="email" class="form-control" placeholder="Enter your email Id">
                	</div>
                	<div class="form-group">
                            <input type="password" name="password" id="password" class="form-control" placeholder="New Password">
                	</div>
                        
                </div>
            
            	<div class="">
                	<div class="form-group">
                    	<input type="submit" value="Change Password" class="btn btn-danger">
                        <a href="index.jsp"><input type="button" class="btn btn-primary" style="float: right;" value="Login Here" ></a>
                        </div>
           	</div>
                <div class="">
                    <div class="form-group">
                        
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