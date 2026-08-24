import java.util.LinkedList;

public class PedidosPizza {
    public static void main(String[] args) {
        LinkedList<String> pedidos = new LinkedList<>();

        // Llegan pedidos: se agregan al final de la fila
        pedidos.add("Pizza Hawaiana - Mesa 1");
        pedidos.add("Pizza Pepperoni - Mesa 2");
        pedidos.add("Pizza Margarita - Mesa 3");
        System.out.println("Fila de pedidos: " + pedidos);

        // Llega un pedido urgente (VIP): se mete de PRIMERO en la fila
        pedidos.addFirst("Pizza 4 Quesos - Delivery URGENTE");
        System.out.println("Con pedido urgente: " + pedidos);

        // El cocinero atiende el pedido que está de primero
        String enPreparacion = pedidos.removeFirst();
        System.out.println("Preparando ahora: " + enPreparacion);
        System.out.println("Fila queda: " + pedidos);

        // Se cancela el último pedido de la fila
        String cancelado = pedidos.removeLast();
        System.out.println("Se cancela: " + cancelado);
        System.out.println("Fila final: " + pedidos);