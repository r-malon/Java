import java.util.Scanner;

public class CarroMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Modelo: ");
		String modelo = input.nextLine();

		System.out.print("Ano: ");
		int ano = input.nextInt();

		Carro car = new Carro(modelo, ano);

		System.out.printf("Modelo: %s%n", car.getModelo());
		System.out.printf("Ano: %d%n", car.getAno());
		car.acelerar(25.6);
		System.out.printf("Velocidade Atual: %.2f%n", car.getVelocidadeAtual());
		car.reduzir(14.9);
		System.out.printf("Velocidade Atual: %.2f%n", car.getVelocidadeAtual());
		car.setAno(1900);
		System.out.printf("Ano: %d%n", car.getAno());

		if (car.parado()) {
			System.out.println("Não está em movimento.");
		} else {
			System.out.printf("Se movendo a %.2f Km/h%n", car.getVelocidadeAtual());
		}
	}
}