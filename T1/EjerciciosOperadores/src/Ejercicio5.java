import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){

        System.out.println("");
        System.out.println("Ejercicio 5: Operadores lógicos AND y OR");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner(System.in);



        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt();

        System.out.print("¿Tienes carnet de conducir? (true/false): ");
        boolean carnet = input.nextBoolean();

        boolean condicion1 = edad >= 21;
        System.out.println("Mayor de 21 años: "+condicion1);

        System.out.println("Carnet de conducir: "+carnet);


        boolean puedeAlquilar = condicion1 && carnet;
        System.out.println("¿Puedes alquilar un coche?: "+ puedeAlquilar);

    }
}
