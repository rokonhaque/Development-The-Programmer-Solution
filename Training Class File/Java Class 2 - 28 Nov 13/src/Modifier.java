import com.bit.pack.DemoPack;
import com.bit.pack.DemoPack3;


public class Modifier
{

	public static void main(String[] args) 
	{
		// To access any variable and method from another class
		// we have to ways - 1. Object creation 2. Inheritance(extends)
		int b =8;
		Calculator cal = new Calculator();
		cal.add();
		//int c = b + cal.a;
		//System.out.println(c);
		System.out.println(b + cal.a);
		//System.out.println(cal.x); x variable is private
		System.out.println(cal.y);
		
		DemoPack xy = new DemoPack();
		System.out.println(xy.m);
		xy.use();
		
		
		DemoPack3 yz = new DemoPack3();
		System.out.println(yz.getPrv());
		
		
		
		
		
		
		
		
	}

}
