<?php
include("db.php");

if (isset($_GET['username']) && isset($_GET['password'])) {

    $username = $_GET['username'];
    $password = $_GET['password'];

    // Query to check user
    $query = "SELECT * FROM users WHERE username='$username' AND password='$password'";
    $result = mysqli_query($conn, $query);

    if (mysqli_num_rows($result) > 0) {
        echo "✅ Valid User";
    } else {
        echo "❌ Invalid Username or Password";
    }

} else {
    echo "Invalid Request";
}
?>