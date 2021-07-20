package exercicio_1;

public class SuperiorMain {

	public static void main(String[] args) {

		float n1 = 0, n2 = 0, n3 = 0;

		Superior S = new Superior();

		S.ler(n1, n2, n3);

		Tecnico T = new Tecnico();

		T.ler(n1, n2, n3);

		S.CalculaMedia();

		T.CalculaMedia();

		S.exibir();

		T.exibir();

	}

}
