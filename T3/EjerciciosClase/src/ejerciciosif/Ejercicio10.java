package ejerciciosif;

import java.util.Scanner;

public class Ejercicio10 {

    /*
        Se lee un número entero. Dicho número se incrementará en una unidad si es par, y se decrementará en una unidad
        si es impar. Se muestra por consola el nuevo valor del número.
     */

    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("");
        System.out.print("Introduce un dígito: ");
        int numero = lector.nextInt();
        lector.close();

        if (numero %2==0) {
            System.out.println("El número introducido ("+numero+") es par, por lo que se incrementará en 1");
            System.out.println(numero+" --> "+(numero+1));
        } else {
            System.out.println("El número introducido ("+numero+") es impar, por lo que se decrementará en 1");
            System.out.println(numero+" --> "+(numero-1));
        }
    }
}
