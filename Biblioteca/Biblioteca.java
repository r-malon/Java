import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> acervo;

	public Biblioteca(String nome) {
		this.nome = nome;
		this.acervo = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Livro> getAcervo() {
		return acervo;
	}

	public ArrayList<Livro> getAcervo(Genero genero) {
		ArrayList<Livro> livros = new ArrayList<>();

		for (Livro livro : acervo) {
			if (livro.getGenero() == genero) {
				livros.add(livro);
			}
		}
		return livros;
	}

	public int quantidadeLivrosAutor(String nome, String sobrenome) {
		int quantidade = 0;

		for (Livro livro : acervo) {
			if (nome.equalsIgnoreCase(livro.getAutor().getNome()) && sobrenome.equalsIgnoreCase(livro.getAutor().getSobrenome())) {
				quantidade++;
			}
		}
		return quantidade;
	}

	public void incluirLivro(Livro livro) {
		this.acervo.add(livro);
	}
}