package firstinhritance;

public class Return1 extends Practice  {
	
	
	
	static void test (int a) 
	{
		
	System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Return1.test(100);
		
		Practice.add();
		Return1.add();
		Return1.test(200);
	
	}

}