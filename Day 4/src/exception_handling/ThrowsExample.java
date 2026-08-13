package exception_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class DataSource{
	void readFile() throws IOException {
		File f=new File("D://Sample.txt");
		FileReader fr=new FileReader(f);
		fr.read();
		fr.close();
	}
}

public class ThrowsExample {
	
	public static void main(String[] args) {
		DataSource obj=new DataSource();
		try {
		obj.readFile();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
