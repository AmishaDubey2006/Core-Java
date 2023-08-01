package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestFail {
	public static void main(String[] args) {
	//	List list = new ArrayList ();
		
		Vector list = new Vector();
		
		list.add("one");
		list.add("Money");
		list.add(800);
		list.add(252);
		list.add("Dollar");
		
	//	Iterator it = list.iterator ();
	//	list.add("200");
	//	while (it.hasNext()) {
	//		System.out.println(it.next());
			
		Enumeration e = list.elements();
		list.add("200");
		while (e.hasMoreElements ()) {
			System.out.println(e.nextElement());
		}
		
		
		}
	}

//}
