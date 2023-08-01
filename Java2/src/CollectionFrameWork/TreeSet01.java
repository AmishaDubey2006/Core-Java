package CollectionFrameWork;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		
		set.add("a");
		set.add("f");
		set.add("e");
		set.add("y");
		set.add("c");
		set.add("i");
		set.add("s");
		set.add("p");
		
		for (Object object : set );
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("c"));
		System.out.println(set.tailSet("c"));
		System.out.println(set.subSet("a", "e"));
	}

}
