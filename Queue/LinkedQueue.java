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
	}

	public void clear() {
		this.start = null;
		this.end   = null;
	}

	public boolean isEmpty() {
		return counter == 0;
	}
}
