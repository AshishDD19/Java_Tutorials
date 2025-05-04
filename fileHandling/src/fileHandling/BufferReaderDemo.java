package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fl = new FileReader("D:\\java-files\\fileHandling\\fileHandling2.txt");
		BufferedReader br = new BufferedReader(fl);
//		
//		int ch;
//		
//		while((ch = br.read()) != -1){
//			System.out.print((char)ch);
//		}
//		
		//or
		
		
//		String str;
//		while((str = br.readLine()) != null) {
//			System.out.println(str);
//		}
		
		
		//or
		
		char[] chr = new char[100];
		br.read(chr);
		System.out.println(chr);
		
		br.close();
	}

}
