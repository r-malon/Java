import java.util.ArrayList;

public class Fabrica {
	private final String marca;
	private ArrayList<Veiculo> lista;

	public Fabrica(String marca) {
		this.marca = marca;
		this.lista = new ArrayList<>();
	}

	public final String getMarca() {
		return marca;
	}

	public final ArrayList<Veiculo> getVeiculos() {
		return lista;
	}

	public void construirVeiculoCarga(String modelo, int kilosCarga) {
		Carga veiculo = new Carga(this.marca, modelo, kilosCarga);
		lista.add(veiculo);
	}

	public void construirVeiculoTransporte(String modelo, int qtPassageiros) {
		Transporte veiculo = new Transporte(this.marca, modelo, qtPassageiros);
		lista.add(veiculo);
	}

	public void construirVeiculoCorrida(String modelo, double velocidadeMax) {
		Corrida veiculo = new Corrida(this.marca, modelo, velocidadeMax);
		lista.add(veiculo);
	}

	public int qtVeiculosCarga() {
		int qt = 0;

		for (Veiculo veiculo : lista) {
			if (veiculo instanceof Carga) {
				qt++;
			}
		}
		return qt;
	}

	public int qtVeiculosTransporte() {
		int qt = 0;

		for (Veiculo veiculo : lista) {
			if (veiculo instanceof Transporte) {
				qt++;
			}
		}
		return qt;
	}

	public int qtVeiculosCorrida() {
		int qt = 0;

		for (Veiculo veiculo : lista) {
			if (veiculo instanceof Corrida) {
				qt++;
			}
		}
		return qt;
	}
}