package node;

public class Node<T> {
	private T data;
	private Node next;

	public Node() {
		this(null, null);
	}

	public Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T element) {
		data = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		next = node;
	}
}
