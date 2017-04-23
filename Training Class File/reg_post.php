<html>

	<body>
	
	<?php
	
	$moganame = $_POST['moga1'];
	$mogaemail = $_POST['moga2'];
	$mogapass = $_POST['pass'];

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
	
	<a href="postsite.html"> Back </a>
	
	</body>



</html>