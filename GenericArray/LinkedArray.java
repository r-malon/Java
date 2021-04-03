public class LinkedArray<T> implements GenericArray<T> {
	private Node 	first;
	private Node 	last;
	private int 	counter;

	public LinkedArray() {
		this.first 		= null;
		this.last 		= null;
		this.counter 	= 0;
	}

	public void clear() {
		this.first 		= null;
		this.last 		= null;
		this.counter 	= 0;
	}

	public void add(T element) {
		Node node = new Node(element, null);

		if (counter == 0) {
			first = node;
			last = first;
		} else {
			last.setNext(node);
			last = node;
		}
		counter++;
	}

	public void add(int pos, T element) {}

	public T remove(int pos) {
		T removed = null;
		Node curr = first;
		Node prev;

		for (int i = 0; i < counter; i++) {
			if (i == (pos - 1)) {
				prev = curr;
			}
			curr = curr.getNext();
		}
		return removed;
	}

	public boolean removeFirst(T element) {throw new java.lang.UnsupportedOperationException("Not supported yet.");}
	public T get(int pos) {throw new java.lang.UnsupportedOperationException("Not supported yet.");}
	public T set(int pos, T element) {throw new java.lang.UnsupportedOperationException("Not supported yet.");}

	public int indexOf(T element) {throw new java.lang.UnsupportedOperationException("Not supported yet.");}
	public int lastIndexOf(T element) {throw new java.lang.UnsupportedOperationException("Not supported yet.");}
	public boolean contains(T element) {throw new java.lang.UnsupportedOperationException("Not supported yet.");}

	public boolean isEmpty() {
		return counter == 0;
	}

	public int size() {
		return counter;
	}

	public T[] toArray() {
		T[] array = (T[]) new Object[counter];

		if (first == null) return array;

		Node curr = first;

		for (int i = 0; i < counter; i++) {
			array[i] = (T) curr.getData();
			curr = curr.getNext();
		}
		return array;
	}
}
