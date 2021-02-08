import java.util.ArrayList;

public class Cinema {
	private String id;
	private String nome;
	private String endereco;
	private int salas;
	private int salasDisponiveis;
	private int capacidade;
	private int telefone;
	private ArrayList<Filme> filmes;

	public Cinema(String id, String nome, String endereco, int salas) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.salas = salas;
		this.salasDisponiveis = salasDisponiveis;
		this.capacidade = capacidade;
		this.telefone = telefone;
		this.filmes = new ArrayList<>();
	}

	public void incluirFilme(Filme filme) {
		this.filmes.add(filme);
	}
}