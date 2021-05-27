public class ArrayStack<T> implements GenericStack<T> {
	private T[] array;
	private int cur_size;
	private final int size;

	public ArrayStack(int size) {
		this.size     = size;
		this.cur_size = 0;
		this.array    = (T[]) new Object[size];
	}

	public void push(T element) throws Exception {
		if (array.length == size)
			throw new Exception("Full stack");
		array[cur_size] = element;
		cur_size++;
	}

	public T pop() throws Exception {
		if (isEmpty())
			throw new Exception("Empty stack");
		T removed = array[cur_size - 1];
		array[cur_size - 1] = null;
		cur_size--;
		return removed;
	}

	public T top() throws Exception {
		if (isEmpty())
			throw new Exception("Empty stack");
		return array[cur_size - 1];
	}

	public void clear() {
		cur_size = 0;
		array    = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		return array.length == 0;
	}
}
