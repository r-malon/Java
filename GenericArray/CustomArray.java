public class CustomArray<T> implements GenericArray<T> {
	private T array[];
	private int 	initialCapacity;
	private int 	counter;
	private boolean resizeable;

	public CustomArray() {
		this(10);
	}

	public CustomArray(int initialCapacity) {
		this(initialCapacity, true);
	}

	public CustomArray(int initialCapacity, boolean resizeable) {
		this.initialCapacity = initialCapacity;
		this.resizeable = resizeable;
		this.array = (T[]) new Object[initialCapacity];
		this.counter = 0;
	}

	public void add(T element) {
		array[counter] = element;
		counter++;

		if (resizeable && counter == array.length) resize();
	}

	public void add(int pos, T element) {

	}

	private void resize() {
		T[] temp = (T[]) new Object[array.length];

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) temp[i] = array[i]; // TODO
		}
		array = temp;
	}

	public T remove(int pos) {
		T[] temp = (T[]) new Object[array.length - 1];

		for (int i = 0, j = 0; i < array.length; i++, j++) {
			if (i == pos) continue;
			if (array[i] != null) temp[j] = array[i]; // TODO
		}
		array = temp;
	}

	public boolean removeFirst(T element) {
		return false;
	}

	public T[] toArray() {
		return array;
	}

	public int indexOf(T element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) return i;
		}
		return -1;
	}

	public int lastIndexOf(T element) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == element) return i;
		}
		return -1;
	}

	public boolean contains(T element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) return true;
		}
		return false;
	}

	public void clear() {
		counter = 0;
		array = (T[]) new Object[initialCapacity];
	}

	public int size() {
		return array.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		if (!resizeable) return size() == counter;
	}
}
