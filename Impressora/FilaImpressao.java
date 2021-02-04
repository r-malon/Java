import java.util.ArrayList;

public class FilaImpressao {
	private ArrayList<Imprimivel> fila;
	private Impressora impressora;

	public FilaImpressao() {
		this.fila = new ArrayList<>();
		this.impressora = new Impressora();
	}

	public void incluirItem(Imprimivel doc) {
		this.fila.add(doc);
	}

	public void imprimirTodos() {
		for (Imprimivel item : fila) {
			this.impressora.imprimir(item);
		}
		this.fila = new ArrayList<>();
	}
}