import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){

        System.out.println("");
        System.out.println("Ejercicio 7: Presentación personal");
        System.out.println("----------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Introduce tus apellidos: ");
        String apellidos = input.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt();

        System.out.println("¡Hola! Me llamo "+nombre+" "+apellidos+".");
        System.out.println("Tengo "+edad+" años y vivo en Madrid");


    }
}
