package Models;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ListaDoblementeEnlazada<T> {

	// Atributos
	private T[] elementos;
	private int index;
	private Class<T> clazz;

	// Constructor

	public void Lista() {
		this.clazz = clazz;
		this.elementos = (T[]) Array.newInstance(clazz, 0);
		this.index = 0;
	}

	// M�todos

	// A�ade un elemento al final la lista
	public void add(T element) {
		int tama�o = this.elementos.length;
		T[] ArrayAux = (T[]) Array.newInstance(clazz, tama�o + 1);
		for (int index = 0; index < this.elementos.length; index++) {
			ArrayAux[index] = this.elementos[index];
		}
		ArrayAux[tama�o] = element;
		this.elementos = ArrayAux;

	}

	// Elimina el elemento de la lista
	public void remove(T element) {
		int tama�o = this.elementos.length;
		for (int indice = 0; indice < this.elementos.length; indice++) {
			if (this.elementos[index].equals(element)) {
				this.elementos[index] = null;
			}
		}
		T[] arrayAux = (T[]) new Object[this.elementos.length];
		arrayAux = this.elementos;

		this.elementos = (T[]) new Object[arrayAux.length - 1];
		index = index - 1;
	}

	// Devuelve el elemento siguiente de la lista
	public T getNext() {
		int tama�o = this.elementos.length;
		elementos[index] = elementos[index + 1];
		if (index > tama�o - 1) {
			index = 0;
			return elementos[index];
		} else {
			return elementos[index];
		}
	}

	// Devuelve el elemento anterior de la lista
	public T getPrev() {
		int tama�o = this.elementos.length;
		elementos[index] = elementos[index - 1];
		if (index < 0) {
			index = tama�o - 1;
			return elementos[index];
		} else {
			return elementos[index];
		}
	}

	// Devuelve el elemento actual de la lista
	public T getCurrent() {
		return elementos[index];
	}

	// Permite establecer el indice de la lista , siempre y cuando pertenezca a
	// la lista
	public int setIndex(int i) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nuevo �ndice");
		
		try{
			i=teclado.nextInt();
			teclado.nextLine();
		}catch(Exception e){
			System.out.println("[ERROR]");
		}
		index = i;
		if (index < 0 || index > elementos.length) {
			return -1;
		} else {
			return i;
		}
	}
	
}

