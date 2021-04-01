public interface GenericArray<T> {
	public void add(T element);
	public void add(int pos, T element);
	public T remove(int pos);
	public boolean removeFirst(T element);
	public void clear();
//	public T get(int pos);
//	public T set(int pos, T element);
	public int size();
	public int indexOf(T element);
	public int lastIndexOf(T element);
	public boolean isEmpty();
	public boolean contains(T element);
	public T[] toArray();
}
