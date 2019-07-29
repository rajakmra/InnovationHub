<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<div id="main">
<head>
  <title>LOGIN PAGE</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
  <style>
 body{
background:url('BIG.jpg');
background-size:cover;
background-repeat:no=repeat;
margin:0;
padding:0;
font-family:Arial;
}
.login{
margin:auto;
width:250px;
box-shadow:0px 8px 16px 0px rgba(0,0,0,0,9);
padding:80px 40px;
margin-top:50px;
background:linear-gradient(top,#3c3c3c 0%,#222222 100%);
background:-webkit-linear-gradient(top,#3c3c3c 0%,#222222 100%);
}
.static-form-group{
	margin-top: 12px;
}
.static-form-group input{
	height: 25px;
	width: 100%;
	font-size: 16px;
	border: 1px solid #ddd;
	transition: all .4s ease;
}
.static-form-group input:hover, .static-form-group input:focus{
	border: 1px solid #777;
}
.static-form{
	margin-top: 2%;
	width: auto;
    display: block;
    margin-right: auto;
    margin-left: auto;
    text-align: center;
	padding: 12px 40px 24px 40px;
  background: rgb(68, 156, 214);
	box-shadow: 0 0 30px 0 rgba(0,0,0,.1)
}
.static-select{
  text-align: left;
}

.m-b-md {
  margin-bottom: 240px;
}
.dr_label{
	color: #5D5959;
	font-size: 16px;
	font-weight: 600;
	text-transform: uppercase;
	text-align: left;
	margin: 4px 0 4px 0;
}
.dr_label1{
	color: rgb(10, 9, 9);
	font-size: 16px;
	font-weight: 700;
	text-transform: uppercase;
	text-align: center;
	margin: 4px 0 4px 0;
}
.button {
  background-color: rgb(206, 25, 25); 
  border-radius: 12px;
  color: white;
  padding: 5px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  -webkit-transition-duration: 0.4s; 
  transition-duration: 0.4s;
  cursor: pointer;
  }
  .button:hover{
    background-color: white; 
    color: black; 
    border: 2px solid rgb(206, 25, 25);
  }
  .box {
  display: table;
  width: 100%;
  height: 100%;
  border-spacing: 0;
  table-layout: fixed;
}

      </style>

</head>

<body>
  <div id="#">
    <header>
       <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.html"><span class="logo_colour">Health Care Data Repository System</span></a></h1>
          <h2>We Care Your health and Record too...</h2>
        </div>
      </div>
      <nav>
        <div id="menu_container">
          <ul class="sf-menu" id="nav">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="plogin">Patient Login</a></li>
            <li><a href="#">About</a></li>                                    
          </ul>
        </div>
      </nav>
  </header>
<div id="menu_container_login">
  <div class="box">
      <div class="static-form signup-scroll">
    <div class="static-form signup-scroll">
<form action="PatientReg" method="POST">
<h1 align="center">PATIENT REGISTRATION</h1>
<div class = "static-form-group">
    <h2 class="dr_label">Patient Id</h2>
    <input type="text"name="patient_id">
</div>
<div class = "static-form-group">
        <h2 class="dr_label">Aadar Id</h2>
        <input type="text" name="aadar_id"><br>
</div>
<div class = "static-form-group">
    <h2 class="dr_label">Patient Name</h2>
    <input type="text" name="patient_name"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Address</h2>
    <input type="text" name="address"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Contact No</h2>
    <input type="text" name="contact_number"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Contact person</h2>
    <input type="text" name="contact_person"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Contact Email</h2>
    <input type="text" name="email"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Registered Date</h2>
    <input type="text" name="registered_Date"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Short Description</h2>
    <input type="text" name="short_description"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Detail Description</h2>
    <input type="text" name="detail_description"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Registered Hospital ID</h2>
    <input type="text" name="hospital_id"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">User Name</h2>
    <input type="text" name="username"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Password</h2>
    <input type="password" name="password"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Change Password</h2>
    <input type="password" name="change_password"><br>
    </div>           
        <button class="button"  type="submit">SUBMIT</button>

</script>

<h4><a href="Patient Registration.html">SIGN IN</a></h4>


</form>
</div>
</div>
</div>
</body>
</html>
    