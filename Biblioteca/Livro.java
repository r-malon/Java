public class Livro {
	private String titulo;
	private int ano;
	private Autor autor;
	private Genero genero;

	public Livro(String titulo, int ano, Autor autor, Genero genero) {
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
		this.genero = genero;
	}

	public Autor getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public int getAno() {
		return ano;
	}
}