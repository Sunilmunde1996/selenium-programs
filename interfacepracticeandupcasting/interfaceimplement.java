package interfacepracticeandupcasting;
public class interfaceimplement implements practice1 {
   
	public void test1()
	{ 
	System.out.println("hi");	
	}
	public void test2()
	{
		System.out.println("hello");
	}
	public void test3()
	{
	System.out.println("bye");	
	
	}
	
public static void main(String[] args) {
	interfaceimplement obj=new interfaceimplement();
	obj.test1();
	obj.test2();
	obj.test3();
	//int a=200; intrface variabl static final
	System.out.println(obj.a); // variable static therefor not change and 
	                               // directlycall with obj
	
}

	}


