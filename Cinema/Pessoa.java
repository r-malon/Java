public abstract class Pessoa {
	private int numero;
	private String nome;
	private String nacionalidade;
	private int idade;
	private double cache = 0.0;

	public Pessoa(String nome, String nacionalidade, int idade, int numero) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.numero = numero;
	}

	public void receberCache(double valor) {
		if (valorValido(valor)) {
			this.saldo += valor;
		}
	}

	private static boolean valorValido(double valor) {
		return valor > 0.0;
	}
}