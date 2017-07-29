<?php
include'config.php';


$email=$_POST['email'];
$first = $_POST['fname'];
$last = $_POST['lname'];
$dob=$_POST['dob'];
$credits=0;
$joindate=$_POST['joindate'];

$stmt = $con->prepare("INSERT INTO volunteer (fname, lname, dob, email, joindate, credits) VALUES (?, ?, ?, ? , ?)");
$stmt->bind_param($first, $last, $dob, $email, $joindate, $credits);
$stmt->execute();
$stmt->close();
?>
