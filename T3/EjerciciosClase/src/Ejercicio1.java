import java.util.Scanner;

public class Ejercicio1 {

    /*
    Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo. En la salida se
    mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.
     */

    static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = lector.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = lector.nextInt();
        lector.close();

        if (num1 > num2) {
            System.out.println("El primero número ("+num1+") es mayor que el segundo ("+num2+")");
        } else {
            System.out.println("El primero número ("+num1+") no es mayor que el segundo ("+num2+")");
        }

    }
}
