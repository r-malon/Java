public interface GenericQueue<T> {
	void add(T element) throws Exception;
	T remove() throws Exception;
	void clear();
	boolean isEmpty();
}
