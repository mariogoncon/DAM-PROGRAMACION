import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2Cloude {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un dígito: ");
            int num1 = sc.nextInt();
            System.out.print("Introduce otro dígito: ");
            int num2 = sc.nextInt();
            System.out.println("El resultado de dividirlos es: "+(num1/num2));

        } catch (InputMismatchException e) {
            System.out.println("Error! Debes introducir un dígito...");
        } catch (ArithmeticException e) {
            System.out.println("Error! No es puede dividir entre 0!");

        }

    }
}
