import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
	private String usuario;
	private String senha;
	private ArrayList<String> senhasUtilizadas = new ArrayList<>(5);

	public Usuario(String usuario, String senhaInicial) {
		this.usuario = Objects.requireNonNull(usuario);
		this.senha = Objects.requireNonNull(senhaInicial);
		this.senhasUtilizadas.add(this.senha);
	}

	public boolean loginOK(String senha) {
		return this.senha.equals(senha);
	}

	public boolean trocarSenha(String senhaAtual, String senhaNova) {
		if (loginOK(senhaAtual) && senhaValida(senhaNova)) {
			this.senha = senhaNova;
			senhasUtilizadas.add(0, senhaNova);

			if (senhasUtilizadas.size() > 5) {
				senhasUtilizadas.remove(5);
			}
			return true;
		}
		return false;
	}

	public boolean senhaValida(String senha) {
		if (senha != null && !senha.isEmpty()) {
			if (senhasUtilizadas.contains(senha)) {
				return false;
			}
			return true;
		}
		return false;
	}

	public String getUsuario() {
		return usuario;
	}

	public ArrayList<String> getSenhas() {
		return new ArrayList<>(senhasUtilizadas);
	}
}