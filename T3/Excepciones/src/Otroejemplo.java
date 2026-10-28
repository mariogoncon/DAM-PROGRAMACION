import java.util.InputMismatchException;
import java.util.Scanner;

public class Otroejemplo {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int numero = 0;

        do {
            try {
                System.out.print("Introduce un número: ");
                numero=sc.nextInt();
                valido=true;
            } catch (InputMismatchException e){
                System.out.println("Error! No has introducido un número...");
                sc.nextLine();
            }
        } while (!valido);
        System.out.println("El número que has introducido es "+numero);
    }
}
