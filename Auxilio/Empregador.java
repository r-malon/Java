public class Empregador extends Pessoa {
	private int funcionarios;

	public Empregador(String nome, int dataNascimento, String estado, double saldo, int funcionarios) {
		super(nome, dataNascimento, estado, saldo);
		this.funcionarios = funcionarios;
	}
}