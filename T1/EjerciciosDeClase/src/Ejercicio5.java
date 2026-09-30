import java.util.Scanner;

public class Ejercicio5 {

    /*
    Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

        *ENTRADA/SALIDA*

        Número de segundos: **24973**

        Horas: 6

        Minutos: 56

        Segundos: 13
     */

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("EJERCICIO 5: Conversión tiempo");
        System.out.println("==================================");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el número de segundos: ");
        int segundosSistema = input.nextInt();
        input.close();

        int horas =segundosSistema/3600;
        System.out.println("Horas: "+horas);
        int minutos = (segundosSistema%3600) /60;
        System.out.println("Minutos: "+minutos);
        int segundos = (segundosSistema%3600)%60;
        System.out.println("Segundos: "+segundos);
    }
}
