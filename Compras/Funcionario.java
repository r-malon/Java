public class Funcionario extends Pessoa {
	private boolean gerente;

	public Funcionario(String nome, boolean gerente) {
		if (this.gerente) {
			super(nome, 28, 11);
		} else {
			super(nome, 25, 11);
		}
	}
}