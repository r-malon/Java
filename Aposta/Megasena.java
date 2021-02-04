import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Megasena {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int qt, n_apostas;
		Aposta aposta;
		ArrayList<Aposta> apostas = new ArrayList<>();

		System.out.print("Quantas apostas: ");
		n_apostas = input.nextInt();

		for (int i = 0; i < n_apostas; i++) {
			qt = rand.nextInt((15 - 6) + 1) + 6;
			aposta = new Aposta("Aposta " + i + "/" + qt, qt);
			apostas.add(aposta);
		}

		System.out.println("Números sorteados: " + Concurso.sortear());

		for (Aposta a : apostas) {
			qt = Concurso.quantidadeAcertos(a);
			System.out.print(a);
			System.out.printf(", acertos: %d%n", qt);
		}
	}
}