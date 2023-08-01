package I.O;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\asus\\Desktop\\java\\happy\\days.txt");
		BufferedReader read = new BufferedReader(file);
		String line = read.readLine();
		while (line!=null) {
			System.out.println(line);
			line=read.readLine();
		}
		read.close();
		file.close();
		
	}
																
}
