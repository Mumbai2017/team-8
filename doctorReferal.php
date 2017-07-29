<?php

session_start();
$first = $_POST['fname'];
$last = $_POST['lname'];
$father_name = $_POST['fathername'];
$mother_name = $_POST['mothername']; 
$dob = $_POST['dob'];
$illness = $_POST['$illness'];
$email=$_POST['email'];                     //doctor
$coll = 'cfg8.child';

$mng = new MongoDB\Driver\Manager("mongodb://localhost:27017");
$filter = ['email' => $doc_email];
$query = new MongoDB\Driver\Query($filter);
$res = $mng->executeQuery($coll, $query);
$rows = current($res->toArray());

if (!empty($rows))
    echo"false";
else
{
    $bulk = new MongoDB\Driver\BulkWrite;
    $ins = [
        'child_name' => array('first' => $first,'last'=> $last, 'father' => $father_name, 'mother' => $mother_name),
        'dob' => $dob;
        'illness' => $illness;
        'email' => $email,
    ];
    $bulk->insert($ins);
    $mng->executeBulkWrite($coll, $bulk);
    echo "true";
}
$statement->close();
?>
