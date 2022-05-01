package overriddingandAbstarct;

public class Aabstract2 extends Aabstract {
	
	public void test2() 
	{ 
		System.out.println("hello ");
	}

	public void test3()
	{
		System.out.println("Hi I am sunil");
	}

   public static void main(String[] args) {   // incomplete method are comleted that is concrete class
	   Aabstract2 obj=new Aabstract2();
	   obj.test1();
	   obj.test2();
	   obj.test3();
	
}

	
}








