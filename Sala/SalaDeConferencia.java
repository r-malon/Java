public class SalaDeConferencia extends Sala {
	private Tipo tipo;

	public SalaDeConferencia(int id, int capacidade, String nome, ArrayList<Equipamento> equipamentos, Tipo tipo) {
		super(int id, int capacidade, String nome, ArrayList<Equipamento> equipamentos);
		this.tipo = tipo;
	}
}