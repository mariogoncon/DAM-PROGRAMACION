import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Ejercicio 1: Operadores ariméticos básicos");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner (System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = input.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = input.nextInt();

        System.out.println("Suma: "+(num1+num2));
        System.out.println("Resta: "+(num1-num2));
        System.out.println("Multiplicación: "+(num1*num2));
        System.out.println("División: "+(num1/num2));
        System.out.println("Módulo: "+(num1%num2));
    }
}
