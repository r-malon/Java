public class LinkedStack<T> implements GenericStack<T> {
	private Node top;
	private int cur_size;

	public LinkedStack() {
		this.top = null;
		this.cur_size = 0;
	}

	public void push(T element) throws Exception {
		Node node = new Node(element, null);
		if (isEmpty()) {
			top = node;
		} else {
			node.setNext(top);
			top = node;
		}
		cur_size++;
	}

	public T pop() throws Exception {
		if (isEmpty())
			throw new Exception("Empty stack");
		T removed = (T) top.getData();
		top = top.getNext();
		cur_size--;
		return removed;
	}

	public T top() throws Exception {
		if (isEmpty())
			return null;
		return (T) top.getData();
	}

	public void clear() {
		top = null;
		cur_size = 0;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int getSize() {
		return cur_size;
	}
}
