package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritterAndReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Writing
		try {	
			File f = new File("D:\\java-files\\fileHandling\\fileHandling1.txt");
			FileWriter fw = new FileWriter(f);
			
			try {
				fw.write("Yo! how are you? \n");
				fw.write("Welcome \n");
				fw.write("Enjoy");
			}	
			finally {
				fw.close();
			}
			
			System.out.println("File written successfully");
			
		
		
			// Reading
			
			
			Scanner reader = new Scanner(f);
			
			try {	
				System.out.println("Reading data from the file: "+f.getName());
				while(reader.hasNextLine()) {
					String data = reader.nextLine();
					System.out.print(data);
					System.out.println();
				}
			}
			finally {
				reader.close();
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
