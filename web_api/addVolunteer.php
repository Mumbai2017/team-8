<?php
//$name=$_POST['name'];
$email=$_POST['email'];
//$username=$_POST['username'];
$first = $_POST['fname'];
$last = $_POST['lname'];
$dob=$_POST['dob'];
$password=$_POST['password'];
$credits=0;
$joindate=$_POST['joindate'];
include'config.php';
$filter = ['email' => $email,];
$query = new MongoDB\Driver\Query($filter);
$coll = 'cgf8.volunteer';
$res = $mng->executeQuery($coll, $query);
$rows = current($res->toArray());
if (!empty($rows))
    echo"false";
else
{
    $bulk = new MongoDB\Driver\BulkWrite;
    $ins = [
        'name' => array('first' => $first,
        'last'=>$last),
        'email' => $email,
        'dob'=> $dob,
        'credits'=>$credits,
        'joindate'=>$joindate,
        'password' => $password,
    ];
    $bulk->insert($ins);
    $mng->executeBulkWrite($coll, $bulk);
    echo"true";
}
?>
