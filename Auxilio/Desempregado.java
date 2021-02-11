public class Desempregado extends Pessoa {
	private int meses;

	public Desempregado(String nome, int dataNascimento, String estado, double saldo, int meses) {
		super(nome, dataNascimento, estado, saldo);
		this.meses = meses;
	}
}