
public class Demo1 
{
	//State / Variable / Properties
	
	 final int a = 5; // Global variable  / instance variable
	
	
	String name = "Example Name"; //Global variable / instance variable
	
	//Behavior / Method / Function / Action
	
	void xyz()
	{
		int a = 10;
		int b = 10; // local variable / method variable
		System.out.println(name);
		
	}
	
	int abc()
	{
		
		return 10;
	}
	
	String bit()
	{
		return name;
	}
	
	int tech()
	{
		int c =7;
		//return b; Not possible as this is a local variable in another method
		return c;
		
	}

}
