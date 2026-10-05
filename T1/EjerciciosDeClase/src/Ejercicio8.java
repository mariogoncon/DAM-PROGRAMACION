import java.util.Scanner;

/*
    Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
    centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos
    decimales). (Temperaturas)
 */

public class Ejercicio8 {

    public static void main (String[] args) {

        System.out.println("");
        System.out.println("EJERCICIO 8: Conversión temperaturas");
        System.out.println("==================================");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el número de grados Centígrados: ");
        double gradosCentigrados = input.nextDouble();

        double gradosFarenheit = ((gradosCentigrados * 9) / 5)+32;
        double gradosKelvin = gradosCentigrados+273.15;

        System.out.printf("Grados Centígrados: %.2fº\n", gradosCentigrados);
        System.out.printf("Grados Farenheit: %.2fºF\n", gradosFarenheit);
        System.out.printf("Grados Kelvin: %.2fºK\n", gradosKelvin);
        System.out.println("");

        System.out.print("Introduce el número de grados Farenheit: ");
        gradosFarenheit = input.nextDouble();

        gradosCentigrados = (5*(gradosFarenheit -32))/9;
        gradosKelvin = gradosCentigrados + 273.15;

        System.out.printf("Grados Farenheit: %.2fºF\n", gradosFarenheit);
        System.out.printf("Grados Centígrados: %.2fº\n", gradosCentigrados);
        System.out.printf("Grados Kelvin: %.2fºK\n", gradosKelvin);
        System.out.println("");

        System.out.print("Introduce el número de grados Kelvin: ");
        gradosKelvin = input.nextDouble();

        input.close();

        gradosCentigrados = gradosKelvin - 273.15;
        gradosFarenheit = ((9*gradosCentigrados)/5) +32;

        System.out.printf("Grados Kelvin: %.2fºK\n", gradosKelvin);
        System.out.printf("Grados Farenheit: %.2fºF\n", gradosFarenheit);
        System.out.printf("Grados Centígrados: %.2fº\n", gradosCentigrados);


    }
}
