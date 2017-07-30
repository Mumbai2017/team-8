<?php
session_start();
$_SESSION['loggedin']=="";
session_unset();
session_destroy();
?>
<script language="javascript">
document.location="login.php";
</script>
