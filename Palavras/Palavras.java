import java.util.ArrayList;

public class Palavras {
	private ArrayList<String> palavras = new ArrayList<String>();

	public void inserir(String palavra) {
		this.palavras.add(palavra);
	}

	public void limpar() {
		palavras.clear();
	}
}