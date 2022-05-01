package upcasting;

public class Upcastingtakesplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcasting obj=new Upcasting();
		//obj.test1();
		//obj.test2();
		Upcastingextends obj1= new	Upcastingextends();
		//obj1.test1();
		//obj1.test2();
		//obj1.test3();
		Upcasting obj3=new Upcastingextends ();
		obj3.test1();
		obj3.test2();
		//obj3.test3(); NO TAKES PLACE
		obj3.test1();
	
		
		

	}

}
