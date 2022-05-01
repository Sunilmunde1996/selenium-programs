package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		
		LinkedList obj=new LinkedList<>();
		obj.add("veleocity");
		obj.add(5);
		obj.add('o');
		System.out.println(obj.get(0));
		
		Iterator obj1=obj.iterator();
		while(obj1.hasNext())
		{
		System.out.println(obj1.next());	
		}
		
		
	}

}
