import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = 0, n = 1;
		System.out.print("Enter a number: ");
		int value = input.nextInt();

		for (int i=0; i<value; i++) {
			System.out.println(m);
			System.out.println(n);
			m = m + n;
			n = m + n;
		}
	}
}
