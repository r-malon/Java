import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos;

	public ArrayList<Contato> listar() {
		return contatos;
	}

	public void incluir(Contato contato) {
		this.contatos.add(contato);
	}
}