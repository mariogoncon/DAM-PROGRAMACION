import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/*
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20).
    Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre
    0.00 € y 5.00 €). También se podrá introducir el número de alumnos que realizaron la compra (valor entre 0 y 10).
    Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos) y la cantidad que debe pagar
    cada alumno redondeada a 2 decimales. (CosteBar)
 */

public class Ejercicio9 {

    public static void main (String[] args) {

        System.out.println("");
        System.out.println("EJERCICIO 9: Carta");
        System.out.println("==================================");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el número de bocadillos: ");
        int nBocadillos = input.nextInt();
        System.out.print("Introduce el número de bebidas: ");
        int nBebidas = input.nextInt();
        System.out.print("Introduce el precio del bocadillo: ");
        double pBocadillos = input.nextDouble();
        System.out.print("Introduce el precio de la bebida: ");
        double pBebidas = input.nextDouble();
        System.out.print("Introduce el número de alumnos: ");
        int nAlumnos = input.nextInt();
        input.close();

        double tBebidas = nBebidas * pBebidas;
        double tBocadillos = nBocadillos * nBebidas;
        double cuentaTotal = tBebidas+tBocadillos;

        System.out.println("");
        System.out.println("ARTICULO          CANTIDAD        PRECIO                   COSTE");
        System.out.println("===========   ===============   =============          ===============");
        System.out.println("Bebida                 "+nBebidas+"     ---------     "+pBebidas+"               "+tBebidas);
        System.out.println("Bebida                 "+nBocadillos+"  ---------      "+pBocadillos+"            "+tBocadillos);
        System.out.println("                                                               ==================");
        System.out.println("TOTAL                                                               "+cuentaTotal);
        System.out.println("---------------------------------------------------------------------------------");



    }
}
