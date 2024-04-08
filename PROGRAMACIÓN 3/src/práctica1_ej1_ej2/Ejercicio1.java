package práctica1_ej1_ej2;

public class Ejercicio1 {

	// Método estático que imprime los números entre a y b utilizando un for
    public static void imprimirConFor(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    // Método estático que imprime los números entre a y b utilizando un while
    public static void imprimirConWhile(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.println(i);
            i++;
        }
    }

    // Método estático que imprime los números entre a y b sin utilizar estructuras iterativas
    public static void imprimirSinEstructurasIterativas(int a, int b) {
        if (a <= b) {
            System.out.println(a);
            imprimirSinEstructurasIterativas(a + 1, b);
        }
    }

    public static void main(String[] args) {
        // Llamadas de ejemplo a los métodos
        System.out.println("Imprimir con for:");
        imprimirConFor(1, 5);

        System.out.println("\nImprimir con while:");
        imprimirConWhile(1, 5);

        System.out.println("\nImprimir sin estructuras iterativas:");
        imprimirSinEstructurasIterativas(1, 5);
    }
}
