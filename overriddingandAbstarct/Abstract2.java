package overriddingandAbstarct;

public class Abstract2 extends Abstract  {
	public void tuesday()
	  {
		System.out.println("hdfc bank offer 10% didscount");
	  }

     public void wednesday()
       {
    	 System.out.println("hdfc bank no offer");
       }
	
       public static void main(String[] args) {
    	   Abstract2 obj =new Abstract2();
    	   obj.RBI();
    	   obj.tuesday();
    	   obj.tuesday();
    	   
	 
              }



             }


