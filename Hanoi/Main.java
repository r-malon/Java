import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static int from;
	static int to;
	static int n_rods;
	static int stackSize;
	static boolean moved;

	public static void main(String[] args) throws Exception {
		String arg = "";
		if (args.length > 0)
			arg = args[0];
		else {
			help();
			System.exit(0);
		}
//		String arg = (args.length > 0) ? args[0] : "";
		init();
		LinkedTower tower = new LinkedTower(n_rods, stackSize);
		System.out.println(tower);

		switch (arg) {
		case "contigua": // ArrayTower tower = new ArrayTower(n_rods, stackSize); break;
		case "dinamica": tower = new LinkedTower(n_rods, stackSize); break;
		case "about": // FALLTHROUGH
		default:
			help();
			System.exit(0);
		}

		do {
			makeMove();
			moved = tower.move(from, to);
			clearScreen();
			System.out.println(tower);
		} while (!tower.gameFinished());

		if (tower.gameFinished())
			System.out.print("\033[1;32mVICTORY\033[0m");
	}

	public static void makeMove() {
		System.out.print("Move from: ");
		from = input.nextInt();
		System.out.print("Move to: ");
		to = input.nextInt();
		validMove();
	}

	public static void validMove() {
		if (from < 0 || to < 0 || from >= stackSize || to >= stackSize) {
			System.out.println("\033[1;31mInvalid move\n\033[0m");
			makeMove();
		}
	}

	public static void init() {
		System.out.print("Number of rods: ");
		n_rods = input.nextInt();
		System.out.print("Number of discs: ");
		stackSize = input.nextInt();
		if (n_rods <= 0 || stackSize <= 0) {
			System.out.println("\033[1;31mInvalid values\n\033[0m");
			init();
		}
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[J");
		if (!moved)
			System.out.println("\033[1;31mInvalid move\n\033[0m");
	}

	public static void help() {
		// Java 15 Text Blocks
		System.out.println("""
		Usage: java -jar TorresDeHanoi.jar [OPTION]

		When no option is passed, this help file is shown.
		If output is garbled text on Windows, run this command as admin to 
		enable ANSI escape codes:
		  REG ADD HKCU\\CONSOLE /f /v VirtualTerminalLevel /t REG_DWORD /d 1

		Options:
		  contigua	Starts game using linked list implementation
		  dinamica	Starts game using array implementation
		  about 	Prints this help file

		For bug reporting instructions, please see:
		<https://github.com/r-malon/Java/issues>.""");
	}
}