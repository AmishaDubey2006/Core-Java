package CollectionFrameWork;

public class Person01 {
	private int id = 0;
	private String name = null;

	public Person01(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return"(" + id + " " + name + ")";
	}
  @Override
public boolean equals(Object obj) {
	  if (!(obj instanceof Person01)) {
		 return false;
	  }
	  Person01 p= (Person01) obj;
	  boolean b = this.id==p.id&&this.name.contentEquals(p.name);
	return b;
}
 public int hascode () {
	 String str = id+name;
	 return str.hashCode();
 }

}
