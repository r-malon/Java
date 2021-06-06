public class Node<T> {
	private T data;
	private Node left;
	private Node right;

	public Node(T data) {
		this(data, null, null);
	}

	public Node(T data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
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

	public void setLeft(Node node) {
		left = node;
	}

	public void setRight(Node node) {
		right = node;
	}
}
