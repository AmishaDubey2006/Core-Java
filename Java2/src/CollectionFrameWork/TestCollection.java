package CollectionFrameWork;
                              //(INTERFACE COLLECTION)
import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection List = new ArrayList();
		
		List.add("one");
		List.add(100);
		List.add("two");
		List.add("village");
		
	    System.out.println(List);
		
		
		Collection c = new ArrayList();
		
		c.add("three");
		c.add (700);
		c.add ("four");
		//List.clear();
		System.out.println(c);
		Collection op = new ArrayList();
		op.add(500);
		op.add(800);
		op.add("hbd");
		
		
		List.addAll(c);
		System.out.println(List);
		List.addAll(op);
		
		List.contains(100);
		System.out.println(List.contains(100));
		
		List.containsAll(List);
		System.out.println(List);
		
		List.isEmpty();
		System.out.println();
		
		List.remove( "village");
		System.out.println(List);
		
		
		List.removeAll(c);
		System.out.println(List);
		
	   List.iterator();
	   System.out.println(List);
	   
	   List.retainAll(c);
	   System.out.println(op);
	    List.size();
	    System.out.println( List.size());
	}}
	    
	    
	    
	    
	
		

		
		
		
		
