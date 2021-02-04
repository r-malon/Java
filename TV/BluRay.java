public class BluRay extends Aparelho {
	private String disco = "";
	private int canal;

	public BluRay(String marca, String modelo) {
		super(marca, modelo);
	}

	public boolean haDisco() {
		return disco.isEmpty();
	}

	public void inserirDisco(String disco) {
		if (haDisco()) {
			this.disco = disco;
			System.out.println("Disco inserido: " + this.disco);
		} else {
			System.out.println("Já há um disco.");
		}
	}

	public void play() {
		this.canal = canal;
	}

	public void pause() {
		this.canal++;
	}

	public void stop() {
		this.canal--;
	}

	public void eject() {
		this.canal--;
	}
}