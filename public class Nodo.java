public class Nodo {


    int dato;
    Nodo siguiente;

    public Nodo(int dato){
        this.dato= dato;
        this.siguiente = null;
    }

    run|Debug
    public static void main(String[]args){

        Nodo nodo1 = new Nodo(dato:10);
        Nodo nodo2 = new Nodo(dato:20);
        Nodo nodo3 = new Nodo(dato:30);

        nodo1.siguiente = nodo2
        nodo.siguiente  = nodo3

        System.out.println(nodo1.dato);
        System.out.println(nodo2.dato);
        System.out.println(nodo3.dato);
    }
}