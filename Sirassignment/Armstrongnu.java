package Sirassignment;

import java.util.Scanner;

public class Armstrongnu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(" ENTER ANY VALUE");
		Scanner obj=new Scanner(System.in);
		int n=obj. nextInt();
		
	//int n=145;
	int m=n;
	int arm=0;
	while(n>0)
	{
	int d=n%10;
	arm=(d*d*d)+arm;
	n=n/10;
	}
	if (arm==m)
	{
		System.out.println("it is armstrong number");
	}
	else
	{
	System.out.println("it is not armstrong number");	
	}
	}
	}
	
	
	
	


