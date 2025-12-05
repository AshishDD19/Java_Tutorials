package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("demo.txt");
		
		try {
			//writting
			FileOutputStream out  = new  FileOutputStream(f);
			String text = "Welcome to file handling";
			
			byte [] b = text.getBytes();
			
			out.write(b);
			out.close();
			System.out.println("File written");
			
			//reading
			FileInputStream in = new FileInputStream(f);
			
			int i=0;
			while(i != -1) {
				i = in.read();
				System.out.print((char)i);
			}
			
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
