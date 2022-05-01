package constructor;

public class Constructor {


	Constructor()
	{int Z=30;
	System.out.println(Z);
	}
	
	
	Constructor(int B)
	{B=40;
		System.out.println(B);
	}
	
	Constructor(int a,int b )
	{int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Constructor obj=new Constructor();
		Constructor obj1=new Constructor(40);
		Constructor obj2=new Constructor(40,50);


		
		
		
		
}

}
 