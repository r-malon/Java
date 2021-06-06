public interface GenericBinTree<T> {
	void add(T element) throws Exception;
	T remove() throws Exception;
	int height();
	void clear();
	boolean isEmpty();
}
