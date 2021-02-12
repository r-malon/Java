import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Auxilio {
	static Scanner input = new Scanner(System.in);
	static int usuarios = 0;
	static int beneficiarios = 0;
	static int total = 0;
	static boolean executar = true;

	static Connection conn = new ConnectionFactory().getConnection();
	static Statement statement = conn.createStatement();

	public static void main(String[] args) {
		String nome;
		int dataNascimento;
		String estado;

		criarTabela();

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

	public static int numeroUsuarios() {
		int resultado;
		try {
			resultado = statement.executeQuery("SELECT COUNT(nome) FROM PESSOA;").getInt("nome");
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		return resultado;
	}

	public static int top2Valores() {
		int resultado;
		try {
			resultado = statement.executeQuery("SELECT saldo FROM PESSOA LIMIT 2;").getInt("saldo");
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		return resultado;
	}

	public static int top2Tempos() {
		int resultado;
		try {
			resultado = statement.executeQuery("SELECT mesesBeneficio FROM PESSOA LIMIT 2;").getInt("mesesBeneficio");
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		return resultado;
	}

	public static int saldoTotal() {
		int resultado;
		try {
			resultado = statement.executeQuery("SELECT SUM(saldo) FROM PESSOA;").getInt("saldo");
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		return resultado;
	}

	public static void excluirUsuario(String nome) {
		try {
			statement.execute(String.format("DELETE FROM PESSOA WHERE nome = %s;", nome));
			System.out.println("Comando executado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void criarTabela() {
		String init = "CREATE TABLE IF NOT EXISTS PESSOA ("
				+ "id serial not null,"
				+ "nome varchar(40) not null,"
				+ "dataNascimento int not null,"
				+ "estado varchar(2) not null,"
				+ "mesesBeneficio int not null,"
				+ "saldo float not null);";

		try {
			statement.execute(init);
			System.out.println("Comando executado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}
}