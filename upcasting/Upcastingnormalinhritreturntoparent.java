package upcasting;

public class Upcastingnormalinhritreturntoparent extends Upcastingnormal {

	public void test1()
	{
		System.out.println("sunil");
	}
	
	public void test2()
	{
		System.out.println("munde");
	}
	
	public void test3()
	{
			System.out.println("bolo");
	}
	
 public static void main(String[] args) {
	 
	 
 Upcastingnormal obj1=new Upcastingnormalinhritreturntoparent ();
	 obj1.test1();// superclass name=new subclass
	 obj1.test2();	 // child property give parent class

	
}
	}


