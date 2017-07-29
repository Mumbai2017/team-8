<?php

session_start();
$first = $_POST['fname'];
$last = $_POST['lname'];
$email=$_POST['email'];
$pass=$_POST['password'];
$coll = 'cfg8.doctor';

$mng = new MongoDB\Driver\Manager("mongodb://localhost:27017");
$filter = ['email' => $email, 'password' => $pass ];
$query = new MongoDB\Driver\Query($filter);
$res = $mng->executeQuery($coll, $query);
$rows = current($res->toArray());

if (!empty($rows))
    echo "false";
else
{
    $bulk = new MongoDB\Driver\BulkWrite;
    $ins = [
        'name' => array('first' => $first,'last'=>$last),
        'email' => $email,
        'password' => $pass,
    ];
    $bulk->insert($ins);
    $mng->executeBulkWrite($coll, $bulk);
    echo "true";
}
$statement->close();
?>
