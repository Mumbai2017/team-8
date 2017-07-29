<?php

session_start();
$first = $_POST['fname'];
$doctor_id = $_POST['doctor_id'];
$email=$_POST['email'];
$pass=$_POST['password'];
$hospital_name = $_POST['hospital_name'];


$stmt = $con->prepare("INSERT INTO doctor (fname, doctor_id, email, password, hospital_name) VALUES (?, ?, ?,? ,?)");
$stmt->bind_param($first, $doctor_id,$email, $pass, $hospital_name);
$stmt->execute();
$stmt->close();
$stmt->close();
?>
