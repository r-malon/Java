public class IntegerArray {
	private Integer array[];
	private int 	initialCapacity;
	private int 	counter;
	private boolean resizeable;

	public IntegerArray() {
		this(10);
	}

	public IntegerArray(int initialCapacity) {
		this(initialCapacity, true);
	}

	public IntegerArray(int initialCapacity, boolean resizeable) {
		this.initialCapacity = initialCapacity;
		this.resizeable = resizeable;
		this.array = new Integer[initialCapacity];
		this.counter = 0;
	}

	public void add(Integer element) {
		array[counter] = element;
		counter++;

		if (resizeable && counter == array.length) resize();
	}

	private void resize() {
		
	}

	public Integer[] toArray() {
		return array;
	}
}
