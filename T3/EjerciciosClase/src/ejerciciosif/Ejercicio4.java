package ejerciciosif;

import java.util.Scanner;

public class Ejercicio4 {

    /*
       Hágase un programa que compruebe si un año pedido por teclado es bisiesto. En la salida se mostrará o
       “Es bisiesto” o “No es bisiesto”,) El algoritmo para obtener si un año es bisiesto es el siguiente:
       un año es bisiesto si es múltiplo de 4
     */

    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un año para comprobar si es bisiesto: ");
        int año = lector.nextInt();
        lector.close();

        if (año%4==0) {
            System.out.println("El año "+año+" es bisiesto");
        } else {
            System.out.println("El año "+año+" no es bisiesto");
        }

    }
}
