package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oops.Person;

public class TestFramework {
	public static void main(String[] args) {

		Person p1 = new Person(1, "Amisha");
		Person p2 = new Person(2, "Rusia");
		 Person p3 = new Person(3,"America");
		 Person p4 = new Person(4,"Captain");

		List list = new ArrayList();

		list.add("one");
		list.add(100);
		list.add("Three");
		list.add(200);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

		// for (Object object : list) {
		// System.out.println(object);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}

	}
}
