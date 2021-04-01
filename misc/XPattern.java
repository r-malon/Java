import java.util.Scanner;

public class XPattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		draw(n);
	}

	public static void draw(int height) {
		for (int i = height; i > 1; i--) {
			System.out.printf("%s*%s*\n", 
				new String(new char[Math.abs(i - height)]).replace("\0", " "), 
				new String(new char[(i - 2)*2 - 1]).replace("\0", " "));
		}
	}
}
