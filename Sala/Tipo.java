public enum Tipo {
	NORMAL("Normal"), 
	INTELIGENTE("Inteligente"), 
	VIDEO("Vídeo"), 
	COMPUTACAO("Computação"), 
	QUIMICA("Química"), 
	FISICA("Física"), 
	BIOLOGIA("Biologia");

	private String descricao;

	private Tipo(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
}