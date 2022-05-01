package Sirassignment;

public class Starpractice {
	
	public void test1() {
	
		for(int i=1;i<=5;i++)
		{	
			for (int j=1;j<=i;j++)
				System.out.print(" ");
			for(int j=i;j<=5;j++)
				System.out.print("*");
			for(int j=i;j<5;j++)
				System.out.print("*");
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			System.out.println();
		
		}	
		for(int i=1;i<=5;i++)
		{	for(int j=i;j<=5;j++)
			System.out.print(" ");
		for(int j=1;j<i;j++)
			System.out.print("*");
		for(int j=1;j<=i;j++)
			System.out.print("*");
		System.out.println();
			
			
			
			
			
		}	
			
		
		
			
		  
		
	}           
		
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Starpractice OBJ=new Starpractice();
		OBJ.test1();
		
	}
	

}
