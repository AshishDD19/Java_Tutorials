package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("demo.txt");
		
		try {
			
			//reading
			FileInputStream in = new FileInputStream(f);
			
			int i=0;
			while(i != -1) {
				i = in.read();
				System.out.print((char)i);
			}
			in.close();
			
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
