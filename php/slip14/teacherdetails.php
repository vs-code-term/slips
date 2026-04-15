<?php
$servername=“localhost”;
$username=“username”;
$password=“password”;
$dbname=“database_name”;
$conn=mysqli_connect($servername,$username,$password,$dbname);

If(!$conn){
Die(“Connectionfailed:“.mysqli_connect_error());
}
If(isset($_POST[‘tno’])){
$tno=$_POST[‘tno’];
$sql=“SELECT*FROM TEACHER WHERE tno=‘$tno’”;


$result=mysqli_query($conn,$sql);
if(mysqli_num_rows($result)>0){
$row=mysqli_fetch_assoc($result);
echo“TeacherName:“.$row[‘tname’].“<br>”;
echo“Qualification:“.$row[‘qualification’].“<br>”;
echo“Salary:“.$row[‘salary’].“<br>”;
}

else{
    echo“Nodatafound.”;
}
}
Mysqli_close($conn);
?>
