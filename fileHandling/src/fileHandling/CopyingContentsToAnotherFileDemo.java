package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingContentsToAnotherFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream reading = new FileInputStream("D:\\java-files\\fileHandling\\fileHandling1.txt");
		
		FileOutputStream writing = new FileOutputStream("D:\\java-files\\fileHandling\\file2.txt");
		
		int i;
		
		do {
			i = reading.read();
			if(i != -1) {
				writing.write((char)i);
			}
		}while(i != -1);
	}

}
