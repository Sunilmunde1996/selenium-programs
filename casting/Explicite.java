package casting;

public class Explicite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=40.60;// data loss occur
		int b= (int)a;
		System.out.println(b);
		double d=60.44444444;
		float c = (float)d;
		System.out.println(c);
		int x=128;
		byte y= (byte)x;
		System.out.println(y);
		
	}

}
