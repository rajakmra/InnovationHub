<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<div id="main">
<head>
  <title>Patient History</title>
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
            <li><a href="DoctorHome.jsp">Doctor Home</a></li>
            <li><a href="PatirntHistoryRegistration.jsp">New Form</a></li>                                    
          </ul>
        </div>
      </nav>
  </header>
<div id="menu_container_login">
  <div class="box">
      <div class="static-form signup-scroll">
    <div class="static-form signup-scroll">
<form action="insertHistory" method="POST">
<h1 align="center">PATIENT HISTORY REGISTRATION</h1>
<div class = "static-form-group">
    <h2 class="dr_label">Patient Id</h2>
    <input type="text"name="patient_id">
</div>
<div class = "static-form-group">
    <h2 class="dr_label">Visited Date</h2>
    <input type="text"name="visited_date">
</div>
<div class = "static-form-group">
        <h2 class="dr_label">Visited Time</h2>
        <input type="text" name="visited_Time"><br>
</div>
<div class = "static-form-group">
    <h2 class="dr_label">Cause</h2>
    <input type="text" name="Cause"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Visited Hospital Id </h2>
    <input type="text" name="Visited_HospitaId"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Attended DoctorId</h2>
    <input type="text" name="Attended_DoctorId"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Prescription</h2>
    <input type="text" name="Prescription"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Suggestion</h2>
    <input type="text" name="Suggestion"><br>
    </div>
<div class = "static-form-group">
    <h2 class="dr_label">Remarks</h2>
    <input type="text" name="remark"><br>
    </div>

        <button class="button" onclick="clickAlert()" type="submit">SUBMIT</button>
<script>
  function clickAlert() {
    alert("Login successful");
}
</script>




</form>
</div>
</div>
</div>
</body>
</html>
    