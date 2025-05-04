package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("D:\\java-files\\fileHandling\\fileHandling.txt");		
		String str = "Hi How Are You?";
		char[] ch = str.toCharArray(); 
		for(int i=0;i<ch.length;i++) {
			fout.write(ch[i]);
		}
		
	
		fout.close();
		
		
				
	}

}
