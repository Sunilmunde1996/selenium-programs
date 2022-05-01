package overriddingandAbstarct;

public class Overriding2 extends Overridding {
	
	
 public static void test1()
  {  
	 System.out.println("good morning");

   }
 
 
 
 
     public  void  call()
     { 
    	 super.test1();
    	 this.test1();
    	 
     }
     
 public static void main(String[] args) {
	 
	 Overriding2.test1();
	 Overriding2.test2();
	 Overriding2 obj=new Overriding2();
	 obj.call();
	 Overriding2.test1();
	 Overridding.test1();// super class object creation not required
	 
}

}
