package interfacepractice2;

public class Abstractpractice1 extends Abstractpractice {
	public void test1()
	{
		System.out.println(" bye");//abstract class override possible
	}
	void test2()
	{
		System.out.println("gon");
	}

void test3() 
{
	System.out.println("parli");
}
	
void test4()
{
	System.out.println("bid");
}
public static void main(String[] args) {
	Abstractpractice1 obj=new Abstractpractice1();
	obj.test1();
	obj.test2();
	obj.test3();
	obj.test4();
	
	
	
	
	
	
	
}

}


