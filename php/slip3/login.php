<?php
session_start();

$correct_user = "admin";
$correct_pass = "1234";

if (!isset($_SESSION['attempt'])) {
    $_SESSION['attempt'] = 0;
}

if (isset($_POST['login'])) {
    $user = $_POST['username'];
    $pass = $_POST['password'];

    if ($user == $correct_user && $pass == $correct_pass) {
        $_SESSION['valid'] = true;
        header("Location: welcome.php");
        exit();
    } else {
        $_SESSION['attempt']++;

        if ($_SESSION['attempt'] >= 3) {
            echo "<h3 style='color:red;'>Maximum attempts reached. Access Denied!</h3>";
            session_destroy();
        } else {
            echo "<h3 style='color:red;'>Invalid Username or Password. Attempts left: "
                 . (3 - $_SESSION['attempt']) . "</h3>";
        }
    }
}
?>

<html>
<body>
<h2>Login Form</h2>
<form method="post">
    Username: <input type="text" name="username"><br><br>
    Password: <input type="password" name="password"><br><br>
    <input type="submit" name="login" value="Login">
</form>
</body>
</html>