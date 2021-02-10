public class Pessoa {
	private String nome;
	private double desconto;
	private double imposto;

	public Pessoa(String nome, double desconto, double imposto) {
		this.nome = nome;
		this.desconto = desconto;
		this.imposto = imposto;
	}

	private static boolean valorValido(double valor) {
		return valor > 0.0;
	}

	@Override
	public String toString() {
		return String.format("Pessoa: %s\nDesconto: %d\nImposto: %d", nome, desconto, imposto);
	}
}