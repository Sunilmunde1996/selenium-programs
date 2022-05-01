package palleendrome;

public class pallendromecode {

	public static void main(String[] args) {
		
		
		
		int n=12123;
		int m=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
			}
		if(sum==m)
		{
			System.out.println(" IT IS PALLINDROM NUMBER");
		}
		
		else
		{
			System.out.println("IT IS NOT PALLINDROM NUMBER");
			System.out.println("sunil");
		}

	}




	}


