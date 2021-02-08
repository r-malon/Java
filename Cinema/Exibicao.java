public enum Exibicao {
	_2D("2D"), 
	_3D("3D"), 
	_4D("4D");

	private String tipo;

	private Exibicao(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo;
	}
}