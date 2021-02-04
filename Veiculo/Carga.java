public class Carga extends Veiculo {
	private int kilosCarga;

	public Carga(String marca, String modelo, int kilosCarga) {
		super(marca, modelo);
		this.kilosCarga = kilosCarga;
	}

	public final int getCapacidadeCarga() {
		return kilosCarga;
	}
}