<?php
include_once('include/config.php');
if(isset($_POST['submit']))
{
$staff_name=$_POST['staff_name'];
$password=$_POST['password'];
if(empty($staff_name) || empty($password)){
	echo '<script type="text/javascript">alert("Please fill all the fields");</script>';
	echo '<script type="text/javascript">window.location="login.php";</script>';
}
$query=mysql_query("insert into staff(staff_name,password) values('$staff_name','$password')");
if($query)
{
	echo "<script>alert('Successfully logged in');</script>";
	echo '<script type="text/javascript">window.location="testdashboard.html";</script>';
}


if($staff_name && $password){
	$query=mysqli_query($con, "SELECT * FROM staff WHERE staff_name='$staff_name'");
	$numrows=mysqli_num_rows($query);
	if($numrows!=0){
		$row=mysqli_fetch_array($query);
		$dbstaff_name=$row['staff_name'];
		$dbpassword=$row['password'];
	}

	if($staff_name==$dbstaff_name && $password==$dbpassword){
		//header("location:user.php");
		$_SESSION['loggedin'] = true;
		echo '<script type="text/javascript">alert("Login Successful");</script>';
		echo '<script type="text/javascript">window.location="testdashboard.html";</script>';
	}

	else{
		echo '<script type="text/javascript">alert("Login Failed");</script>';
		echo '<script type="text/javascript">window.location="login.php";</script>';

	}
}
}
?>


<!DOCTYPE html>
<html lang="en">

	<head>
		<title>Login</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta content="" name="description" />
		<meta content="" name="author" />
		<link href="http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="vendor/fontawesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="vendor/themify-icons/themify-icons.min.css">
		<link href="vendor/animate.css/animate.min.css" rel="stylesheet" media="screen">
		<link href="vendor/perfect-scrollbar/perfect-scrollbar.min.css" rel="stylesheet" media="screen">
		<link href="vendor/switchery/switchery.min.css" rel="stylesheet" media="screen">
		<link rel="stylesheet" href="assets/css/styles.css">
		<link rel="stylesheet" href="assets/css/plugins.css">
		<link rel="stylesheet" href="assets/css/themes/theme-1.css" id="skin_color" />
		
		
		

	</head>

	<body class="login">
		<!-- start: REGISTRATION -->
		<div class="row">
			<div class="main-login col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">

				<!-- start: REGISTER BOX -->
				<div class="box-register">
					<form name="login" id="login"  method="POST" action="login.php">
						<fieldset>
							<legend>
								Staff Login
							</legend>
		
	
							<div class="form-group">
								<span class="input-icon">
									<input type="text" class="form-control" name="staff_name" id="staff_name" onBlur="userAvailability()"  placeholder="Staff Name" required>
									<i class="fa fa-envelope"></i> </span>
									 <span id="user-availability-status1" style="font-size:12px;"></span>
							</div>
							<div class="form-group">
								<span class="input-icon">
									<input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
									<i class="fa fa-lock"></i> </span>
							</div>
		
							<div class="form-actions">
								<button type="submit" class="btn btn-primary pull-right" id="submit" name="submit">
									Submit <i class="fa fa-arrow-circle-right"></i>
								</button>
							</div>
						</fieldset>
					</form>

				</div>

			</div>
		</div>
		<script src="vendor/jquery/jquery.min.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="vendor/modernizr/modernizr.js"></script>
		<script src="vendor/jquery-cookie/jquery.cookie.js"></script>
		<script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
		<script src="vendor/switchery/switchery.min.js"></script>
		<script src="vendor/jquery-validation/jquery.validate.min.js"></script>
		<script src="assets/js/main.js"></script>
		<script src="assets/js/login.js"></script>
		<script>
			jQuery(document).ready(function() {
				Main.init();
				Login.init();
			});
		</script>
		
<!-- 	<script>
function userAvailability() {
$("#loaderIcon").show();
jQuery.ajax({
url: "check_availability.php",
data:'email='+$("#email").val(),
type: "POST",
success:function(data){
$("#user-availability-status1").html(data);
$("#loaderIcon").hide();
},
error:function (){}
});
}
</script>	 -->
		
	</body>
	<!-- end: BODY -->
</html>