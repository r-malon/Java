public class CustomArray<T> implements GenericArray<T> {
	private T array[];
	private int 	initialCapacity;
	private int 	counter;
	private boolean resizeable;
	private static int resizeSize = 5;

	public CustomArray() {
		this(10);
	}

	public CustomArray(int initialCapacity) {
		this(initialCapacity, true);
	}

	public CustomArray(int initialCapacity, boolean resizeable) {
		this.initialCapacity = initialCapacity;
		this.resizeable		 = resizeable;
		this.array			 = (T[]) new Object[initialCapacity];
		this.counter		 = 0;
	}

	public void add(T element) {
		array[counter] = element;
		counter++;

		if (resizeable && counter == array.length) resize();
	}

	public void add(int pos, T element) {
		T[] temp = (T[]) new Object[array.length + 1];

		for (int i = 0; i < array.length + 1; i++) {
			if (i < pos)
				temp[i] = array[i];
			else if (i == pos)
				temp[i] = element;
			else
				temp[i] = array[i - 1];
		}
		array = temp;
	}

	private void resize() {
		T[] temp = (T[]) new Object[array.length + resizeSize];

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) temp[i] = array[i];
		}
		array = temp;
	}

	public T remove(int pos) {
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

	public boolean removeFirst(T element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				remove(i);
				return true;
			}
		}
		return false;
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

	public T get(int index) {
		return array[index];
	}

	public T set(int index, T element) {
		T old = array[index];
		array[index] = element;

		return old;
	}

	public void clear() {
		counter	 = 0;
		array	 = (T[]) new Object[initialCapacity];
	}

	public int size() {
		return array.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == counter;
	}

	public T[] toArray() {
		return array;
	}
}
