public class ContaCorrente extends Conta {
	private double limite;

	public ContaCorrente(String titular) {
		super(titular);
	}

	public ContaCorrente(String titular, double saldo) {
		super(titular, saldo);
	}

	@Override
	public void sacar(double valor) {
		if (getSaldo() - valor >= limite) {
			super.sacar(valor);
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double valor) {
		this.limite = valor;
	}
}