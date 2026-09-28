import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Ejercicio 6: Calculadora de descuento");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = input.nextDouble();

        System.out.print("Introduce el porcentaje de descuento: ");
        double descuento = input.nextDouble();

        double descuentoTotal = (precio*descuento)/100;

        System.out.println("Precio original: "+precio+"€");
        System.out.println("Porcentaje de descuento ("+descuento+"%):" +descuentoTotal+"€");
        System.out.println("Precio final: "+(precio-descuentoTotal)+"€");
    }
}
