<?php
$first = $_POST['fname'];
$last = $_POST['lname'];
$status=$_POST['status'];
$wish1=$_POST['wish1'];
$wish2=$_POST['wish2'];
$wish3=$_POST['wish3'];
$rush=$_POST['rush'];
include('config.php');
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
        'parent_id'=>$parent_id,
        'wish'=> array('wish1'=>$wish1,
          'wish2'=>$wish2,
          'wish3'=>$wish3),
        'rush'=>$rush,
    ];
    $bulk->insert($ins);
    $mng->executeBulkWrite($coll, $bulk);
    echo"true";
}
?>
