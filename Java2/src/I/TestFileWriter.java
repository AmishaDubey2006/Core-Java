package I.O;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\asus\\Desktop\\java\\happy\\rays.txt");
		
		file.write("Hello amisha");
		file.close();
	}

}
