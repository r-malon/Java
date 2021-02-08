public class Pessoa {
	private String nome;
	private int dataNascimento;
	private String estado;
	private double saldo;

	public Pessoa(String nome, int dataNascimento, String estado, double saldo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estado = estado;
		this.saldo = saldo;
	}

	public boolean deMaior() {
		return idade >= (2021 - dataNascimento);
	}

	public void depositar(double valor) {
		if (valorValido(valor)) {
			this.saldo += valor;
		}
	}

	private static boolean valorValido(double valor) {
		return valor > 0.0;
	}

	@Override
	public String toString() {
		return String.format("Pessoa: %s\nEstado: %s\nData de Nascimento: %d\nSaldo: %d", nome, estado, dataNascimento, saldo);
	}
}