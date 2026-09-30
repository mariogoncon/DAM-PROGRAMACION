import java.util.Scanner;

public class Ejercicio6 {

    /*
    Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni
    inferior a 0€) y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?
    ¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)

        *ENTRADA/SALIDA*
        Valor de la compra (entre 0.00 y 500.00):**298,45**
        IVA (entre 0 y 25%):**12**
        Compra: 266.47
        IVA: 31.98
        ======
        298.45
     */

    public static void main(String[] args){

        System.out.println("");
        System.out.println("EJERCICIO 6: Cálculo precio - IVA");
        System.out.println("==================================");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el valor de la compra (entre 0.00 y 500.00): ");
        double compraTotal = input.nextDouble();
        System.out.print("Introduce el valor del IVA (entre 0 y 25): ");
        double ivaTotal = input.nextDouble();
        input.close();

        double valorIva = (compraTotal*ivaTotal)/100.00;
        double valorCompra = compraTotal - valorIva;
        System.out.printf("Compra: %.2f €\n", valorCompra);
        System.out.printf("IVA: %.2f €\n", valorIva);
        System.out.println("========");
        System.out.println("Total: "+compraTotal+"€");


    }
}
