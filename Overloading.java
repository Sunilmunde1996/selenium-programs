
public class Overloading {

  public void add() {
	 System.out.println(" I AM SUNIL");
  }
 public void add(int a ) 
   {  System.out.println(" I AM SOMNATH");
   
   }
 public void add (int a,int b) 
 {
	 System.out.println("I am Arjun ");
 }
 public static void main(String[] args) {
	 Overloading obj=new Overloading();
	 obj.add();
	 obj.add(10);
	 obj.add(10,20);
	
}

}
		
	


