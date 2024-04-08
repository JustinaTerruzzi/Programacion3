package práctica1_array_ej3;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*Escriba una clase llamada Test con el método main, el cual cree un arreglo con 2
		objetos Estudiante, otro arreglo con 3 objetos Profesor, y luego recorra ambos
		arreglos imprimiendo los valores obtenidos mediante el método tusDatos(). Recuerde
		asignar los valores de los atributos de los objetos Estudiante y Profesor invocando los
		respectivos métodos setters.*/
		Estudiante[] arrayE = new Estudiante[2];
		Profesor [] arrayP = new Profesor[3];
		Scanner consola = new Scanner(System.in);
		
		// Llenar arrayE con instancias de Estudiante
        for (int i = 0; i < arrayE.length; i++) {
            arrayE[i] = new Estudiante();
        }
        for (int i = 0; i < arrayP.length; i++) {
            arrayP[i] = new Profesor();
        }
        // Establecer el nombre de cada estudiante utilizando consola.next()
        for (Estudiante student : arrayE) {
            System.out.print("Ingrese el nombre del estudiante: ");
            student.setNombre(consola.next());
        }
        for (Profesor teacher : arrayP) {
            System.out.print("Ingrese el nombre del profesor: ");
            teacher.setNombre(consola.next());
        }

        // Mostrar los nombres de los estudiantes
        for (Estudiante student : arrayE) {
            System.out.println("Nombre del estudiante: " + student.getNombre());
        }
        for (Profesor teacher : arrayP) {
            System.out.println("Nombre del profesor: " + teacher.getNombre());
        }

        consola.close();

	}

}
