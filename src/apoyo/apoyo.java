package apoyo;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
public class apoyo {
	 //Ordenar una lista//
	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(3);
	        numbers.add(1);
	        numbers.add(4);
	        numbers.add(1);
	        numbers.add(5);

	        System.out.println("Before sorting: " + numbers);
	        Collections.sort(numbers);
	        System.out.println("After sorting: " + numbers);
	    }
	}
	import java.util.ArrayList;
	import java.util.List;

	public class Main {//Verificar si una lista de enteros/cadenas contiene un número específico://
	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        int elementToCheck = 3;
	        boolean contains = numbers.contains(elementToCheck);

	        if (contains) {
	            System.out.println("The list contains the element: " + elementToCheck);
	        } else {
	            System.out.println("The list does not contain the element: " + elementToCheck);
	        }
	    }
	}
	//busca un elemento-----------------//
	import java.util.HashSet;

	public class Main {
	    public static void main(String[] args) {
	        // Crear un HashSet
	        HashSet<String> fruits = new HashSet<>();

	        // Agregar elementos al HashSet
	        fruits.add("apple");
	        fruits.add("banana");
	        fruits.add("cherry");
	        fruits.add("apple"); // No se agrega porque ya existe

	        // Imprimir el HashSet
	        System.out.println("Fruits: " + fruits);

	        // Verificar si contiene un elemento
	        if (fruits.contains("banana")) {
	            System.out.println("The set contains banana.");
	        }
	        // Eliminar un elemento
	        fruits.remove("banana");

	        // Verificar si contiene un elemento después de eliminarlo
	        if (!fruits.contains("banana")) {
	            System.out.println("The set no longer contains banana.");
	        }
	        // Iterar sobre los elementos
	        System.out.println("Iterating over the set:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
	}//Encontrar la posición de un elemento en una lista de enteros://
	import java.util.ArrayList;
	import java.util.List;

	public class Main {
	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(20);

	        int index = numbers.indexOf(20);
	        System.out.println("The first occurrence of 20 is at index: " + index);
	    }
	}

}
