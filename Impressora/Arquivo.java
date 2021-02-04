public class Arquivo implements Imprimivel {
	private String nomeArquivo;
	private String conteudo;

	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String formatoImpressao() {
		return conteudo;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}