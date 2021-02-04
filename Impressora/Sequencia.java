public class Sequencia implements Imprimivel {
	private int inicio;
	private int fim;

	public Sequencia(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	public String formatoImpressao() {
		String str = "";

		for (int i=inicio; i<fim; i++) {
			str += String.format("%d, ", i);
		}
		str += fim;
		return str;
	}
}