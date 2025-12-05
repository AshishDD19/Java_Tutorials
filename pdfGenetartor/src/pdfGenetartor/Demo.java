package pdfGenetartor;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document d = new Document();
		
		try {
			FileOutputStream out = new FileOutputStream("D:\\pdfGenerate\\demo.pdf");
			PdfWriter.getInstance(d, out);
			
			Font f = new Font(Font.FontFamily.HELVETICA, 24, Font.UNDERLINE ,BaseColor.BLUE);
			Paragraph p = new Paragraph("Welcome to this pdf file",f);
			
			p.setAlignment(1);
			
			Image i = Image.getInstance("https://thumbs.dreamstime.com/b/vector-illustration-avatar-dummy-logo-collection-image-icon-stock-isolated-object-set-symbol-web-137160339.jpg");
			i.scaleAbsolute(100, 100);
			d.open();
			d.add(p);
			d.add(i);
			d.close();
			
			System.out.println("Pdf ready");
			
		} catch (IOException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
