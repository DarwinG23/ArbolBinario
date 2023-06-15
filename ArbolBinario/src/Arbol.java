public class Arbol {

    //Atributos
    private NodoArbol raiz; //Nodo raiz del arbol


    //Constructor
    public Arbol(){
        this.raiz = null;
    }

    //Metodos

    public void insertar(int raiz){
        if(this.raiz == null){ //Si el arbol esta vacio, se crea un nuevo nodo
            this.raiz = new NodoArbol(raiz);
        }else{
            this.raiz.insertar(raiz);//Si ya hay un nodo raiz, se llama al metodo insertar de ese nodo
        }
    }

    public  void iniciarPreOrden(){
        this.preOrden(this.raiz);

    }

    public void preOrden(NodoArbol raiz){
        if(raiz == null){   //Si el nodo es nulo, se termina el metodo
            return;
        }else{
            System.out.print(raiz.getRaiz() + ", "); //Se imprime la raiz
            preOrden(raiz.getIzquierdo()); //Se llama al metodo preOrden con el nodo izquierdo
            preOrden(raiz.getDerecho()); //Se llama al metodo preOrden con el nodo derecho
        }

    }

    public  void iniciarInOrden(){
        this.inOrden(this.raiz);

    }

    public void inOrden(NodoArbol raiz){
        if(raiz == null){   //Si el nodo es nulo, se termina el metodo
            return;
        }else{
            inOrden(raiz.getIzquierdo()); //Se llama al metodo preOrden con el nodo izquierdo
            System.out.print(raiz.getRaiz() + ", "); //Se imprime la raiz
            inOrden(raiz.getDerecho()); //Se llama al metodo preOrden con el nodo derecho
        }
    }

    public  void iniciarPostOrden(){
        this.postOrden(this.raiz);

    }

    public void postOrden(NodoArbol raiz){
        if(raiz == null){   //Si el nodo es nulo, se termina el metodo
            return;
        }else{
            postOrden(raiz.getIzquierdo()); //Se llama al metodo preOrden con el nodo izquierdo
            postOrden(raiz.getDerecho()); //Se llama al metodo preOrden con el nodo derecho
            System.out.print(raiz.getRaiz() + ", "); //Se imprime la raiz
        }

    }


}
