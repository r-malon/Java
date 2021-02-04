public class ProdutoMain {
	public static void main(String[] args) {
		Nacional vaso = new Nacional(57, "Rex", 50, Categoria.INDUSTRIALIZADO);
		Importado deso = new Importado(65, "Rexona", 20, 50);
		Loja loja = new Loja("Milium");
		loja.novoProduto(vaso);
		loja.novoProduto(deso);

		System.out.println(loja.nacionalMaisCaro());
		System.out.println(loja.importadoMaisBarato());

		System.out.println(vaso.getPrecoFinal());
		System.out.println(deso.getPrecoMinimo());
	}
}