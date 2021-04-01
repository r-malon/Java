import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int value = input.nextInt();
		if (checker(value)) {
			System.out.println(value + " is an Armstrong number!");
		} else {
			System.out.println(value + " is not an Armstrong number...");
		}
	}

	public static boolean checker(int n) {
		int sum = 0;
		int length = String.valueOf(n).length();
		char[] text = String.valueOf(n).toCharArray();

		for (char i : text) {
			sum += Math.pow((i - '0'), length);
		}
		return sum == n;
	}
}
