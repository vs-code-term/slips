<?php

$name = $_GET['name'];
$age = $_GET['age'];
$nation = $_GET['nation'];

$valid = true;


if (!preg_match("/^[A-Z]+$/", $name)) {
    echo "❌ Name must be in UPPERCASE letters only.<br>";
    $valid = false;
}

if ($age < 18) {
    echo "❌ Age must be 18 or above.<br>";
    $valid = false;
}

if ($nation != "Indian") {
    echo "❌ Nationality must be Indian.<br>";
    $valid = false;
}

if ($valid) {
    echo "✅ Eligible Voter!";
}
?>