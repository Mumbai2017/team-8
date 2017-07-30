<?php
include('include/config.php');
?>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Admin | Volunteers</title>
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
		<link href="vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.css" rel="stylesheet" media="screen">
		<link href="vendor/select2/select2.min.css" rel="stylesheet" media="screen">
		<link href="vendor/bootstrap-datepicker/bootstrap-datepicker3.standalone.min.css" rel="stylesheet" media="screen">
		<link href="vendor/bootstrap-timepicker/bootstrap-timepicker.min.css" rel="stylesheet" media="screen">
		<link rel="stylesheet" href="assets/css/styles.css">
		<link rel="stylesheet" href="assets/css/plugins.css">
		<link rel="stylesheet" href="assets/css/themes/theme-1.css" id="skin_color" />
        <style>
        form {
float:right;
margin:25px 25px 0 0;
}
        </style>
	</head>
	<body>
		<div id="app">
			<div class="app-content">

				<!-- end: TOP NAVBAR -->
				<div class="main-content" >
					<div class="wrap-content container" id="container">
						<!-- start: PAGE TITLE -->
						<section id="page-title">
							<div class="row">
								<div class="col-sm-8">
									<h1 class="mainTitle">Admin | Manage Volunteers</h1>
																	</div>
								<ol class="breadcrumb">
									<li>
										<span>Admin</span>
									</li>
									<li class="active">
										<span>Manage Volunteers</span>
									</li>
								</ol>
							</div>
						</section>
						<!-- end: PAGE TITLE -->
						<!-- start: BASIC EXAMPLE -->
						<div class="container-fluid container-fullw bg-white">


									<div class="row">
								<div class="col-md-12">
									<h5 class="over-title margin-bottom-15">Manage <span class="text-bold">Volunteers</span></h5>
		
									<table class="table table-hover" id="sample-table-1">
										<thead>
											<tr>
												<th>Volunteer's name</th>
												<th>Name of child</th>
												<th>Doctor name</th>
												<th>Wish </th>
												<th>Action</th>
											</tr>
										</thead>

										<tbody>
										<?php

											$sql=mysqli_query($con,"select * from volunteer") or die("Connection Error");
											$numrows=mysqli_num_rows($sql);
											if($numrows>0)
											while($row=mysqli_fetch_array($sql))
											{

												$vol_id=$row['Volunteer_id'];

											?>

											<tr>
												
												<td><?php echo $row['Fname'];?></td>

												<?php

												$sql2=mysqli_query($con,"select * from child where volunteer_id='$vol_id'") or die(mysqli_error($con));

												$numrows2=mysqli_num_rows($sql2);
												if($numrows2>0)
												while($row2=mysqli_fetch_array($sql2))
											{
													$wish_id=$row2['wish_id'];
													?>
													<!-- <input id="wid" type="button" value="<?php echo $wish_id;?>"> 
													<?php
												?> -->

												<td><?php echo $row2['child_name'];?></td>
												<td><?php echo $row2['doctor_name'];?></td>

												<?php

												$sql3=mysqli_query($con,"select * from wishtable where wish_id='$wish_id'") or die("Connection Error");
												$numrows3=mysqli_num_rows($sql3);

												if($numrows3>0)
												while($row3=mysqli_fetch_array($sql3))
												{
												?>

												<td> <label for="wishes">Wishes</label>
                                                        <select id="wishlist" name="Wishes">
                                                        <option id="wish1" value="wish1"><?php echo $row3['wish1'];?></option>
                                                        <option id="wish2" value="wish2"><?php echo $row3['wish2'];?></option>
                                                        <option id="wish3" value="wish3"><?php echo $row3['wish3'];?></option>
                                                        </select>
                                                </td>
												<td><div>
										        <input id="verify" type="button" value = "verify choice"/>
										        </div></td>
												
												<td id="printText" value="">
													
												</td>
                                           
											</tr>

											<?php
												}
											}
										}?>


										</tbody>
									</table>
								</div>
							</div>
								</div>
							</div>
						</div>
						<!-- end: BASIC EXAMPLE -->
						<!-- end: SELECT BOXES -->
                        <form method="get" action="testdashboard.html">
    <button type="submit">Go back to ADMIN Homepage</button>
</form>
					</div>
				</div>
			</div>
			<!-- start: FOOTER -->

			<!-- start: SETTINGS -->

			<!-- end: SETTINGS -->
		</div>
		<!-- start: MAIN JAVASCRIPTS -->
		<script src="vendor/jquery/jquery.min.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="vendor/modernizr/modernizr.js"></script>
		<script src="vendor/jquery-cookie/jquery.cookie.js"></script>
		<script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
		<script src="vendor/switchery/switchery.min.js"></script>
		<!-- end: MAIN JAVASCRIPTS -->
		<!-- start: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
		<script src="vendor/maskedinput/jquery.maskedinput.min.js"></script>
		<script src="vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.js"></script>
		<script src="vendor/autosize/autosize.min.js"></script>
		<script src="vendor/selectFx/classie.js"></script>
		<script src="vendor/selectFx/selectFx.js"></script>
		<script src="vendor/select2/select2.min.js"></script>
		<script src="vendor/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
		<script src="vendor/bootstrap-timepicker/bootstrap-timepicker.min.js"></script>
		<!-- end: JAVASCRIPTS REQUIRED FOR THIS PAGE ONLY -->
		<!-- start: CLIP-TWO JAVASCRIPTS -->
		<script src="assets/js/main.js"></script>
		<!-- start: JavaScript Event Handlers for this page -->
		<script src="assets/js/form-elements.js"></script>
		<script>
			jQuery(document).ready(function() {
				Main.init();
				FormElements.init();
			});
			$("#verify").click(function(){
				//alert("working");
				var box = document.getElementById('wishlist');
				var id = document.getElementById('wid');
				var selectedwish = box.options[box.selectedIndex].text;
				$("#printText").html(selectedwish);
				 /*$.ajax({
				 	url:"update.php",
				 	type:"post",
				 	data:{selectedwish,id},
				 	success:function(result){
				 		alert(result);
				 	}

				 });*/
			});
		</script>
		<!-- end: JavaScript Event Handlers for this page -->
		<!-- end: CLIP-TWO JAVASCRIPTS -->
	</body>
</html>
