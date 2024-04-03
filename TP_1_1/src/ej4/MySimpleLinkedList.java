package ej4;

import java.util.Iterator;

/*
Ejercicio 4
A partir de la clase Lista implementada en el ejercicio 1, implemente el patrón iterator-iterable, para que la lista sea iterable. 
¿Existe alguna ventaja computacional a la hora de recorrer la lista de principio a fin si se cuenta con un iterador?
*/

public class MySimpleLinkedList<T> implements Iterable<T>{
	
	private Node<T> first;
	private int largo = 0;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
		largo++;
	}
	
	public T extractFront() {
		T resultado = null;
		
		if(this.first == null) {
			System.out.println("La lista esta vacía");
			T data = null;
			return data;
		}
		resultado = this.first.getInfo();
		this.first = this.first.getNext();

		return resultado;
	}

	public boolean isEmpty() {
		return this.first == null;
	}
	
	public T get(int index) {
		Node<T> tmp = this.first;
		int contador = 0;
		
		while ((contador < index) && (tmp.getInfo() != null)) {
			tmp = tmp.getNext();
		}
		
		return tmp.getInfo();
	}
	
	public int size() {
		return this.largo;
	}
	
	public int indexOf(T data) {
		int resultado = 0;
		Node<T> tmp = this.first;
		while((tmp.getInfo() != data) && (tmp.getInfo() != null)) {
			resultado++;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Lista_vinculada [primero=" + this.first + "]";
	}
	
	@Override
	public Iterator<T> iterator() {
		return new IteratorLinkedList<T>(this.first);
	}
}
