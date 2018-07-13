import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;

public class Hello {
	
	public static void main(String[] args) {
		String opc="";
		String nomeArquivo="";
		String informacao = JOptionPane.showInputDialog(null, "Digite a informação: ");
		
		do {
			opc = JOptionPane.showInputDialog(null, "Como você deseja visualizar): \n"+
					   "1- PDF \n"+
					   "2- Console \n"+
					   "3- JOptionPane \n"+
					   "0- sair");
			
			switch (opc) {
				case "1": nomeArquivo=JOptionPane.showInputDialog(null, "Digite o nome do arquivo");
						  new HelloPDF(informacao).gerarPDF(nomeArquivo);break;
				case "2": new HelloConsole(informacao).getInformacao();break;
				case "3": new HelloJOptionPane(informacao).getInformacao();break;
				case "0": JOptionPane.showMessageDialog(null, "Tchau :)");break;
				default: JOptionPane.showMessageDialog(null,"Opção Inválida!");
				break;
			}
		}while(!opc.equals("0"));
	}

}
