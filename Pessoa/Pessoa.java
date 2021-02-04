public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getCPF() {
		return String.format("%s.%s.%s-%s", cpf.substring(0,3), cpf.substring(3,6), cpf.substring(6,9), cpf.substring(9,11));
	}

	public void calcularIdade(int ano) {
		this.idade = 2020 - ano;
	}

	public boolean deMaior() {
		return idade >= 18;
	}
}