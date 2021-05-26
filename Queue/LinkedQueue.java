import node.Node.*;

public class LinkedQueue<T> implements GenericQueue<T> {
	private Node start;
	private Node end;

	public LinkedQueue() {
		this.start = null;
		this.end   = null;
	}

	public void add(T element) throws Exception {
		Node node = new Node(element, null);
		if (start == null) {
			start = node;
			end = start;
		} else {
			end.setNext(node);
			end = node;
		}
	}

	public T remove() throws Exception {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException("Empty queue");
		T removed = start.getData();
		start = start.getNext();
		return removed;
	}

	public void clear() {
		this.start = null;
		this.end   = null;
	}

	public boolean isEmpty() {
		return start == null && end == null;
	}
}
