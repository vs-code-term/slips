<?php
// Initialize variables
$num = "";
$fib = "";
$sum = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $num = $_POST['number'];

    // -----------------------------
    // 1) Fibonacci Series
    // -----------------------------
    $a = 0;
    $b = 1;
    $fib = $a . " " . $b . " ";

    for ($i = 2; $i < $num; $i++) {
        $c = $a + $b;
        $fib .= $c . " ";
        $a = $b;
        $b = $c;
    }

    // -----------------------------
    // 2) Sum of Digits
    // -----------------------------
    $temp = $num;
    $sum = 0;

    while ($temp > 0) {
        $digit = $temp % 10;
        $sum += $digit;
        $temp = (int)($temp / 10);
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>PHP Self Processing Page</title>
</head>
<body>

<h2>Enter a Number</h2>

<form method="post" action="">
    Number: <input type="number" name="number" value="<?php echo $num; ?>" required>
    <br><br>
    <input type="submit" value="Submit">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    echo "<h3>Results:</h3>";
    echo "Fibonacci Series: " . $fib . "<br>";
    echo "Sum of Digits: " . $sum;
}
?>

</body>
</html>