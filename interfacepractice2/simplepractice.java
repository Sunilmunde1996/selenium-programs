package interfacepractice2;

public interface simplepractice {// bydefault public keyword and abstract present
	
	
	int a=20;// static, public,final in nature in variable
	int b=30;
	int v=40;
	void test1();
	void test2();
	void test3();
	
static void test4()// in interface only static method are possible to complete
{
	System.out.println(" hello");
}

public static void main(String[] args) { // static method can write complete in interface after java 8
	
	simplepractice.test4();
}
}
