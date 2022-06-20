package test03.Generic.Child;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
