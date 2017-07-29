<?php

$mng = new MongoDB\Driver\Manager("mongodb://13.229.56.128:27017");
$coll = 'cgf.child';

echo "$coll->child"
?>