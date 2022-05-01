package firstinhritance;

public class Practice4  {
	public void test (int a,int b) 
	{ 
		int c=a+b;
	System.out.println(c);
	}
	
	public void test (int a) 
	{  a=50;
	   System.out.println(a);
	}
	
	public void test (int e,char z) 
	{ e=100;
	z='f';
	System.out.println(z);
	}


	public static void main(String[] args) {
		Practice4 obj=new Practice4();
		obj.test(10,20);
		obj.test(60);
		obj.test(30,'z');
		
		
		
	}
	
	
}


	
   		 
		 
	 

	


	


