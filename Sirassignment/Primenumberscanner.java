package Sirassignment;

import java.util.Scanner;

public class Primenumberscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" enter value");
		Scanner ref=new Scanner(System.in);
		int n=ref.nextInt();
		
					
		for(int i=2;i<=n;i++)
		{   int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					count++;
			}
			
			if(count==0)
				System.out.print(i+" ");
		}
		
		
		
	}

	}
