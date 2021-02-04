import java.util.ArrayList;
import java.util.Random;

public class Concurso {
	private static ArrayList<Integer> sorteio;

	public static ArrayList<Integer> sortear() {
		if (sorteio == null) {
			sorteio = new ArrayList<>(6);
			Random rand = new Random();
			int num;

			for (int i = 0; i < 6; i++) {
				do {
					num = rand.nextInt(60) + 1;
				} while (sorteio.contains(num));
				sorteio.add(num);
			}
		}
		return new ArrayList<Integer>(sorteio);
	}

	public static int quantidadeAcertos(Aposta aposta) {
		int qt = 0;
		for (int s : sortear()) {
			if (aposta.getNumeros().contains(s)) {
				qt++;
			}
		}
		return qt;
	}
}