public class Empregador extends Pessoa {
	private int funcionarios;

	public Empregador(String nome, int dataNascimento, String estado, double saldo, int funcionarios) {
		super(String nome, int dataNascimento, String estado, double saldo);
		this.funcionarios = funcionarios;
	}
}