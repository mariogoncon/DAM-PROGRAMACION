import java.util.Scanner;

public class Ejercicio3 {

            /*
        Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
            a) Suma
            b) Resta
            c) Multiplicación
            d) División entera
            e) Resto
            f) División real
            g) Resto real
            (Operaciones)

            ENTRADA/SALIDA
            ENTERO: 24
            ENTERO: 7
         */

    public static void main(String[] args){

        System.out.println("");
        System.out.println("EJERCICIO 3: Operaciones variables");
        System.out.println("==================================");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer entero: ");
        int primeraVariable = input.nextInt();
        System.out.print("Introduce el segundo entero: ");
        int segundaVariable = input.nextInt();
        input.close();

        int suma = primeraVariable + segundaVariable;
        int resta = primeraVariable - segundaVariable;
        int multiplicacion = primeraVariable * segundaVariable;
        int divisionEntera = primeraVariable / segundaVariable;
        int resto = primeraVariable % segundaVariable;
        double divisionReal = (double)primeraVariable/segundaVariable; // *
        double restoReal = primeraVariable%segundaVariable;

        System.out.println("");
        System.out.println("ENTERO 1: "+primeraVariable);
        System.out.println("ENTERO 2: "+segundaVariable);
        System.out.println("");
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División entera: "+divisionEntera);
        System.out.println("Resto: "+resto);
        System.out.println("División real: "+divisionReal);
        System.out.println("Resto real: "+restoReal);

        /*
        SE AÑADE (double) PORQUE LA VARIABLE ES DOUBLE, Y EL ORGIEN DE primeraVariable y segundaVariable es INT
         */

    }
}
