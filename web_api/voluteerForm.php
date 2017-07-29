<?php
include'config.php';

$first = $_POST['fname'];
$last = $_POST['lname'];
$status=$_POST['status'];
$wish1=$_POST['wish1'];
$wish2=$_POST['wish2'];
$wish3=$_POST['wish3'];
$rush=$_POST['rush'];


$stmt = $con->prepare("INSERT INTO wish (fname, lname, status, wish1, wish2, wish3, rush) VALUES (?, ?, ?, ? ,?,?,?)");
$stmt->bind_param($first, $last, $status, $wish1, $wish2, $wish3, $rush);
$stmt->execute();
$stmt->close();

?>
