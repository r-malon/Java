public class ArrayQueue<T> implements GenericQueue<T> {
	private T   array[];
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
		if (array.length == size)
			throw new ArrayIndexOutOfBoundsException("Full queue");
		if (start < 0)
			start = 0;
		int pos = (start + cur_size) % size;
		array[pos] = element;
		cur_size++;
	}

	public T remove() throws Exception {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException("Empty queue");
		T removed = (T) array[start];
		if (start < size - 1)
			start++;
		else
			start = 0;
		cur_size--;
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
