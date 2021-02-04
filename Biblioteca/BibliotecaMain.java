import java.util.ArrayList;

public class BibliotecaMain {
	public static void main(String[] args) {
		Autor aut = new Autor("Paul", "Deitel");
		Livro liv = new Livro("Java: como programar", 2011, aut, Genero.TECNICO);

		Biblioteca senai = new Biblioteca("SENAI");
		senai.incluirLivro(liv);
		liv = new Livro("Urupês", 1918, new Autor("Monteiro", "Lobato"), Genero.CONTO);
		senai.incluirLivro(liv);
		listarAcervo(senai);
		listarAcervo(senai, Genero.CONTO);
		System.out.println("Quantidade de livros do autor Paul Deitel na biblioteca " + //
				senai.getNome() + ": " + senai.quantidadeLivrosAutor("Paul", "Deitel") + "\n");

		Biblioteca furb = new Biblioteca("FURB");
		aut = new Autor("Ian", "Sommerville");
		liv = new Livro("Software Engineering", 2016, aut, Genero.TECNICO);
		furb.incluirLivro(liv);
		listarAcervo(furb);
		listarAcervo(furb, Genero.FICCAO);
		System.out.println("Quantidade de livros do autor Paulo Coelho na biblioteca " + //
				furb.getNome() + ": " + furb.quantidadeLivrosAutor("Paulo", "Coelho") + "\n");
	}

	private static void listarAcervo(Biblioteca biblioteca) {
		System.out.printf("%nLivros da Biblioteca %s:%n", biblioteca.getNome());
		ArrayList<Livro> livros = biblioteca.getAcervo();
		listarAcervo(livros);
	}

	private static void listarAcervo(Biblioteca biblioteca, Genero genero) {
		System.out.printf("%nLivros do gênero %s na Biblioteca %s:%n", genero, biblioteca.getNome());
		ArrayList<Livro> livros = biblioteca.getAcervo(genero);
		listarAcervo(livros);
	}

	private static void listarAcervo(ArrayList<Livro> listaLivros) {
		if (listaLivros == null || listaLivros.isEmpty()) {
			System.out.println("Nenhum livro encontrado.");
		} else {
			Autor a;
			for (Livro livro : listaLivros) {
				a = livro.getAutor();
				String t = livro.getTitulo();
				System.out.println(t + " - " + a);
			}
		}
	}
}