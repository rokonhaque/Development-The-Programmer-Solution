<html>

	<body>
	
	<?php
	
	$moganame = $_GET['moga1'];
	$mogaemail = $_GET['moga2'];
	$mogapass = $_GET['pass'];

	$con = mysqli_connect("localhost","root","","testdb1");
	if($con)
	{
		echo "Database connected";
		echo "<br>"
		$datainsert = "insert into studentinfo(name,email,password) values ('$moganame','$mogaemail','$mogapass')";
		mysqli_query($con,$datainsert);
		echo "Database inserted";
	}
	else
	{
		echo "Not connected";
	}
	
	
	?>
	<br>
	Your registration successful
	<br>
	
	<a href="getsite.html"> Back </a>
	
	</body>



</html>