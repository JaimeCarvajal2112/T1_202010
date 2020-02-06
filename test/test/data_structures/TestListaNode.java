package test.data_structures;
import model.data_structures.*;

public class TestListaNode {



	public static void test(Lista list){
		list.agregar(5);
		list.agregar(2);
		list.agregar(1);
		list.darTamano();
		list.iniciarRecorrido();
		System.out.println(list.darActual());
		System.out.println(list.darTamano());
		System.out.println(list.eliminar(1));
		list.iniciarRecorrido();
		System.out.println(list.darActual());
		System.out.println(list.darTamano());
		list.avanzar();
		System.out.println(list.darActual());
		list.retroceder();
		System.out.println(list.darActual());
		
	}

	public static void main(String[] args){
		Lista list = new Lista<Integer>();
		test(list);
	}


}
