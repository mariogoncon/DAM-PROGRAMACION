import java.util.Scanner;

public class Ejercicio5 {

    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un número de 4 dígitos entre 1000 y 9999 para comprobar si es capicua: ");
        int numero = lector.nextInt();
        int nPrimera = numero / 1000;
        int nSegunda = (numero / 100) % 10;
        int nTercera = (numero / 10) % 10;
        int nCuarta = numero % 10;

        if (numero <= 999 || numero > 9999) {
            System.out.println("El número no tiene 4 dígitos...");
        } else if (nPrimera == nCuarta && nSegunda == nTercera) {
            System.out.println("El número "+numero+" es capicúa :) !");
        } else {
            System.out.println("El número "+numero+" no es capicúa :,(");
        }
    }
}
