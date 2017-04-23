<html>


<body>

<?php  
$name = $_GET['name'];
$email = $_GET['email'];
$phone = $_GET['phone'];

$con=mysqli_connect("localhost","root","","stdinfo");
if($con)
{
	echo "Database connected";
	mysqli_query($con,"INSERT INTO register (name, email, sex) VALUES ('$name', '$email','$phone')");
}
else
{
	echo "Database connection failed";
}


?>



</body>




</html>