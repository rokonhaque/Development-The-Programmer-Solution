package pac2;

import pac1.Class1;

public class Class2 extends Class1
{
	public int b =20;
	private int p = 100;
	private String name = "Private Guy";
	protected int d = 200;
	
	public final int f = 500;
	
	void method1c2()
	{
		System.out.println(p);
	}
	
	public int getP()
	{
		return p;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	
}

