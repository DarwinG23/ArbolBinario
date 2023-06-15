/**
 * Autor: Darwin Granda
 * @version 1.0, 20/09/2021
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner numNodos = new Scanner(System.in);
        System.out.println("Ingrese el numero de nodos: ");
        int nodo = numNodos.nextInt();
        for (int i = 0; i < nodo; i++) {
            System.out.println("Ingrese el nodo " + (i+1) + ": ");
            int valorNodo = numNodos.nextInt();
            arbol.insertar(valorNodo);
        }
        System.out.println("InOrden: ");
        arbol.iniciarInOrden();
        System.out.println("\n");
        System.out.println("PostOrden: ");
        arbol.iniciarPostOrden();
        System.out.println("\n");
        System.out.println("PreOrden: ");
        arbol.iniciarPreOrden();
    }
}