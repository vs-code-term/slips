<?php
session_start();

if (!isset($_SESSION['valid'])) {
    echo "Unauthorized access!";
    exit();
}
?>

<html>
<body>
<h2>Welcome Message</h2>
<p>Welcome! Login Successful 🎉</p>
</body>
</html>