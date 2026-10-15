package listas.simples;

/**
 * Main para correr el nodo y lista
 * @author Ángel Nahum Camarillo Solano
 * @date 15 octubre 2026
 */


public class Main {
    public static void main(String[] args) {
        ListaSimple miLista = new ListaSimple();

        System.out.println("--- PRUEBA DE LISTA ENLAZADA SIMPLE ---");
        
        miLista.insertarInicio(30);
        miLista.insertarInicio(20);
        miLista.insertarInicio(10);

        // Recorremos e imprimimos los elementos de la lista
        miLista.recorrer();
    }
}