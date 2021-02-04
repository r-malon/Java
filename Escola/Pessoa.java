import java.util.Objects;

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, int idade) {
		this(nome); //this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void oi() {
		System.out.printf("Olá, me chamo %s e tenho %d anos.%n", nome, idade);
	}

	@Override
	public boolean equals(Object outraPessoa) {
		if (outraPessoa == null) {
			return false;
		}
		if (this == outraPessoa) {
			return true;
		}
		if (this.getClass() != outraPessoa.getClass()) {
			return false;
		}

		Pessoa p = (Pessoa) outraPessoa;
		return Objects.equals(this.getNome(), p.getNome()) && this.getIdade() == p.getIdade();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getNome(), this.getIdade());
	}
}