import java.util.Scanner;

public class Ejercicio4 {

        /*
    Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta
    cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas
    y de los bocadillos. (Bar)

        ENTRADA/SALIDA
        Número de bebidas: 3
        Número de bocadillos: 5
        Coste de las bebidas: 3.75
        Coste de los bocadillos: 10.25
        Coste consumición: 14.0
     */

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("EJERCICIO 4: Carta amigos");
        System.out.println("==================================");
        System.out.println("");
        final double PRECIO_BEBIDA = 1.25;
        final double PRECIO_BOCATA = 2.05;
        Scanner input = new Scanner(System.in);
        System.out.print("¿Cuántas bebidas desea?: ");
        int nBebidas = input.nextInt();
        System.out.print("¿Cuántos bocadillos desea?: ");
        int nBocadillos = input.nextInt();
        input.close();
        double totalBebidas = (double)nBebidas*PRECIO_BEBIDA;
        double totalBocadillos = (double)nBocadillos*PRECIO_BOCATA;

        System.out.println("Número de bebidas: "+nBebidas);
        System.out.println("Número de bocadillos: "+nBocadillos);
        System.out.println("Coste de la bebida total (1,25€/unidad): "+ totalBebidas+"€");
        System.out.println("Coste del bocadillo total (2,05€/unidad): "+totalBocadillos+"€");
        System.out.println("Coste total del pedido: "+(totalBebidas+totalBocadillos+"€"));
    }

}
