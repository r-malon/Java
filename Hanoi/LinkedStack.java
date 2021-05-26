public class LinkedStack<T> implements GenericStack<T> {
	private Node top;

	public LinkedStack() {
		this.top = null;
	}

	public void push(T element) throws Exception {
		Node node = new Node(element, null);
		if (isEmpty()) {
			top = node;
		} else {
			node.setNext(top);
			top = node;
		}
	}

	public T pop() throws Exception {
		if (isEmpty())
			throw new Exception("Empty stack");
		T removed = (T) top.getData();
		top = top.getNext();
		return removed;
	}

	public T top() throws Exception {
		if (isEmpty())
			throw new Exception("Empty stack");
		return (T) top.getData();
	}

	public void clear() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}
}
