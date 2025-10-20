import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pila pila = new Pila();
        int opcion;

        do {
            System.out.println("--- MENU GESTION DE LLAMADAS A RUTINAS ---");
            System.out.println("1. Agregar rutina");
            System.out.println("2. Eliminar rutina (pop)");
            System.out.println("3. Ver rutina actual (peek)");
            System.out.println("4. Mostrar pila completa");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = in.nextInt();
            in.nextLine(); //Se limpia el buffer

            switch (opcion) {
                case 1:
                    //Ingresamos la rutina simulada
                    System.out.print("Nombre de la rutina: ");
                    String nombre = in.nextLine();
                    System.out.print("Tipo de retorno: ");
                    String tipo = in.nextLine();
                    //Se añade a la pila con push()
                    pila.push(nombre, tipo);
                    break;
                case 2:
                    //Podemos eliminar la rutina superior con pop()
                    System.out.println(pila.pop());
                    break;
                case 3:
                    //Podemos ver la rutina superior con peek()
                    System.out.println(pila.peek());
                    break;
                case 4:
                    //Mostramos toda la pila
                    System.out.println(pila.mostrar());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion ingresada invalida.");
            }
        } while (opcion != 5);
    }
}
