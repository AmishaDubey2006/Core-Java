package core.java.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {
	public static void main(String[] args) throws ParseException {
		String str="20/06/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(str);
		System.out.println(d);
	}

}
