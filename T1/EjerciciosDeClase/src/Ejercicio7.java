import java.util.Scanner;

/*
Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100. Obténgase la longitud de la
circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia) NOTA El valor de PI se obtiene con Math.PI
    *ENTRADA/SALIDA*
    Escribe un radio entero: **15**
    Longitud de la circunferencia: 94.24777960769379
    Area de circulo: 706.8583470577034
 */

public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("EJERCICIO 7: Circunferencia valores");
        System.out.println("==================================");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el valor del radio: ");
        int radio = input.nextInt();
        input.close();

        final double PI = Math.PI;
        double longitud = (double)2*PI*radio;
        double area = PI*(radio*radio);

        System.out.println("Longitud de la circunferencia: "+longitud);
        System.out.println("Área de círculo: "+area);

    }
}
