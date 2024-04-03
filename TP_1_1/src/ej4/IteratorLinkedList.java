package ej4;

import java.util.Iterator;

public class IteratorLinkedList<T> implements Iterator<T> {
	
	private Node<T> cursor;

	public IteratorLinkedList(Node<T> cursor) {
		this.cursor=cursor;
	}
	
	@Override
	public boolean hasNext() {
		return this.cursor!=null;
	}
	
	@Override
	public T next() {
		T valor = cursor.getInfo();
		cursor = cursor.getNext();
		return valor;
	}
	
	public T nextValue() {
		T valor = cursor.getNext().getInfo();
		return valor;
	}
}
