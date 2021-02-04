public class Corrida extends Veiculo {
	private double velocidadeMax;

	public Corrida(String marca, String modelo, double velocidadeMax) {
		super(marca, modelo);
		this.velocidadeMax = velocidadeMax;
	}

	public final double getVelocidadeMax() {
		return velocidadeMax;
	}
}