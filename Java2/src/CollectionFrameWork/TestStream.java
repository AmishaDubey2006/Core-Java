package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {
		List <String> list = new ArrayList();
		
		list.add("one");
		list.add("jaipur");
		list.add("vrindawan");
		//list.add(1000);
		list.add("one");
		list.add("Morning Vibes");
		
		//list.forEach(e->{System.out.println(e);});
		
		list.stream().filter(e->e.startsWith(e)).map(e->e.toUpperCase()).sorted().distinct().forEach(e->{System.out.println(e);});
		
				
	}

}
