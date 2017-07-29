<?php
include'config.php';
/*
$email=$_POST['email'];
$first = $_POST['fname'];
$last = $_POST['lname'];
$dob=$_POST['dob'];
$credits=0;
$joindate=$_POST['joindate'];
*/
$query = "Select * from volunteer";
$statement = $con->prepare($query);

$statement->execute();
$result = $statement->get_result();
$row = $result->fetch_assoc();
if ($result->num_rows >= 1) {
    echo "true";
}
else {
    echo "false";
}
$statement->close();
?>
