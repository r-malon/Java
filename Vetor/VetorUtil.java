public class VetorUtil {
	public static int[] reverso(int[] vetor) {
		for (int i = 0; i < vetor.length / 2; i++) {
			int j = vetor[i];
			vetor[i] = vetor[vetor.length-i-1];
			vetor[vetor.length-i-1] = j;
		}
		return vetor;
	}

	public static String colar(char[] vetor) {
		String resultado = new String(vetor);
		return resultado;
	}
}