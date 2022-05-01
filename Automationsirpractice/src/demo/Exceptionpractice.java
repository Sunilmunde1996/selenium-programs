package demo;

public class Exceptionpractice {

		public  void divid(int a,int b)
		{	
			
            try 
            { 
        	     
        		 int c=a/b;
                 System.out.println(c);
            }
            catch(Exception e)   
            {
                 System.out.println("throws exception"+e);	
            	
            System.out.println("this division takes");	
            }
                 
		 }
		public static void test2() 
		{
			System.out.println("okk");
			
		}
		public static void main(String[] args) {
			
			Exceptionpractice obj=new Exceptionpractice();
			
					obj.divid(10, 0);
					Exceptionpractice.test2();
		}
		}

			
	
	
			
		
		
		

			


