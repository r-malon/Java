public class Empregador extends Pessoa {
	private int funcionarios;

	public Empregador(String nome, int dataNascimento, String estado, int funcionarios) {
		super(nome, dataNascimento, estado);
		this.funcionarios = funcionarios;
	}
}