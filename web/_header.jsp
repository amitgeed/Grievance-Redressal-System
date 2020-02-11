<div class="site-mobile-menu">
    <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
            <span class="icon-close2 js-menu-toggle"></span>
        </div>
    </div>
    <div class="site-mobile-menu-body"></div>
</div>
<header class="site-navbar container-fluid py-0 " role="banner">

    <!-- <div class="container"> -->
    <div class="row align-items-center">
        <div class="col-6 col-xl-3">
            <h1 class="mb-0 site-logo"><a href="index.jsp" class="text-light mb-0"> &nbsp; Institutional-<span class="text-primary">GRS</span>  </a></h1>
        </div>
        <div class="col-12 col-md-9 d-none d-xl-block">
            <nav class="site-navigation position-relative text-right" role="navigation">

                <ul class="site-menu js-clone-nav mr-auto d-none d-lg-block">
                    <li><a href="dashboard.jsp">Profile</a></li>
                    <li><a href="register_complaint.jsp">Register Complaint</a></li>
                    <li><a href="view_status.jsp">View Status</a></li>
                    <%
                        if(session.getAttribute("designation").equals("Student") || session.getAttribute("designation").equals("Staff")){
                    %>
                    
                    <%
                        }
                        else{
                    %>
                    <li><a href="view_complaint.jsp">View Complaints</a></li>
                    
                    <%
                        }
                        if(session.getAttribute("designation").equals("Admin")){
                    %>
                        <li><a href="create_user.jsp">Create User</a>
                    <%
                    }
                    %>
                    <li></li>
                    <li class="ml-xl-3 login"><a href="logout.jsp"><span class="border-left pl-xl-4"></span>Log Out</a></li>

                </ul>
            </nav>
        </div>
        <div class="d-inline-block d-xl-none ml-auto py-3 col-6 text-right" style="position: relative; top: 3px;">
            <a href="#" class="site-menu-toggle js-menu-toggle text-black"><span class="icon-menu h3" style="color:white"></span></a>
        </div>
    </div>
</header>
