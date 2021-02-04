public class PessoaMain {
	public static void main(String[] args) {
		Pessoa x = new Pessoa("José", "12345678900");

		System.out.println(x.getCPF());
		x.calcularIdade(1987);

		if (x.deMaior()) {
			System.out.println("deMaior");
		}
	}
}