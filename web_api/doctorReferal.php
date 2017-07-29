<?php

session_start();
$first = $_POST['fname'];
$last = $_POST['lname'];
$father_name = $_POST['fathername'];
$mother_name = $_POST['mothername']; 
$dob = $_POST['dob'];
$email = $_POST['email'];                   //doctor
$illness = $_POST['$illness'];
$wish1 = $POST['wish1'];
$wish2 = $POST['wish2'];
$wish3 = $POST['wish3'];                   
$coll = 'cfg8.child';

include'config.php';
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
        'dob' => $dob,
        'email' => $email,
        'illness' => $illness,
        'wish' => array('wish1' => $wish1, 'wish2' => $wish2, 'wish3' => $wish3)
    ];
    $bulk->insert($ins);
    $mng->executeBulkWrite($coll, $bulk);
    echo "true";
}

?>
