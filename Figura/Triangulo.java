public class Triangulo implements Figura {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return (base * altura) / 2;
	}
}