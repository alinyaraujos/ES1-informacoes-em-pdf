import javax.swing.JOptionPane;

public class HelloJOptionPane {
	
	String informacao;

	public HelloJOptionPane(String informacoes) {
		this.informacao=informacoes;
	}
	
	public void getInformacao() {
		JOptionPane.showMessageDialog(null, this.informacao);
	}
	
}

