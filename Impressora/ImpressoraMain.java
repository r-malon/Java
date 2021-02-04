public class ImpressoraMain {
	public static void main(String[] args) {
		Sequencia seq = new Sequencia(8, 12);
		ContaBancaria conta = new ContaBancaria("John", 450);
		ContaBancaria conta2 = new ContaBancaria("Jane", 540);
		Arquivo file = new Arquivo("file.txt");
		file.setConteudo("blabla");
		// System.out.println(seq.formatoImpressao());

		FilaImpressao fila = new FilaImpressao();
		fila.incluirItem(seq);
		fila.incluirItem(conta2);
		fila.incluirItem(conta);
		fila.incluirItem(file);
		fila.imprimirTodos();
	}
}