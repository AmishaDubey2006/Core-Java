package CollectionFrameWork;

import java.util.Comparator;

//( COMPARABLE )
public class Employee implements Comparable <Employee> {
	private int id = 0 ;
	private String name = null;
	private int salary = 0;
	
	public Employee (int id,String name , int salary) {
		this.id = id ;
		this.name = name ;
		this.salary= salary;
	}
	public int getId () {
		return id;
	}
	public String getname() {
		return name;
	}
	public int getsalary () {
		return salary;
	}
@Override
public String toString() {
	return id + " " + name + " " + salary;

}

@Override
public int compareTo(Employee o) {
	return  this.id-o.id;
//	 return this.name.compareTo(o.name);
	
	//return o.id-this.id;
	
	//if ( this.Id -o.id == o) {
		// return this.name.compareTo(o.name);
	}
	
}
                    //(COMPARATOR)
	
class OrderById implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return  o1.getId()-o2.getId();
}}


