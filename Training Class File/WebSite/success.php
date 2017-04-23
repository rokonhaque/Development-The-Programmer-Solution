<?php
		
		$con = mysqli_connect("localhost","root","","bittechStudent");
		
		if($con)
		{
		$name = $_GET['n'];
		$email = $_GET['e'];
		$userid = $_GET['uid'];
		$password = $_GET['pass'];
		
		$sql="INSERT INTO register (Name, Email, UserId, Password)VALUES
				('$name','$email','$userid', '$password')";
		if(mysqli_query($con,$sql))
		{
			echo "Database saved successfully";
		}
			
		}
		else
		{
			echo "Not found";
		}
		
?>