<?php
session_start();

$eda = $_GET['eda'];
$ehra = $_GET['ehra'];
$eta = $_GET['eta'];

$totalsal = $eda + $ehra + $eta;

echo "<br> Employee Number : " . $_SESSION['eno'];
echo "<br> Employee Name : " . $_SESSION['ename'];
echo "<br> Employee Designation : " . $_SESSION['edesi'];
echo "<br> Employee DA : " . $eda;
echo "<br> Employee HRA : " . $ehra;
echo "<br> Employee TA : " . $eta;
echo "<br> Employee Total Salary : " . $totalsal;

echo "<br><br>";

echo "<table border=2>";
echo "<tr><th colspan='7'>Employee Pay Slip</th></tr>";
echo "<tr>
        <th>Employee Number</th>
        <th>Employee Name</th>
        <th>Employee Designation</th>
        <th>Employee DA</th>
        <th>Employee HRA</th>
        <th>Employee TA</th>
        <th>Total Salary</th>
      </tr>";

echo "<tr>
        <td>" . $_SESSION['eno'] . "</td>
        <td>" . $_SESSION['ename'] . "</td>
        <td>" . $_SESSION['edesi'] . "</td>
        <td>" . $eda . "</td>
        <td>" . $ehra . "</td>
        <td>" . $eta . "</td>
        <td>" . $totalsal . "</td>
      </tr>";

echo "</table>";
session_destroy();
?>