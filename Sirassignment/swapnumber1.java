package Sirassignment;

import java.util.Scanner;

public class swapnumber1 {

	public static void main(String[] args) {
	/*	Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		
	//int a=20;
	//int b=30;
	System.out.println("before swapping  "+a+""+b  );
          a=a+b;
         b=a-b;
        a=a-b;
          System.out.println(a+"   "+b);*/
		
	int a=1234;
	while(a>0)
	{
		int d=a%10;
		System.out.print(d);

		a=a/10;
		
		}
	
		
	if(a==2||a==3||a==5)
		{System.out.println("prime no");}
	
	else if(a%2==0||a%3==0||a%5==0)

	{System.out.println();}
	
	else
		{System.out.println("prime number" );}
	
	
	
	
		
		
		
		
		
		
	}

}
