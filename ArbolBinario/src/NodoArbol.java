public class NodoArbol {
    //Atributos
    private int raiz;
    private NodoArbol izquierdo;
    private NodoArbol derecho;


    //Constructor
    public NodoArbol(int raiz){
        this.raiz = raiz;
        this.derecho = null;
        this.izquierdo = null;
    }

    //Getters y Setters
    public int getRaiz() {
        return raiz;
    }

    public void setRaiz(int raiz) {
        this.raiz = raiz;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    //Metodos
    public void insertar(int raiz){
        if(raiz < this.raiz) {
            //Insertar el lado izquierdo
            if (izquierdo == null) {
                izquierdo = new NodoArbol(raiz); //Si no hay nada a la izquierda, se crea un nuevo nodo
            } else {
                izquierdo.insertar(raiz);  //Si ya hay un nodo a la izquierda, se llama al método insertar de ese nodo
            }
        }else{
            //Insertar el lado derecho
            if (derecho == null) {
                derecho = new NodoArbol(raiz); //Si no hay nada a la derecha, se crea un nuevo nodo
            } else {
                derecho.insertar(raiz);  //Si ya hay un nodo a la derecha, se llama al método insertar de ese nodo
            }
        }
    }

}
