
public class GrafoPonderado {

    static class Arista {

        String destino;

        int peso;

        Arista(String destino, int peso) {

            this.destino = destino;

            this.peso = peso;

        }

        @Override

        public String toString() {

            return destino + " (peso: " + peso + ")";

        }

    }

    private Map<String, List<Arista>> grafo;

    public GrafoPonderado() {

        grafo = new HashMap<>();

    }

    public void agregarVertice(String vertice) {

        if (!grafo.containsKey(vertice)) {

            grafo.put(vertice, new ArrayList<>());

        }

    }

    public void agregarArista(String origen, String destino, int peso) {

        agregarVertice(origen);

        agregarVertice(destino);

        grafo.get(origen).add(new Arista(destino, peso));

        grafo.get(destino).add(new Arista(origen, peso));

    }

    public void mostrarGrafo() {

        System.out.println("REPRESENTACIÓN DEL GRAFO");

        for (String vertice : grafo.keySet()) {

            System.out.print(vertice + " -> ");

            for (Arista arista : grafo.get(vertice)) {

                System.out.print(arista + " | ");

            }

            System.out.println();

        }

    }

    public void BFS(String inicio) {

        if (!grafo.containsKey(inicio)) {

            System.out.println("El vértice no existe.");

            return;

        }

        Set<String> visitados = new HashSet<>();

        Queue<String> cola = new LinkedList<>();

        visitados.add(inicio);

        cola.add(inicio);

        System.out.print("BFS: ");

        while (!cola.isEmpty()) {

            String actual = cola.poll();

            System.out.print(actual + " ");

            for (Arista arista : grafo.get(actual)) {

                if (!visitados.contains(arista.destino)) {

                    visitados.add(arista.destino);

                    cola.add(arista.destino);

                }

            }

        }

        System.out.println();

    }

    public void DFS(String inicio) {

        if (!grafo.containsKey(inicio)) {

            System.out.println("El vértice no existe.");

            return;

        }

        Set<String> visitados = new HashSet<>();

        System.out.print("DFS: ");

        DFSRecursivo(inicio, visitados);

        System.out.println();

    }

    private void DFSRecursivo(

            String actual,

            Set<String> visitados) {

        visitados.add(actual);

        System.out.print(actual + " ");

        for (Arista arista : grafo.get(actual)) {

            if (!visitados.contains(arista.destino)) {

                DFSRecursivo(arista.destino, visitados);

            }

        }

    }

    public static void main(String[] args) {

        GrafoPonderado grafo = new GrafoPonderado();

        grafo.agregarVertice("A");

        grafo.agregarVertice("B");

        grafo.agregarVertice("C");

        grafo.agregarVertice("D");

        grafo.agregarVertice("E");

        grafo.agregarVertice("F");

        grafo.agregarArista("A", "B", 5);

        grafo.agregarArista("A", "C", 3);

        grafo.agregarArista("B", "D", 4);

        grafo.agregarArista("B", "E", 2);

        grafo.agregarArista("C", "F", 6);

        grafo.agregarArista("D", "E", 1);

        grafo.agregarArista("E", "F", 7);

        grafo.mostrarGrafo();

        System.out.println();

        grafo.BFS("A");

        grafo.DFS("A");