import node.Node.*;

public class LinkedStack<T> implements GenericStack<T> {
	private Node top;

	public LinkedStack() {
		this.top = null;
	}

	public void clear() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}
}
