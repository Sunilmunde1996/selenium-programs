package firstinhritance;

public class Return {
	
	
	public static  int add  (int a,int b) {     // int a,int b it is global type
		
		//int a=20;
	//	int b=30;
		int c=a+b;
		return c;
	
	}
	public static  int sub() { // public= acess specifier, static =method, int=return type,sub=method name
		int x=50;
		int y=100;
		int z=x-y; 
		return z;
	}
	public static void main(String[] args) {
	      int d=Return.add(10,12);
	       System.out.println(d);                                                                   //System.out.println(Return.add()); 
		int z= Return.sub();
		System.out.println(z);
	}
	
	
	
	
	
	
	
	

	

}
