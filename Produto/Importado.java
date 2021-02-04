import java.util.Objects;

public class Importado extends Produto {
	private double taxaImportacao;

	public Importado(int codigo, String marca, double precoCusto, double taxaImportacao) {
		super(codigo, marca, precoCusto);
		this.taxaImportacao = taxaImportacao;
	}

	public double getPrecoMinimo() {
		return getPrecoCusto() * (1 + taxaImportacao / 100);
	}

	@Override
	public boolean equals(Object outro) {
		if (outro == null) {
			return false;
		}
		if (this == outro) {
			return true;
		}
		if (this.getClass() != outro.getClass()) {
			return false;
		}

		Importado p = (Importado) outro;
		return Objects.equals(this.getCodigo(), p.getCodigo()) && Objects.equals(this.getDescricao(), p.getDescricao()) && Objects.equals(this.getPrecoCusto(), p.getPrecoCusto()) && this.taxaImportacao == p.taxaImportacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getCodigo(), this.getDescricao(), this.getPrecoCusto(), this.taxaImportacao);
	}
}