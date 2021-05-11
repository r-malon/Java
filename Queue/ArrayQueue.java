public class ArrayQueue<T> implements GenericQueue<T> {
	private T 	array[];
	private int start;
	private int cur_size;
	private final int size;

	public ArrayQueue(int size) {
		this.size     = size;
		this.start    = 0;
		this.cur_size = 0;
		this.array    = (T[]) new Object[size];
	}

	public void add(T element) throws Exception {
		int pos = (start + cur_size) % size;
		array[pos] = element;
		cur_size++;
	}

	public T remove() throws Exception {
		T[] temp = (T[]) new Object[array.length - 1];
		T removed = null;

		for (int i = 0, j = 0; i < array.length; i++) {
			if (i == start) {
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

	public void clear() {
		start	 = 0;
		cur_size = 0;
		array	 = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		return array.length == 0;
	}
}
