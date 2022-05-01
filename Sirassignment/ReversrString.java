package Sirassignment;

public class ReversrString {

	public static void main(String[] args) {
		
		String name="Sunil is good boy";
		int length=name.length();
		
      for(int i=length-1;i>0;i--)
      {
    	  System.out.print(name.charAt(i));
      }
	}
}