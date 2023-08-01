package core.java.basic;

public class StringPg40 {
	public static void main(String[] args) {
	   String s1 = "Vijay";         //it's not for  changing(string)"its immutable"
		String s2 = " Dinanath Chauhan";
		StringBuffer sb = new StringBuffer ("Vijay"); // for change "it's mutable" 
		sb.append("Dinanath Chauhan");
		System.out.println("Length:" +sb.length());
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("Char at:"+sb.charAt(1));
		System.out.println("Index Of:"+sb.indexOf("Dinanath"));
		System.out.println("Replace:"+sb.replace(0,5, "jay"));
		System.out.println("Reverse:"+sb.reverse());
		
		
	}

}
