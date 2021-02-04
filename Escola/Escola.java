import java.util.ArrayList;

public class Escola {
	private String nomeEscola;
	private ArrayList<Professor> professores;
	private ArrayList<Estudante> estudantes;

	public Escola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
		this.professores = new ArrayList<>();
		this.estudantes = new ArrayList<>();
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public ArrayList<Estudante> getEstudantes() {
		return estudantes;
	}

	public boolean contratar(Professor professor) {
		for (Professor i : professores) {
			if (i.getNome() == professor.getNome()) {
				return false;
			}
		}
		this.professores.add(professor);
		return true;
	}

	public boolean matricular(Estudante estudante) {
		for (Estudante i : estudantes) {
			if (i.getNome() == estudante.getNome()) {
				return false;
			}
		}
		this.estudantes.add(estudante);
		return true;
	}
}