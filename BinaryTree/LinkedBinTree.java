public class LinkedBinTree<T> implements GenericBinTree<T> {
	private Node root;
	private int cur_size;

	public LinkedBinTree() {
		this.root = null;
		this.cur_size = 0;
	}

	public int height() {
		if (isEmpty())
			return -1;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void clear() {
		root = null;
		cur_size = 0;
	}
}
