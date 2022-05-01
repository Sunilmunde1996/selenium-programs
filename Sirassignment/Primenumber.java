package Sirassignment;

public class Primenumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;int total=0;
		
		for (int i=2;i<=n;i++)
		 { int count=0;
			for (int j=2;j<i;j++)
			{	if(i%j==0)
					count++;
			}
			if(count==0)
				total++;
				
				System.out.print(i+" ");
			
		 }
		System.out.println("total prime number "+total);

			
			
			
			
			
		
		}
		
	
		}		
		
			
		
	


