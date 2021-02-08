public class Laboratorio extends Sala {
	private Tipo tipo;

	public Laboratorio(int id, int capacidade, String nome, ArrayList<Equipamento> equipamentos, Tipo tipo) {
		super(int id, int capacidade, String nome, ArrayList<Equipamento> equipamentos);
		this.tipo = tipo;
	}
}