import java.util.ArrayList;
import java.util.Random;

public class Aposta {
	private String apostador;
	private ArrayList<Integer> numeros = new ArrayList<Integer>();

	public Aposta(String apostador, int quantia) {
		this.apostador = apostador;

		Random rand = new Random();
		int num;

		for (int i = 0; i < quantia; i++) {
			do {
				num = rand.nextInt(60) + 1;
			} while (this.numeros.contains(num));
			this.numeros.add(num);
		}
	}

	public ArrayList<Integer> getNumeros() {
		return new ArrayList<Integer>(numeros);
	}

	@Override
	public String toString() {
		return apostador + " - " + numeros;
	}
}