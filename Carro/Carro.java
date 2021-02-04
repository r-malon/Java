public class Carro {
	private String modelo;
	private double velocidadeAtual = 0.0;
	private int ano;

	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		if (validarAno(ano)) {
			this.ano = ano;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		if (validarAno(ano)) {
			this.ano = ano;
		}
	}

	public void acelerar(double aumento) {
		if (validarVelocidade(aumento)) {
			this.velocidadeAtual += aumento;
		}
	}

	public void reduzir(double reducao) {
		if (validarVelocidade(reducao) && (reducao <= velocidadeAtual)) {
			this.velocidadeAtual -= reducao;
		}
	}

	public boolean parado() {
		return velocidadeAtual == 0.0;
	}

	private boolean validarAno(int ano) {
		return ano >= 1900;
	}

	private boolean validarVelocidade(double velocidade) {
		return velocidade >= 0;
	}
}