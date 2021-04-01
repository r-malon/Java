import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long value = input.nextLong();
		System.out.printf("%d! is %d", value, factorial(value));
	}

	public static long factorial(long n) {
		n = Math.abs(n);
		if (n <= 1) return 1;
		return n * factorial(n - 1);
	}
}
