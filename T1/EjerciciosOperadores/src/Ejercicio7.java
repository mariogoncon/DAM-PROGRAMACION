import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        System.out.println("");
        System.out.println("Ejercicio 7: Operador NOT y condiciones compuestas");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt();
        System.out.print("¿Eres estudiante (true/false): ");
        boolean estudiante = input.nextBoolean();
        boolean comparacion1 = edad <=26;
        System.out.println("¿Eres menor de 26 años?: "+comparacion1);
        System.out.println("¿Tienes descuento joven? (menor de 26 años): "+comparacion1);

        System.out.println("¿Tienes descuento estudiante?: "+estudiante);
        boolean descuentoEspecial = comparacion1 && estudiante;
        System.out.println("¿Tienes descuento especial?: "+descuentoEspecial);

    }
}
