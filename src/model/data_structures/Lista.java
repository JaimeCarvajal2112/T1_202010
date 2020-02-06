package model.data_structures;

public class Lista <T> {

	protected Node<T> primero;
	protected int tamano;
	protected Node<T> actual;

	public Lista(){
		primero = null;
		tamano = 0;
	}

	public boolean agregar(T nodo){
		Node<T> nuevo = new Node<T>(nodo);
		try{
			if(primero != null){
				nuevo.cambiarSig(primero);
				primero.cambiarAnterior(nuevo);
				primero = nuevo;
				this.tamano++;
				return true;
			}else{
				primero = nuevo;
				return true;
			}
		}catch(Exception e){return false;}
	}

	public boolean eliminar(T nodo){
		if(primero != null){
			Node<T> nuevo = new Node<T>(nodo);
			Node<T> revisar = primero;
			while(revisar.darSiguiente()!=null){
				if(revisar == nuevo){
					revisar.darAnterior().cambiarSig(revisar.darSiguiente());
					revisar.darSiguiente().cambiarAnterior(revisar.darAnterior());
					tamano--;
					return true;
				}else{
					revisar = revisar.darSiguiente();
				}

			}
			return false;
		}else{
			return false;
		}
	}

	public int darTamano(){
		return tamano;
	}

	public T darElemento(int pos){
		if(pos >= tamano || primero == null){
			return null;
		}else{
			actual = primero;
			for(int i = 0; i < pos; i++){
				actual = actual.darSiguiente();
			}
			return actual.darDato();
		}
	}

	public void iniciarRecorido(){
		actual = primero;
	}

	public T darActual(){
		return actual.darDato();
	}

	public void avanzar(){
		if(actual.darSiguiente()!=null){
			actual = actual.darSiguiente();
		}else{
			actual = null;
		}
	}

	public void retroceder(){
		if(actual.darAnterior()!=null){
			actual = actual.darAnterior();
		}else{
			actual = null;
		}
	}
}



