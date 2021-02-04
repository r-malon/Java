public enum Genero {
	FICCAO("Ficção"), 
	TERROR("Terror"), 
	TECNICO("Técnico"), 
	CONTO("Conto");

	private String descricao;

	private Genero(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
}