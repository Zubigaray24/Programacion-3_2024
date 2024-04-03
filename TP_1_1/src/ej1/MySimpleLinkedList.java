package ej1;

/*
Implemente los métodos indicados del esqueleto de Lista desarrollado en Teoría 
void insertFront(T), T extractFront(), boolean isEmpty(), int size(),
String toString(). Agregar también el método: T get(index).
*/

public class MySimpleLinkedList<T> {
	
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
	
	@Override
	public String toString() {
		return "Lista_vinculada [primero=" + this.first + "]";
	}
}
