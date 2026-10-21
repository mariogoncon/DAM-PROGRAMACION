package ejerciciosif;

import java.util.Scanner;

public class Ejercicio7 {

    /*
    Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número.
    Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar si es o no un número Armstrong.
    Se comprobará previamente que el número introducido tiene 3 dígitos.
    En la salida se mostrará uno de los siguientes mensajes:

        1. “El número no tiene 3 dígitos”
        2. “Es un número Armstrong”
        3. “No es un número Armstrong”.
     */

    static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        System.out.println("¡Vamos a comprobar si el número que propones es un número Armstrong!");
        System.out.println("");
        System.out.print("Introduce el número: ");
        int numero = lector.nextInt();
        lector.close();

        int numeroPrimerdig = (numero / 100);
        int num1Cubo = numeroPrimerdig*numeroPrimerdig*numeroPrimerdig;
        int numeroSegundodig = (numero / 10)%10;
        int num2Cubo = numeroSegundodig*numeroSegundodig*numeroSegundodig;
        /*
        Alternativa para elevar a un número: Math.pow(numeroPrimerdig,3)
        la primera variable (numeroPrimerdig) es un int, y Math.pow devuelve un double, por lo que hay que castear
        la operacion entera a (int)
         */
        int numeroTercerdig = numero % 10;
        int num3Cubo = numeroTercerdig*numeroTercerdig*numeroTercerdig;

        int sumaTotal = num1Cubo+num2Cubo+num3Cubo;

        if (numero<100 || numero > 999) {
            System.out.println("El número no tiene 3 dígitos...");
        } else if (numero == sumaTotal) {
            System.out.println("¡El número "+numero+" es un número Armstrong!");
        } else {
            System.out.println("¡El número "+numero+" no es un número Armstrong!");
        }

    }
}
