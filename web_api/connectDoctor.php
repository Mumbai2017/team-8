<?php

session_start();
include'config.php';
$email=$_POST['email'];
$pass=$_POST['password'];
$filter = ['email' => $email, 'password' => $pass ];
$query = new MongoDB\Driver\Query($filter);
$res = $mng->executeQuery("cfg8.doctor", $query);
$rows = current($res->toArray());
if (!empty($rows)) {
   echo "true";
   $_SESSION['email'] = $rows->email;
}
else
   echo "false";

if(isset($_POST['action']))
   unset($_SESSION['email']);

if(isset($_POST['action']))
   unset($_SESSION['email']);


?>

