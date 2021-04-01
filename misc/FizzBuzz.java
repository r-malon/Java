import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();

		for (int i=1; i<=n; i++) {
			String output = "";
			if (i % 3 == 0) output += "Fizz";
			if (i % 5 == 0) output += "Buzz";
			if (output == "") output += i;
			System.out.println(output);
		}
	}
}
