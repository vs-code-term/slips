<?php 
session_start();

echo "<br> Following values are taken from emp.html <br>"; 
echo "Employee Number is = " . $_GET['eno'] . "<br>"; 
echo "Employee Name is = " . $_GET['ename'] . "<br>"; 
echo "Employee Designation is = " . $_GET['edesi'] . "<br>"; 

$_SESSION['eno'] = $_GET['eno']; 
$_SESSION['ename'] = $_GET['ename']; 
$_SESSION['edesi'] = $_GET['edesi']; 
?>

<html> 
<head> 
<title>EMPLOYEE Salary Details</title> 
</head> 
<body> 

<form action="sessionemppayslip.php" method="GET"> 
    Enter Employee DA : <input type="text" name="eda"> <br> 
    Enter Employee HRA : <input type="text" name="ehra"> <br> 
    Enter Employee TA : <input type="text" name="eta"> <br> 
    <input type="submit" name="submit" value="Submit"> 
    <input type="reset" name="reset" value="Reset"> 
</form> 

</body> 
</html>