import java.lang.Math;

public class Circulo implements Figura {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return 2 * raio * Math.PI;
	}
}