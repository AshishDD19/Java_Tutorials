package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\java-files\\fileHandling\\fileHandling2.txt");
		
		if(f.exists()) {
			System.out.println("File already exists! at: " + f.getAbsolutePath());
		}
		else {
			f.createNewFile();
			System.out.println("File created "+f.getName());
		}
		
		
		System.out.println("check file exist: "+f.exists());
		System.out.println("can file write: "+f.canWrite());
		System.out.println("can file read: "+f.canRead());
		
		System.out.println("Length of file: "+f.length());
		
		//renaming
		
		File r = new File("D:\\java-files\\fileHandling\\file2.txt");

		if(f.exists()) {
			System.out.println(f.renameTo(r)); 
		}
		else{
			System.out.println("File does not exist");
		}
		
		
//		f.delete();
//		System.out.println("check file exist: "+f.exists());
	}

}
