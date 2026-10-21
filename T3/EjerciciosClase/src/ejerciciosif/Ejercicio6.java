package ejerciciosif;

import java.util.Scanner;

/*
    Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición del rango,
    se obtendrá la suma de sus inversos (1/número ). En el caso de no estar alguno de los numeros
    en el rango se mostrará el mensaje “Alguno de los números no está entre -100 y 100”.
    No se sumará el inverso de aquellos valores que sean 0
 */

public class Ejercicio6 {

    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1=lector.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = lector.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = lector.nextInt();
        lector.close();


        if (num1 < -100 || num1 > 100 || num2 <-100 || num2 > 100 || num3 < -100 || num3 > 100) {
            System.out.println("Alguno de los números no está entre -100 y 100..");
        } else {

            double totalInver = 0;

            if (num1 !=0) {
                totalInver += 1.0 / num1;
            }

            if (num2 !=0) {
                totalInver +=1.0/num2;
            }

            if (num3 !=0) {
                totalInver +=1.0/num3;
            }

            System.out.printf(
                    "La suma de los inversos es %.5f%n", totalInver
            );

        }

    }
}
