package returntype;

public class Returntypemainforunderstand {

	public int test1()
	{
		int a=20;
		int b=30;
		int c=a+b;
		return b;
	}
	public char test2()
	{
		char a='b';
		return a;
	}
	
	public static void main(String[] args) {
		Returntypemainforunderstand obj=new Returntypemainforunderstand();
		int d=obj.test1();
          System.out.println(d);
          char w=obj.test2();
          System.out.println(w);
        		  
		
	}
	

	}


