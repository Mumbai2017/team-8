<?php
$parent_id = $_POST['parent_id'];
$child_name = $_POST['child_name'];
$parent_name = $_POST['parent_name'];
$doctor_name = $_POST['doctor_name'];
$doctor_id = $_POST['doctor_id'];
$volunteer_id = $_POST['volunteer_id'];
$dob = $_POST['dob'];
$illness = $_POST['$illness'];
$wish_id = $_POST['wish_id'];

include'config.php';

$query = "Select * from child where parent_id = ? and illness  = ?";
$statement = $con->prepare($query);
$statement->bind_param($parent_id,$illness);
$statement->execute();
$result = $statement->get_result();
$row = $result->fetch_assoc();
if ($result->num_rows > 0){
    echo "Application Invalid";
}
else{
    $stmt = $con->prepare("INSERT INTO child (parent_id, child_name, dob, doctor_name, doctor_id, volunteer_id, illness, wish_id ) VALUES (?, ?, ?, ? ,?,?,?,?,?)");
    $stmt->bind_param($parent_id,$child_name,$dob,$parent_name,$doctor_name,$doctor_id,$volunteer_id, $illness,$wish_id );
    $stmt->execute();
    $stmt->close();
}
$statement->close();

?>
