public class LinkedArray<T> implements GenericArray<T> {
	private Node 	first;
	private Node 	last;
	private int 	counter;

	public LinkedArray() {
		this.first   = null;
		this.last    = null;
		this.counter = 0;
	}

	public void clear() {
		this.first   = null;
		this.last    = null;
		this.counter = 0;
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

	public void add(int pos, T element) {
		Node node = new Node(element, null);
		Node curr = first;
		Node prev = null;
		Node next = null;

		if (pos == 0) {
			node.setNext(first);
			first = node;
		} else {
			for (int i = 0; i < counter; i++) {
				if (i == (pos - 1))
					prev = curr;
				else if (i == pos) {
					next = curr;
					break;
				}
				curr = curr.getNext();
			}
			prev.setNext(node);
			node.setNext(next);
		}
		counter++;
	}

	public T remove(int pos) {
		T removed = null;
		Node curr = first;
		Node prev = null;
		Node next = null;

		if (pos == 0) {
			removed = (T) first.getData();
			first = first.getNext();
		} else {
			for (int i = 0; i < counter; i++) {
				if (i == (pos - 1))
					prev = curr;
				else if (i == pos)
					removed = (T) curr.getData();
				else if (i == (pos + 1)) {
					next = curr;
					break;
				}
				curr = curr.getNext();
			}
			prev.setNext(next);
		}
		counter--;
		return removed;
	}

	public boolean removeFirst(T element) {
		Node curr = first;

		for (int i = 0; i < counter; i++) {
			if ((T) curr.getData() == element) {
				remove(i);
				return true;
			}
			curr = curr.getNext();
		}
		return false;
	}

	public T get(int pos) {
		Node curr = first;

		for (int i = 0; i < counter; i++) {
			if (i == pos) {
				return (T) curr.getData();
			}
			curr = curr.getNext();
		}
		return null;
	}

	public T set(int pos, T element) {
		Node curr = first;
		T old = null;

		for (int i = 0; i < counter; i++) {
			if (i == pos) {
				old = (T) curr.getData();
				curr.setData(element);
				break;
			}
			curr = curr.getNext();
		}
		return old;
	}

	public int indexOf(T element) {
		Node curr = first;

		for (int i = 0; i < counter; i++) {
			if ((T) curr.getData() == element) {
				return i;
			}
			curr = curr.getNext();
		}
		return -1;
	}

	public int lastIndexOf(T element) {
		Node curr = first;
		int index = -1;

		for (int i = 0; i < counter; i++) {
			if ((T) curr.getData() == element) {
				index = i;
			}
			curr = curr.getNext();
		}
		return index;
	}

	public boolean contains(T element) {
		Node curr = first;

		for (int i = 0; i < counter; i++) {
			if ((T) curr.getData() == element) return true;
			curr = curr.getNext();
		}
		return false;
	}

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
