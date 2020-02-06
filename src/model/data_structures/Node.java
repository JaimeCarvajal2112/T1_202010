package model.data_structures;

public class Node <T> {
	T dato;
	@SuppressWarnings("rawtypes")
	Node siguiente;
	Node anterior;
	
	public Node(T dato){
		this(dato, null, null);
	}
	public Node(T dato, Node<T> siguiente, Node <T> anterior){
		this.dato = dato;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}
	public Node darAnterior(){
		return anterior;
	}
	public Node darSiguiente(){
		return siguiente;
	}
	public void cambiarAnterior(Node nuevoAnt){
		this.anterior = nuevoAnt;
	}
	public void cambiarSig(Node nuevoSig){
		this.siguiente = nuevoSig;
	}
	public T darDato(){
		return dato;
	}

}
