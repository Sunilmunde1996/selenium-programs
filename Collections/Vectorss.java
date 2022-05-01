package Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectorss {

	public static void main(String[] args) {
	Vector<String> obj=new<String> Vector();
	obj.add("velocity");
	obj.add("sunil");
	obj.add("munde");
//	obj.add(2);
	//System.out.println(obj.get(2));
	Iterator ll=obj.iterator();
	while(ll.hasNext())
	{
	System.out.println(ll.next());
	
	}	

	}

}
