package Sirassignment;

public class Prime {

	public static void main(String[] args) {
		int n=10;
		
		for(int i=2;i<=n;i++)
		{ int count =0;
		//for (int j=2;j<i;j++)
			if(i%n==0)
				count++;
		
			if(count==0)
				System.out.print(" passs");
			
			else
				System.out.println("fail");
			
		}
		

	}

}
