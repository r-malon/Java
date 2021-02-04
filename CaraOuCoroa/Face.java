public enum Face {
	CARA("Cara"), 
	COROA("Coroa");

	private String lado;

	private Face(String lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return lado;
	}
}