package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add (new Employee (2,"Amisha",50000));
		list.add (new Employee (1,"Priyanshi",400000));
		list.add (new Employee (6,"Sunaina",200000));
		list.add (new Employee (4,"Suman",300000));
		list.add (new Employee (5,"Sachin",80000));
		list.add (new Employee (7,"Rajjo",2000));
		list.add (new Employee (8,"khushali",75));
		
     // Collections.sort(list);
      
     Collections.sort(list,new OrderById());
      
                      //(FIRST METHOD)
      
      for (Object object :list) {
     System.out.println(object);
      }
     
                      // (SECOND METHOD)
      
    //  Iterator it = list.iterator();
    //  while (it.hasNext ()) {
    	 // Object object = it.next();
    	  //System.out.println(object);
    //  }
		
		}
		
	}


