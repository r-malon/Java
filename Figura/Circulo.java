import java.lang.Math;

public class Circulo implements Figura {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return (raio * raio) * Math.PI;
	}

	public double calcularCircunferencia() {
		return 2 * raio * Math.PI;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}