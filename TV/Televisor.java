import java.util.Objects;

public class Televisor extends Aparelho {
	private int polegadas;
	private int canal;

	public Televisor(String marca, String modelo, int polegadas) {
		super(marca, modelo);
		this.polegadas = polegadas;
		this.canal = 1;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public void canalMais() {
		this.canal++;
	}

	public void canalMenos() {
		this.canal--;
	}

	@Override
	public String toString() {
		return String.format("TV %s/%s %d\" Canal: %d", getMarca(), getModelo(), polegadas, canal);
	}

	@Override
	public boolean equals(Object outro) {
		if (outro == null || outro.getClass() != this.getClass())
			return false;
		if (outro == this)
			return true;

		Televisor p = (Televisor) outro;
		return Objects.equals(this.getMarca(), p.getMarca()) && Objects.equals(this.getModelo(), p.getModelo()) && this.polegadas == p.polegadas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getMarca(), this.getModelo(), this.polegadas);
	}
}