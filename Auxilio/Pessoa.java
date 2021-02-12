import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Pessoa {
	private String nome;
	private int dataNascimento;
	private String estado;
	private double saldo = 0.0;
	private int mesesBeneficio = 0;

	private Connection conn = new ConnectionFactory().getConnection();
	private Statement statement = conn.createStatement();

	public Pessoa(String nome, int dataNascimento, String estado) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estado = estado;
	}

	public void inserir() throws SQLException {
		String insert = "INSERT INTO PESSOA (nome, dataNascimento, estado, mesesBeneficio, saldo) VALUES ("
			+ "'" + this.getNome() + "',"
			+ "'" + this.getDataNascimento() + "',"
			+ "'" + this.getEstado() + "',"
			+ this.getMesesBeneficio() + ","
			+ this.getSaldo() + "'))";				
		statement.execute(insert);
	}

	public boolean deMaior() {
		return (2021 - dataNascimento) >= 18;
	}

	public void depositar(double valor) {
		if (valorValido(valor)) {
			this.saldo += valor;
		}
	}

	private static boolean valorValido(double valor) {
		return valor > 0.0;
	}

	public String getNome() {
		return nome;
	}

	public String getEstado() {
		return estado;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public int getMesesBeneficio() {
		return mesesBeneficio;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return String.format("Pessoa: %s\nEstado: %s\nData de Nascimento: %d\nSaldo: %d", nome, estado, dataNascimento, saldo);
	}
}