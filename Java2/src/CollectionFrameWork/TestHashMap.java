package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oops.Person;

public class TestHashMap{
		public static void main(String[] args) {
			Person p1 = new Person(1,"Amisha");
			Person p2 = new Person (2,"Rusia");
			Person p3 = new Person (3, "America");
			List list = new ArrayList ();
			
			list.add("one");
			list.add(100);
			list.add("four");
			list.add("two");
			list.add("thousand");
			list.add(625);
			
			//for (Object object :list) {
				//System.out.println(object);
		//}
			
			
			for ( int i=0; i<list.size(); i++) {
				//System.out.println(list.get(i));
			
			
			
			Iterator it = list.iterator();
			while (it.hasNext()){
				//System.out.println(it.next());
				Person p = new Person (1, "Amisha");
				System.out.print(p2.getId ());
				System.out.println(" " + p2.getName());
				
				
			}
			
			
			}
		}}
		


