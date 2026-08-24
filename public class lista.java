public class lista {

    static class Nodo {

        int dato;

        Nodo siguiente;

        public Nodo(int dato) {

            this.dato = dato;

            this.siguiente = null;

        }

    }

    Nodo cabeza;

    public void agregar(int dato) {

        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {

            cabeza = nuevoNodo;

        } else {

            Nodo actual = cabeza;

            while (actual.siguiente != null) {

                actual = actual.siguiente;

            }

            actual.siguiente = nuevoNodo;

        }

    }

    public void mostrar() {

        Nodo actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " -> ");

            actual = actual.siguiente;

        }

        System.out.println("null");

    }

    public static void main(String[] args) {

        lista lista = new lista();

        lista.agregar(10);

        lista.agregar(20);

        lista.agregar(30);

        lista.mostrar();

    }

}