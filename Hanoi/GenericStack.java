public interface GenericStack<T> {
	void push(T element) throws Exception;
	T pop() throws Exception;
	T top() throws Exception;
	void clear();
	boolean isEmpty();
}
