package exercicio_1;

import javax.swing.JOptionPane;

public class Superior {

	public float N1, N2, N3;
	double media;

	float Superior(float N1_, float N2_, float N3_) {

		this.N1 = N1_;
		this.N2 = N2_;
		this.N3 = N3_;
		return N1 + N2 + N3;

	}

	double CalculaMedia() {

		media = N1 * 0.35 + N2 * 0.5 + N3 * 0.15;
		return media;

	}

	public float ler(float N1, float N2, float N3) {

		this.N1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Superior - Digite a primeira nota do aluno:"));
		this.N2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Superior - Digite a segunda nota do aluno:"));
		this.N3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Superior - Digite a terceira nota do aluno:"));
		return this.N1 + this.N2 + this.N3;

	}

	public void exibir() {

		JOptionPane.showMessageDialog(null, "Média Superior: " + media);

	}

}
