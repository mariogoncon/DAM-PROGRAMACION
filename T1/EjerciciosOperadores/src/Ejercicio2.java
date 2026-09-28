import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String[] args) {

        System.out.println("");
        System.out.println("Ejercicio 2: Comparación de números");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner((System.in));

        System.out.print("Introduce el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = input.nextInt();

        boolean comp1 = num1 > num2;
        boolean comp2 = num1 < num2;
        boolean comp3 = num1 == num2;
        boolean comp4 = num1 >= num2;
        boolean comp5 = num1 <= num2;

        System.out.println("¿"+num1+" es mayor que "+num2+"?: "+comp1);
        System.out.println("¿"+num1+" es menor que "+num2+"?: "+comp2);
        System.out.println("¿"+num1+" es igual a "+num2+"?: "+comp3);
        System.out.println("¿"+num1+" es mayor o igual a "+num2+"?: "+comp4);
        System.out.println("¿"+num1+" es menor o igual a "+num2+"?: "+comp5);
    }
}
