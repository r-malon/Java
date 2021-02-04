public class UsuarioMain {
	public static void main(String[] args) {
		Usuario x = new Usuario(null, "abc");

		if (x.loginOK("abc")) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Falha");
		}

		if (x.trocarSenha("abc", "xxx")) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Falha");
		}

		System.out.println(x.getSenhas());
		x.trocarSenha("xxx", "ola");
		x.trocarSenha("ola", "alo");
		x.trocarSenha("alo", "nnn");
		x.trocarSenha("nnn", "yyy");
		x.trocarSenha("yyy", "000");
		x.trocarSenha("000", "999");
		x.trocarSenha("999", "888");
		x.trocarSenha("888", "777");
		System.out.println(x.getSenhas());
	}
}