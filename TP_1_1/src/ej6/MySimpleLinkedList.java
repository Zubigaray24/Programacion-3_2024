package ej6;

import java.util.Comparator;
import java.util.Iterator;

/*
Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
suponiendo que: 
a) Las listas están desordenadas y la lista resultante debe quedar ordenada. 
b) Las listas están ordenadas y la lista resultante debe mantenerse ordenada.
*/

public class MySimpleLinkedList<T> implements Iterable<T>  {
	
	private Node<T> first;
	private Comparator<T> comp;
	private int largo = 0;
	
	public MySimpleLinkedList(Comparator<T> comp) {
		this.first = null;
		this.comp = comp;
	}
	
	public Node<T> getFirst() {
		return this.first;
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
	
	public void deleteNode(int index) {
		int contador=0;
		Node<T> anterior = null;
		Node<T> aux = this.first;
		while( (aux != null) && (contador < index) ) {
			if(contador == index-1) {
				anterior = aux;
			}
			contador = contador+1;
			aux = aux.getNext();
		}
		if(contador == index) {
			anterior.setNext(aux.getNext());
		}
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
	
	public void insertarOrdenado(T dato) {
		Node<T> nuevo = new Node<T>();
		nuevo.setInfo(dato);
		if(this.first==null) {
			this.first = nuevo;
		}
		else {
			Node<T> anterior = null;
			Node<T> aux = this.first;	
			while((aux!=null)&&(comp.compare(dato, aux.getInfo())<0)){
				anterior = aux;
				aux = aux.getNext();
			}
			if(anterior!=null && aux==null) {
				anterior.setNext(nuevo);
			}
			else {
				nuevo.setNext(aux);
				if(aux == this.first) {
					this.first = nuevo;
				}
				else {
					anterior.setNext(nuevo);
				}
			}
		}
		this.largo++;
	}
	
	public MySimpleLinkedList<T> ordernarListasPrimera(MySimpleLinkedList<T> l1,MySimpleLinkedList<T> l2) {
		
		Node<T> aux1 =new Node<T>();;
		aux1 = (l1.getFirst());
		Node<T> aux2 = new Node<T>();
		aux2=(l2.getFirst());
		MySimpleLinkedList<T> listaOrdenada = new MySimpleLinkedList<T>(this.comp);
		boolean encontrado = false;
	
		while(aux1.getNext()!=null) {
			
			while((aux2.getNext()!=null)&&(encontrado!=true)) {
				if((comp.compare(aux1.getInfo(), aux2.getInfo())==0)) {
					encontrado= true;
				}
				aux2 = aux2.getNext();
						
			}
				
			if((encontrado!=true)) {
				listaOrdenada.insertarOrdenado(aux1.getInfo());
			}
				
			aux1 = aux1.getNext();	
			aux2=(l2.getFirst());
			encontrado=false;
			
		}
			
		return listaOrdenada;
	}
	
	@Override
	public String toString() {
		return "Lista_vinculada [primero=" + this.first + "]";
	}
	
	@Override
	public Iterator<T> iterator() {
		return new IteradorLista<T>(this.first);
	}
}
