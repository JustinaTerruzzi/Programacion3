package práctica1_arraylist_ej7;
import java.util.*;

import práctica1_array_ej3.Estudiante;

/*Formas de copiar una lista:
Existen varias formas de copiar una lista en Java:

1. Copia superficial (shallow copy): como se hizo en el ejemplo utilizando new ArrayList<>(listaOriginal),
se crea una nueva lista pero los elementos son las mismas referencias a los objetos originales.

2. Copia profunda (deep copy): implica crear nuevos objetos independientes en la lista copiada, lo que
significa que cualquier modificación en los objetos de la lista original no afectará a la lista copiada, y viceversa.

3. Utilizando métodos como Collections.copy() o ArrayList.addAll().*/

public class TestArrayList {
	
	public boolean esCapicua(ArrayList<Integer> lista) {
		 boolean exito;
		 ArrayList<Integer> listaInversa = new ArrayList<Integer>(lista);
		 invertirArrayList_1(listaInversa);
		 if (lista.equals(listaInversa)) {
			 exito=true;
			 }
			 else { 
				exito=false; 
				 }
		 return exito;
    }
	 public void invertirArrayList_1(ArrayList<Integer> lista) {
		 //Caso base: lista vacía o con un solo elemento
		 if (lista.size() <= 1 ) {
			 return;
		 }
		 //Caso recursivo:
		 //1. Eliminar el ultimo elemento de la lista
		 int primerElemento = lista.remove(0);
		 //2. Invertir el resto de la lista
		 invertirArrayList_1(lista);
		 //3. Agregar el ultimo elemento al principio de la lista
		 lista.add(primerElemento);
	 }
	 
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		for (int i=0; i<args.length; i++) {
			l.add(args[i]);
		}
		for (int i=0; i<args.length; i++) { 
			System.out.println(args[i]);
		}
		
		List<Estudiante> students = new ArrayList<Estudiante>();
		students.add(new Estudiante ("Justi", "Terruzzi"));
		students.add(new Estudiante("Antonina", "Terruzzi"));
		students.add(new Estudiante("Bau", "P"));
		
		ArrayList<Estudiante> copiedList = new ArrayList<Estudiante>(students);
		for (Estudiante estudiante : copiedList) {
            System.out.println(estudiante);
        }		
		
		/*Al modificar un dato en la lista original, la lista copiada también se ve afectada, ya que ambas listas
		  contienen referencias a los mismos objetos Estudiante.
		  Esto se debe a que al copiar la lista utilizando new ArrayList<>(listaOriginal), se crea una nueva lista
		  pero los elementos en ambas listas son las mismas referencias a los objetos Estudiante.
		  Por lo tanto, cualquier modificación realizada en uno de los objetos Estudiante dentro de la lista
		  original o copiada se reflejará en ambas listas.*/
		
		Estudiante nuevoEstudiante = new Estudiante("Bau", "P");
        if (!students.contains(nuevoEstudiante)) { //Para utilizar el contains debo sobreescribir el equals en Estudiante
            // El estudiante no está en la lista, se puede agregar
            students.add(nuevoEstudiante);
            System.out.println("El estudiante " + nuevoEstudiante.getNombre() + " fue agregado a la lista.");
        } else {
            System.out.println("El estudiante " + nuevoEstudiante.getNombre() + " ya está en la lista.");
        }
        
        
	}

}
