package overriddingandAbstarct;

public class Abstract3 extends Abstract2 {


	public void tuesday() 
	 {
	   System.out.println(" IDBI BANK OFFER 5%");
	 }
   



public static void main(String[] args) {
	
	Abstract3 obj=new Abstract3();
	obj.RBI();
	obj.tuesday();
	obj.wednesday();
}

}


