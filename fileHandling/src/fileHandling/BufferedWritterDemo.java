package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			FileWriter fl = new FileWriter("D:\\java-files\\fileHandling\\fileHandling2.txt");
			
			BufferedWriter bf = new BufferedWriter(fl);
			
			try {
				bf.write("Hi, how are you?\n");
				bf.write("Welcome to this page\n");
				bf.write("Yo!");
			}
			finally {
				bf.close();
			}
			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
