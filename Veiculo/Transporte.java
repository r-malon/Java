public class Transporte extends Veiculo {
	private int qtPassageiros;

	public Transporte(String marca, String modelo, int qtPassageiros) {
		super(marca, modelo);
		this.qtPassageiros = qtPassageiros;
	}

	public final int getQtPassageiros() {
		return qtPassageiros;
	}
}