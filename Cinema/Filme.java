import java.util.ArrayList;

public class Filme {
	private String titulo;
	private String tituloOriginal;
	private String faixaEtaria;
	private String genero;
	private String paisOrigem;
	private int duracao;
	private Diretor diretor;
	private ArrayList<Ator> atores;
	private Exibicao exibicao;

	public Livro(String titulo, String tituloOriginal, String faixaEtaria, String paisOrigem, int duracao, Diretor diretor, String genero, ArrayList<Ator> atores, Exibicao exibicao) {
		this.titulo = titulo;
		this.tituloOriginal = tituloOriginal;
		this.faixaEtaria = faixaEtaria;
		this.duracao = duracao;
		this.atores = atores;
		this.genero = genero;
		this.diretor = diretor;
		this.paisOrigem = paisOrigem;
		this.exibicao = exibicao;
	}
}