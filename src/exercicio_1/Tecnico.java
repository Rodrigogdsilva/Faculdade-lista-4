package exercicio_1;

import javax.swing.JOptionPane;

public class Tecnico extends Superior {

	@Override
	public float ler(float N1, float N2, float N3) {
		
		this.N1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Técnico - Digite a primeira nota do aluno:"));
		this.N2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Técnico - Digite a segunda nota do aluno:"));
		this.N3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Técnico - Digite a terceira nota do aluno:"));
		return this.N1 + this.N2 + this.N3;
		
	}

	@Override
	double CalculaMedia() {
		
		this.media = (N1 + N2 * 2 + N3 * 2) / 5;
		return media;
		
	}

	@Override
	public void exibir() {
		
		JOptionPane.showMessageDialog(null, "Média Tecnico: " + (float) media);
		
	}

}
