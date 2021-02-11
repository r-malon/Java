public class Empregado extends Pessoa {
	private boolean aposentado;

	public Empregado(String nome, int dataNascimento, String estado, double saldo, boolean aposentado) {
		super(nome, dataNascimento, estado, saldo);
		this.aposentado = aposentado;
	}
}