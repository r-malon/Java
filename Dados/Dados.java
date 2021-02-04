import java.util.Random;
import java.util.Scanner;

public class Dados {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int[] n_lances = new int[6];
		int n = 0;
		int lance = 0;

		while (n == 0) {
			System.out.print("Quantos lances? ");
			n = input.nextInt();

			if (n < 1 || n > 150_000) {
				n = 0;
			}
		}

		for (int i=0; i<n; i++) {
			lance = rand.nextInt(6) + 1;
			n_lances[lance - 1]++;
		}

		for (int i=0; i<6; i++) {
			System.out.printf("O número %d teve %d lances%n", i + 1, n_lances[i]);
		}
	}
}