public class Floyd {
	public static void main(String[] args) {
		int k = 1;

		for (int i=1; i<10; i++) {
			for (int j=1; j<i; j++, k++) {
				System.out.printf(k + " ");
			}
			System.out.println();
		}
	}
}
