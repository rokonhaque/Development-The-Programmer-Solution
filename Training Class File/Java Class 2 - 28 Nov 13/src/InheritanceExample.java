import com.bit.pack.DemoPack;
import com.bit.pack.DemoPack3;



public class InheritanceExample extends DemoPack3
{
	// private variable can't be accessible unless getters and setters method defined
	DemoPack3 xy = new DemoPack3();
	
	void testmethod()
	{
		// to call any method or variable from other class you need to
		// create a method first
		System.out.println(xy.h);
		System.out.println(xy.getPrv());
		//System.out.println(xy.k); protected variable
		//System.out.println(xy.prv); private variable
		
	}
	
	void testmethod2()
	{
		System.out.println(h); // for inheritance you don't need to make object
		System.out.println(k);
		//System.out.println(prv); private variable
		
	}
	
	
	

}
