import java.util.Scanner;

public class Ejercicio9 {

    /*
       Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida

        “Son consecutivos” o “No son consecutivos”.
     */

    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Deberás introducir 3 números y analizaremos si son consecutivos!");
        System.out.println("");
        System.out.print("Introduce el primer dígito: ");
        int num1 = lector.nextInt();
        System.out.print("Introduce el segundo dígito: ");
        int num2 = lector.nextInt();
        System.out.print("Introduce el tercero dígito: ");
        int num3 = lector.nextInt();
        lector.close();

        if (num2 == num1 + 1 && num3 == num2 +1) {
            System.out.println("¡Los números "+num1+" "+num2+" y "+num3+" son consecutivos!");
        } else {
            System.out.println("Los números "+num1+" "+num2+" y "+num3+" no son consecutivos...");
        }
    }
}
