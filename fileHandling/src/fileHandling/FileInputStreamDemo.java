package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("D:\\java-files\\fileHandling\\fileHandling1.txt");
		
		int i;
		
		do {
			i = fin.read();
			if(i != -1) {
				System.out.print((char)i);
			}
			
		}while(i != -1);

		//or
		
//		int i=0;
//		while(i != -1) {
//			i = fin.read();
//			if(i != -1) {
//				System.out.print((char)i);
//			}
//			
//			
//		}

		fin.close();
	}

}
