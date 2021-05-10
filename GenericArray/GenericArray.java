public interface GenericArray<T> {
	void add(T element);
	void add(int pos, T element);
	T remove(int pos);
	boolean removeFirst(T element);
	void clear();
	T get(int pos);
	T set(int pos, T element);
	int size();
	int indexOf(T element);
	int lastIndexOf(T element);
	boolean isEmpty();
	boolean contains(T element);
	T[] toArray();
}
