import java.util.Scanner;

public class Ejercicio3 {

    /*
       Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20, y también se comprobará si
       está o no entre -100 y 100. En la salida se mostrará uno de los siguientes menasajes:

        1. “Es múltiplo de 20 y está entre -100 y 100”.
        2. “Es múltiplo de 20 y no está entre -100 y 100”.
        3. “No es múltiplo de 20 y está entre -100 y 100”-
        4. “No es múltiplo de 20 y no está entre -100 y 100”.

     */

    static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

        System.out.print("Introduce un número entero: ");
        int numero = lector.nextInt();
        lector.close();

        if (numero%20==0 && numero >= -100 && numero <= 100){
            System.out.println("Es múltiplo de 20 y está entre -100 y 100");
        } else if (numero%20==0 && numero < -100 || numero > 100) {
            System.out.println("Es múltiplo de 20 y no está entre -100 y 100");

        } else if (numero%20!=0 && numero >= -100 && numero <= 100) {
            System.out.println("No es múltiplo de 20 y está entre -100 y 100");

        } else {
            System.out.println("No es múltiplo de 20 y no está entre -100 y 100");
        }

    }
}
