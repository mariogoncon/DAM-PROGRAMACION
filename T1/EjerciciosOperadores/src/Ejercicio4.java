import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Ejercicio 4: Número par o impar");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número: ");

        int num = input.nextInt();

        String condicion;

        if (num % 2 == 0)
            condicion = "PAR";
        else
            condicion = "IMPAR";

        System.out.println("El número "+num+" es "+condicion);
    }
}
