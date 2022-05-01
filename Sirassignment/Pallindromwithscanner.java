package Sirassignment;

import java.util.Scanner;

public class Pallindromwithscanner {
	
	
	
	public static void main(String[] intn) {
		
		System.out.println("enter value");
		Scanner ref=new Scanner(System.in);
		int  n=ref.nextInt();
		int m =n;
		int sum=0;
		while (n!=0) {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		
		if (sum==m)
			System.out.println("Pallindrom");
		else
			System.out.println("Not pallindrom");
			
		}
	}

