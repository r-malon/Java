public class Estudante extends Pessoa {
	public Estudante(String nome) {
		super(nome);
	}

	public Estudante(String nome, int idade) {
		super(nome, idade);
	}

	public void estudar(String assunto) {
		System.out.printf("Estou estudando o assunto %s.%n", assunto);
	}
}