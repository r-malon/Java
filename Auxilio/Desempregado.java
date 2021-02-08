public class Desempregado extends Pessoa {
	private int meses;

	public Desempregado(String nome, int dataNascimento, String estado, double saldo, int meses) {
		super(String nome, int dataNascimento, String estado, double saldo);
		this.meses = meses;
	}
}