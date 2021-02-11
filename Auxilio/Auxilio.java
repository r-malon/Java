import java.util.Scanner;

public class Auxilio {
	static Scanner input = new Scanner(System.in);
	static int usuarios = 0;
	static int beneficiarios = 0;
	static int total = 0;
	static boolean executar = true;

	public static void main(String[] args) {
		String nome;
		int dataNascimento;
		String estado;

		while (executar) {
			System.out.print("Nome: ");
			nome = input.nextLine();
			System.out.print("Data de Nascimento: ");
			dataNascimento = input.nextInt();
			System.out.print("Estado: ");
			estado = input.nextLine();

			informarNovo();
		}
	}

	public static void informarNovo() {
		System.out.print("Informar novo usuário? (Y/n) ");
		String resposta = input.nextLine();
		if (resposta == "Y") {
			executar = true;
		} else {
			executar = false;
		}
	}
}