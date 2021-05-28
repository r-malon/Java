import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static int from;
	static int to;

	public static void main(String[] args) throws Exception {
		String arg = "";
		if (args.length > 0)
			arg = args[0];
		else {
			help();
			System.exit(0);
		}
//		String arg = (args.length > 0) ? args[0] : "";
		int m=3, n=5;
		LinkedTower tower = new LinkedTower(m, n);

		switch (arg) {
//		case "contigua": ArrayTower tower = new ArrayTower(m, n); break;
		case "dinamica": tower = new LinkedTower(m, n); break;
		case "about": // FALLTHROUGH
		case "sobre":
		default:
			help();
			System.exit(0);
		}
/*		System.out.print("Quantas pilhas? ");
		m = input.nextInt();
		System.out.print("Tamanho de cada pilha: ");
		n = input.nextInt();*/
		do {
			makeMove();
			tower.move(from, to);
			System.out.println(tower);
		} while (!tower.gameFinished());
	}

	public static void makeMove() {
		System.out.print("Move from: ");
		from = input.nextInt();
		System.out.print("Move to: ");
		to = input.nextInt();
	}

	public static void help() {
		System.out.println("""
		Usage: java -jar TorresDeHanoi.jar [OPTION]

		When no option is passed, this help file is shown.

		Options:
		  contigua	
		  dinamica	
		  sobre	

		For bug reporting instructions, please see:
		<https://github.com/r-malon/Java/issues>.
		""");
	}
}