import java.util.Objects;

public class Nacional extends Produto {
	private Categoria categoria;

	public Nacional(int codigo, String marca, double precoCusto, Categoria categoria) {
		super(codigo, marca, precoCusto);
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public double getPrecoFinal() {
		if (categoria == Categoria.ARTESANAL) {
			return getPrecoCusto() * 1.50;
		} else {
			return getPrecoCusto() * 1.30;
		}
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

		Nacional p = (Nacional) outro;
		return Objects.equals(this.getCodigo(), p.getCodigo()) && Objects.equals(this.getDescricao(), p.getDescricao()) && Objects.equals(this.getPrecoCusto(), p.getPrecoCusto()) && Objects.equals(this.getCategoria(), p.getCategoria());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getCodigo(), this.getDescricao(), this.getPrecoCusto(), this.getCategoria());
	}
}