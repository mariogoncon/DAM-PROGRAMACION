import java.util.Scanner;

public class Tablamultiplicar {

    static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un número: ");

        int numero = lector.nextInt();

        System.out.println("");
        System.out.println("Tabla de multiplicar del "+numero);
        System.out.println("================================");
        for (int i =0; i<11; i++) {
            System.out.println("La multiplicación del "+numero+" * "+i+" = "+(numero*i));
        }

    }
}
