package interfacepractice2;

public class Interfaceimplementation implements simplepractice {

 public void test1() //in public compulsary write they are public interface
 {
	 System.out.println("hi");
 }
 public void test2()
 {
	System.out.println(" bye");
 }
  	public void test3() 
	{
	System.out.println(" go for goa");	
	}
	
	
public static void main(String[] args) {
	Interfaceimplementation obj =new  Interfaceimplementation();
	obj.test1();
	obj.test2();
	obj.test3();
	
	
	
	
	
	simplepractice.test4();//static method inherits takes place but not overidding
	

}	
	
	
	}


