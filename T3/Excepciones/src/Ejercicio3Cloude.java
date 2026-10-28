import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3Cloude {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=-1;

        do {
            try {
                System.out.println("Selecciona una opción: ");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Salir");
                opcion = sc.nextInt();


                switch (opcion){
                    case 1:
                        System.out.print("Primer número: ");
                        int a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        int b =sc.nextInt();
                        System.out.println("Resultado: "+(a+b));
                        break;

                    case 2:
                        System.out.print("Primer número: ");
                        int c = sc.nextInt();
                        System.out.print("Segundo número: ");
                        int d =sc.nextInt();
                        System.out.println("Resultado: "+(c+d));
                        break;

                    case 3:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Debe introducir un digito");
                sc.nextLine();
            }
        } while (opcion != 0);
    }
}
