public class Empregado extends Pessoa {
	private boolean aposentado;

	public Empregado(String nome, int dataNascimento, String estado, double saldo, int aposentado) {
		super(String nome, int dataNascimento, String estado, double saldo);
		this.aposentado = aposentado;
	}
}