package interfacee;

public class Interface1 implements Interface {
	
	
	public void test1()
	{
		System.out.println("hello");
		
	
	}

      public  void test2()
	{
		System.out.println("hi");
	}
  public void test3()
    {
    	System.out.println("hi hello");
    }
    public static void main(String[] args) {
    	
    	Interface1 obj=new Interface1() ;
    	obj.test1();
    	obj.test2();
    	//obj.test3();
	}
}
 