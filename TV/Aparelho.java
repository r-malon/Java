import java.util.Objects;

public class Aparelho {
	private String marca;
	private String modelo;
	private boolean ligado = false;

	public Aparelho(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void onOff() {
		ligado = !ligado;

		if (ligado)
			System.out.printf("O aparelho %s foi ligado.%n", this);
		else
			System.out.printf("O aparelho %s foi desligado.%n", this);
	}

	@Override
	public String toString() {
		return String.format("[%s/%s]", getMarca(), getModelo());
	}

	@Override
	public boolean equals(Object outro) {
		if (outro == null || outro.getClass() != this.getClass())
			return false;
		if (outro == this)
			return true;

		Aparelho p = (Aparelho) outro;
		return Objects.equals(this.getMarca(), p.getMarca()) && Objects.equals(this.getModelo(), p.getModelo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getMarca(), this.getModelo());
	}
}