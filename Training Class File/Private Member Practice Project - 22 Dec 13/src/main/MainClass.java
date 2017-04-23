package main;

import pac1.Class1;
import pac2.Class2;

public class MainClass extends Class1
{
	public static void main(String[] args)
	{
		Class2 c2 = new Class2();
		System.out.println(a); // a is coming from Class1 as its extended
		c2.b=1000;
		// c2.f = 20000; final variable can't be changed
		System.out.println(c2.b);
		System.out.println(c2.getP());
		System.out.println(c2.getName());
		System.out.println(c2.f);
	}

}
