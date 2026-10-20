import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio2 {

    /*
        Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos. En la salida
        se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se
        introdujeron los números 2, 8 y 6).
     */

    static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce el primer número entero positivo: ");
        int num1=lector.nextInt();
        System.out.print("Introduce el segundo número entero positivo: ");
        int num2=lector.nextInt();
        System.out.print("Introduce el tercer número entero positivo: ");
        int num3=lector.nextInt();
        lector.close();

        if (num1==num2+num3) {
            System.out.println("La suma de "+num2+"+"+num3+" es = "+num1);
        } else if (num2==num1+num3) {
            System.out.println("La suma de "+num1+"+"+num3+" es = "+num2);
        } else if (num3==num1+num2) {
            System.out.println("La suma de "+num1+"+"+num2+" es = "+num3);
        } else {
            System.out.println("Ninguno es la suma de los otros dos");
        }

    }
}
