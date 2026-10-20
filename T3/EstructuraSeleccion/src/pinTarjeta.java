import java.util.Scanner;

public class pinTarjeta {

    static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el pin de la tarjeta: ");
        int pin = lector.nextInt();

        if (pin>9999 | pin < 0){
            System.out.println("Número invalido");
        } else {
            System.out.println("Número válido");
        }

        System.out.println("Terminando la operativa del banco");
    }
}


// EJERCICIO CON IF
