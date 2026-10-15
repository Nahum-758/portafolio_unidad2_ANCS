package listas.simples;

/**
 * Definicion de una lista Simple
 * @author Ángel Nahum Camarillo Solano
 * @date 15 octubre 2026
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

// TODO: Implementar insertarAlInicio
    public void insertarInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor); 
        nuevoNodo.siguiente = cabeza;     
        cabeza = nuevoNodo;               
    }

// TODO: Implementar recorrer (imprimir todos los elementos)
    public void recorrer() {
        Nodo actual = cabeza;
        
        if (actual == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        System.out.print("Elementos de la lista: ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}