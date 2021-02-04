public class Professor extends Pessoa {
	public Professor(String nome, int idade) {
		super(nome, idade);
	}

	public void explicar(String assunto) {
		System.out.printf("Estou explicando o assunto %s.%n", assunto);
	}
}