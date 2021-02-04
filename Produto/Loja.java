import java.util.ArrayList;
import java.util.Objects;

public class Loja {
	private String nomeLoja;
	private ArrayList<Nacional> nacionais;
	private ArrayList<Importado> importados;

	public Loja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
		this.nacionais = new ArrayList<>();
		this.importados = new ArrayList<>();
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public boolean novoProduto(Nacional produto) {
		if (nacionais.contains(produto)) {
			return false;
		}
		nacionais.add(produto);
		return true;
	}

	public boolean novoProduto(Importado produto) {
		if (importados.contains(produto)) {
			return false;
		}
		importados.add(produto);
		return true;
	}

	public Nacional nacionalMaisCaro() {
		Nacional primeiro = nacionais.get(0);

		for (Nacional produto : nacionais) {
			if (produto.getPrecoFinal() > primeiro.getPrecoFinal()) {
				primeiro = produto;
			}
		}
		return primeiro;
	}

	public Importado importadoMaisBarato() {
		Importado primeiro = importados.get(0);

		for (Importado produto : importados) {
			if (produto.getPrecoMinimo() < primeiro.getPrecoMinimo()) {
				primeiro = produto;
			}
		}
		return primeiro;
	}
}