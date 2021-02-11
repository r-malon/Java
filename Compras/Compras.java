public class Compras {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double compra;

		do {
			System.out.print("Preço: ");
			compra = input.nextDouble();
		} while (compra > 0);
	}
}