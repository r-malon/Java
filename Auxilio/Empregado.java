public class Empregado extends Pessoa {
	private boolean aposentado;

	public Empregado(String nome, int dataNascimento, String estado, boolean aposentado) {
		super(nome, dataNascimento, estado);
		this.aposentado = aposentado;
	}
}