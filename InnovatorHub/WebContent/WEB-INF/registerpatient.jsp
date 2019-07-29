<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient Registration</title>
</head>
<body>
<form method="post" action="registerPatient">
Patient Id : <input type="text" name="patient_id" /><br>
Aadar Id : <input type="text" name="aadar_id" /><br>
Patient Name : <input type="text" name="patient_name" /><br>
Address : <input type="text" name="address" /><br>
Contact No : <input type="text" name="contact_no" /><br>
Contact Name : <input type="text" name="contact_name" /><br>
Contact Email : <input type="text" name="contact_mail" /><br>
Registered Date : <input type="text" name="reg_date" /><br>
Short Description : <input type="text" name="short_description" /><br>
Detail Description : <input type="text" name="long_description" /><br>
Registered Hospital ID : <input type="text" name="hospital_id" /><br>



<input type="submit" value="Register" />
</body>
</html>