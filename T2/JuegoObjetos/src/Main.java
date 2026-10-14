import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = input.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt();


        System.out.println("");
        System.out.println("RESUMEN DE FICHA PERSONAL");
        System.out.println("-------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);


    }
}
