package I.O;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
public static void main(String[] args) throws Exception {
	FileReader file = new FileReader ("C:\\Users\\asus\\Desktop\\java\\happy\\days.txt");
	
	int ch = file.read();
	while (ch != -1) {
	//System.out.print(ch);
	System.out.print((char)ch);
	ch = file.read();
}
	file.close();
}
}

