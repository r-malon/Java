public class MergeSort {
	public static void main(String[] args) {
		int[] numbers = { 6, 3, 9, 9, 7, 6, 5, 2, 1, 11, 10 };

		sort(numbers, numbers.length);

		for (int x : numbers)
			System.out.print(x + ", ");
	}

	private static void sort(int[] array, int size) {
		int elements = 1;
		int start, middle, end;

		while (elements < size) {
			start = 0;
			while (start + elements < size) {
				middle = start + elements;
				end = start + 2 * elements;

				if (end > size)
					end = size;
				merge(array, start, middle, end);
				start = end;
			}
			elements *= 2;
		}
	}

	private static void merge(int[] array, int start, int middle, int end) {
		int temp[] = new int[end - start];
		int i = start;
		int m = middle;
		int pos = 0;

		while (i < middle && m < end) {
			if (array[i] <= array[m])
				temp[pos++] = array[i++];
			else
				temp[pos++] = array[m++];
		}

		while (i < middle)
			temp[pos++] = array[i++];
		while (m < end)
			temp[pos++] = array[m++];
		for (pos = 0, i = start; i < end; i++, pos++)
			array[i] = temp[pos];
	}
}
