import java.util.Scanner;

public class Entrada {


    public static void main(String []args) {

        System.out.println("Proyecto Operadores");
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = lector.nextLine();

        System.out.println("Introduce el nombre del ciclo donde estás matriculado: ");
        String ciclo = lector.nextLine();

        System.out.println("¿Qué nota crees que sacarás al final del curso?: ");
        int nota = lector.nextInt();

        
        System.out.println("Mi nombre es "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Nota prevista: "+nota);

    }

}
