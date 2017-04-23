function moga()
		{
			var m = document.getElementById("a").value;
			if(m=="")
			{
				document.getElementById("ne").innerHTML="Name not found";
			}
			else
			{
				document.getElementById("ne").innerHTML="";
			}
			
			if(m!="asad" && m!="latif")
			{
				document.getElementById("me").innerHTML="Invalid Name";
			}
			else
			{
				document.getElementById("me").innerHTML="";
			}
			
		}