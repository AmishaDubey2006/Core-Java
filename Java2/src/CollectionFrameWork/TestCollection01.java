package CollectionFrameWork;
                            //(INTERFACE LIST)

import java.util.ArrayList;
import java.util.List;

public class TestCollection01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add   ("one");
		list.add (100);
		list.add ("two");
		
		List sp = new ArrayList();
		sp.add ("625");
	    sp.add("tree");
	    sp.add(200);
		
		System.out.println(list.get(0));
		System.out.println(list.addAll(list));
		
		list.add(0,"i");
		System.out.println(list);
		
		//list.get('i');
	//	System.out.println(list);
		
		list.remove("i");
		System.out.println(list);
		
		list.set(3, "i");
		System.err.println(list);
		
		list.indexOf(0);
		System.err.println(sp);
		
		list.lastIndexOf(0);
		System.out.println(sp);
		
		list.subList(0, 3);
		System.err.println(list);
		
		
	    
	    
		
		
		
		
	}

}
