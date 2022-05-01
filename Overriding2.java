
public class Overriding2 extends Overridding {


	 	public void add() 
	 		{
	 		System.out.println("my name munde");
	 		}
	 public void call()
	 	{
	 		super.add(); // immediate superclass prperty are given
	 		//this.add(); // current class property given
	 		
	 	}

      public static void main(String[] args) {
    	  
    	  Overriding2 obj=new Overriding2();
    	  obj.add();
    	  obj.call();
    	  obj.sub();

    			  
}
}
