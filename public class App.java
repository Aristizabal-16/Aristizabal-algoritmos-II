public class App {
    public static void main(String[] args) {

        int[] vector = new int[6];

        vector[0] = 2;
        vector[1] = 5;
        vector[2] = 8;
        vector[3] = 12;
        vector[4] = 20;

        int nuevo = 10;
        int n = 5;

        int i = n - 1;

        while (i >= 0 && vector[i] > nuevo) {
            vector[i + 1] = vector[i];
            i--;
        }

        vector[i + 1] = nuevo;

        for(int j = 0 ; j < n + 1; j++) {
            System.out.println(vector[j] + " ");
        }
    }
}