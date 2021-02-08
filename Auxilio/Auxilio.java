import java.util.Scanner;

public class Auxilio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int usuarios = 0;
		int beneficiarios = 0;
		int total = 0;
		boolean executar = true;

		String nome;
		int dataNascimento;
		String estado;

		while (executar) {
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Data de Nascimento: ");
			int dataNascimento = input.nextInt();
			System.out.print("Estado: ");
			String estado = input.nextLine();

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