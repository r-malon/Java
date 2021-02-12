public class Desempregado extends Pessoa {
	private int meses;

	public Desempregado(String nome, int dataNascimento, String estado, int meses) {
		super(nome, dataNascimento, estado);
		this.meses = meses;
	}
}