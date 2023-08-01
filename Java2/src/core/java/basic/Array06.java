package core.java.basic;

public class Array06 {
	public static void main(String[] args) {
		//int [] table = {2,4,6,8,10,12,14,16,18,20};
		String[]names= {"jahan" , "illahi"};
		int count =0;
		for (String s:names) {
			for (int c=0; c<s.length();c++) {
				if (s.charAt(c)=='a') {
					count++;
				}
				System.out.println("" + "c=" +count);
					
				}
			
			}
		}
		
	

}
