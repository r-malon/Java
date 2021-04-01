public class Rotator {
	public static void main(String[] args) {
		int[] input = new int[] {3, 8, 19, 7};
		for (int i : rotateRight(input)) System.out.println(i);
	}

	public static int[] rotateRight(int[] list) {
		int[] n = list;
		for (int i = 0; i < list.length; i++) {
			n[i] = list[Math.abs(i-1)];
		}
//		n[0] = list[list.length-1];
		return n;
	}
}
