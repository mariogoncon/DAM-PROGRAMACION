import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args){

        System.out.println("");
        System.out.println("Ejercicio 8: Operaciones combinadas");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = input.nextInt();

        int suma = num1+num2+num3;
        double promedio = suma/3;
        double operacion = (num1*num2)/num3;

        System.out.println("Suma de los tres números: "+suma);
        System.out.println("Promedio: "+promedio);
        System.out.println("Resultado de ("+num1+"*"+num2+")/"+num3+"= "+operacion);
    }
}
