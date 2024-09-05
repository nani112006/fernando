package Ejercicio_63;

import java.util.Scanner;
import java.util.Stack;

public class NavegadorWeb {

    private Stack<String> historial = new Stack<>();
    private Stack<String> adelante = new Stack<>();

    public static void main(String[] args) {
        NavegadorWeb navegador = new NavegadorWeb();
        navegador.iniciar();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Navegación:");
            System.out.println("1. Visitar una página nueva");
            System.out.println("2. Volver atrás");
            System.out.println("3. Avanzar");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();
            System.out.println();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    visitarPagina(scanner);
                    break;
                case 2:
                    volverAtras();
                    break;
                case 3:
                    avanzar();
                    break;
                case 4:
                    mostrarHistorial();
                    break;
                case 5:
                    System.out.println("Salir del navegador");
                    break;
                default:
                    System.out.println("Esta opción es corecta, elige una opción del 1 al 5.");
            }
        } while (opcion != 5);
    }

    private void visitarPagina(Scanner scanner) {
        System.out.print("Ingresa la URL de la página que quiere visitar: ");
        String url = scanner.nextLine();

        historial.push(url);

        adelante.clear();

        System.out.println("Estas llendo a: " + url);
    }

    private void volverAtras() {
        if (!historial.isEmpty()) {
            String paginaActual = historial.pop();
            adelante.push(paginaActual);

            if (!historial.isEmpty()) {
                System.out.println("Estas volviendo a: " + historial.peek());
            } else {
                System.out.println("En el historial ya no hay paginas.");
            }
        } else {
            System.out.println("No puede volver atras en el historial.");
        }
    }

    private void avanzar() {
        if (!adelante.isEmpty()) {
            String pagina = adelante.pop();
            historial.push(pagina);

            System.out.println("Esta llendo a: " + pagina);
        } else {
            System.out.println("No hay páginas para avanzar.");
        }
    }

    private void mostrarHistorial() {
        if (!historial.isEmpty()) {
            System.out.println("Historial de navegación:");
            for (String url : historial) {
                System.out.println(url);
            }
        } else {
            System.out.println("El historial está vacío.");
        }
    }
}