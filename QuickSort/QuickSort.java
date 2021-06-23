public class QuickSort {
	public static void main(String[] args) {
		int[] numbers = { 6, 3, 9, 9, 7, 6, 5, 2, 1, 11, 10 };

		sort(numbers, 0, numbers.length - 1);

		for (int x : numbers)
			System.out.print(x + ", ");
	}

	private static void sort(int[] array, int start, int end) {
		if (end > start) {
			int index = divide(array, start, end);
			sort(array, start, index - 1);
			sort(array, index + 1, end);
		}
	}

	private static int divide(int[] array, int start, int end) {
		int pivot, left, right = end;
		left = start + 1;
		pivot = array[start];

		while (left <= right) {
			while (left <= right && array[left] <= pivot)
				left++;
			while (right >= left && array[right] > pivot)
				right--;

			if (left < right)
				swap(array, right--, left++);
		}

		swap(array, start, right);
		return right;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
