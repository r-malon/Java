import java.util.ArrayList;

public class Sala {
	private int id;
	private int capacidade;
	private String nome;
	private ArrayList<Equipamento> equipamentos;

	public Sala(int id, int capacidade, String nome, ArrayList<Equipamento> equipamentos) {
		this.id = id;
		this.capacidade = capacidade;
		this.nome = nome;
		this.equipamentos = equipamentos;
	}
}