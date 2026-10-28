import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1Cloude {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Introduce la contraseña: ");
            password=sc.nextLine();
        } while (!password.equals("java123"));

        System.out.println("Acceso concedido");
    }
}
