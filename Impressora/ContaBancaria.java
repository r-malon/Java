public class ContaBancaria implements Imprimivel {
	private String titular;
	private double saldo;

	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String formatoImpressao() {
		return String.format("Nome: %s. Saldo: %.02f", titular, saldo);
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
}