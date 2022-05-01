package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
	ArrayList<String> li=new<String> ArrayList();
	li.add("velocity");
	//li.add(5);
	//li.add('c');
	Iterator i=li.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	} 	   

	}

}
