package práctica1_ej1_ej2;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static int[] obtenerMultiplos(int n){
		int [] multiplos = new int[n];
		for (int i=0; i<n;  i++) {
			multiplos[i]= (i+1)*n;
		}
		return multiplos;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el número: ");
		int j = scanner.nextInt();
		int [] vector = obtenerMultiplos(j);
		System.out.println("Los multiplos son:");
		//System.out.println(Arrays.toString(multiplos));
		for (int i=0; i<j;  i++) {
			System.out.println(vector[i]);
		}
		scanner.close();
	}

}
