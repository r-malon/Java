import java.util.Random;
import java.util.Scanner;

public class Lancamento {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Face lance;
		int n;
		int caras = 0;
		int coroas = 0;

		do {
			System.out.print("Quantos lances? ");
			n = input.nextInt();
		} while (n < 1);

		for (int i=0; i<n; i++) {
			lance = jogar();
			if (lance == Face.CARA) {
				caras++;
			} else {
				coroas++;
			}
			System.out.println(lance);
		}

		System.out.printf("%nResultado: %d caras e %d coroas.", caras, coroas);
	}

	public static Face jogar() {
		Random rand = new Random();

		if (rand.nextBoolean()) {
			return Face.CARA;
		} else {
			return Face.COROA;
		}
	}
}