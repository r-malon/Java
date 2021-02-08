public class Escritorio extends Sala {
	private Tipo tipo;

	public Escritorio(int id, int capacidade, String nome, ArrayList<Equipamento> equipamentos, Tipo tipo) {
		super(int id, int capacidade, String nome, ArrayList<Equipamento> equipamentos);
		this.tipo = tipo;
	}
}