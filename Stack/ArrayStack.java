public class ArrayStack<T> implements GenericStack<T> {
	private T	array[];
	private int cur_size;
	private final int size;

	public ArrayStack(int size) {
		this.size	  = size;
		this.cur_size = 0;
		this.array    = (T[]) new Object[size];
	}

	public void push(T element) throws Exception {}

	public T pop() throws Exception {}

	public T top() throws Exception {}

	public void clear() {
		cur_size = 0;
		array	 = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		return array.length == 0;
	}
}
