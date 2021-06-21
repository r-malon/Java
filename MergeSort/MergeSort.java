public class MergeSort {
	public static void main(String[] args) {
		Integer[] numeros = { 3, 9, 8, 7, 6, 2, 1 };

		sort(numeros);

		for (int x : numeros) {
			System.out.print(x + " ");
		}
	}

	public static <T> T[] sort(T[] array) {
		if (array.length <= 1)
			return array;
		T[] left = (T[]) new Object[array.length/2];
		T[] right = (T[]) new Object[array.length/2];

		for (int i=0; i<array.length; i++) {
			if (i < array.length/2)
				left[i] = array[i];
			else
				right[i] = array[i];
		}
		left = sort(left);
		right = sort(right);
		return merge(left, right);
	}

	public static <T> T[] merge(T[] left, T[] right) {
		T[] merged = (T[]) new Object[left.length];
		int index  = 0;

		while (left.length > 0 && right.length > 0) {
			if (left[0] <= right[0]) {
				merged[index] = left[0];
				remove(left, 0);
			} else {
				merged[index] = right[0];
				remove(right, 0);
			}
			index++;
		}
		return merged;
	}

	public static <T> T remove(T[] array, int pos) {
		T[] temp = (T[]) new Object[array.length - 1];
		T removed = null;

		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == pos) {
				removed = array[i];
				continue;
			} else if (array[i] != null) {
				temp[j] = array[i];
				j++;
			}
		}
		array = temp;
		return removed;
	}
}
