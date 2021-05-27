import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		String arg;
		if (args.length > 0)
			arg = args[0];
		else {
			help();
			System.exit(0);
		}
		Scanner input = new Scanner(System.in);
//		String arg = (args.length > 0) ? args[0] : "";
		int m, n;
		ArrayTower tower;

		switch (arg) {
		case "contigua": ArrayTower tower = new ArrayTower(m, n); break;
		case "dinamica": LinkedTower tower = new LinkedTower(m, n); break;
		case "about": // FALLTHROUGH
		case "sobre":
		default:
			help();
			System.exit(0);
		}
		System.out.print("Quantas pilhas? ");
		m = input.nextInt();
		System.out.print("Tamanho de cada pilha: ");
		n = input.nextInt();
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