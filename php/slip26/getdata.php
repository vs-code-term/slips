<?php
include("db.php");

if (isset($_GET['eno'])) {

    $eno = $_GET['eno'];

    // Query to fetch employee
    $query = "SELECT * FROM emp WHERE eno='$eno'";
    $result = mysqli_query($conn, $query);

    if ($row = mysqli_fetch_assoc($result)) {
        echo "<h3>Employee Details</h3>";
        echo "Employee No: " . $row['eno'] . "<br>";
        echo "Name: " . $row['ename'] . "<br>";
        echo "Designation: " . $row['designation'] . "<br>";
        echo "Salary: " . $row['salary'] . "<br>";
    } else {
        echo "No record found";
    }

} else {
    echo "Invalid Request";
}
?>