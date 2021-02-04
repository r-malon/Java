import java.util.Objects;

public class Produto {
	private int codigo;
	private String descricao;
	private double precoCusto;

	public Produto(int codigo, String marca, double precoCusto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}
}