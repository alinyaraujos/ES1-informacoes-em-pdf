import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class HelloPDF {
	
	String informacao;
 
	 public HelloPDF(String informacao) {
		 this.informacao=informacao;
	 }
	 
	 public void gerarPDF(String nomeArquivo) {
		 Document document = new Document();
	     try {
	     	PdfWriter.getInstance(document, new FileOutputStream("./"+nomeArquivo+".pdf"));
	         document.open();
	         document.add(new Paragraph(this.informacao));
	         document.close();
	     }
	     catch(DocumentException de) {
	         System.err.println(de.getMessage());
	     }
	     catch(IOException ioe) {
	         System.err.println(ioe.getMessage());
	     }
	     document.close();
	 }
 
}
