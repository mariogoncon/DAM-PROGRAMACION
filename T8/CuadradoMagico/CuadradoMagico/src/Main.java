import model.Cuadrado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();

        System.out.println("Bienvenido al juego del cuadrado mágico");
        System.out.println("---------------------------------------");

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("   Menú   ");
            System.out.println("   ====   ");
            int opcion;
            int intentos=0;

            do {
                System.out.println("1. Generar cuadrado");
                System.out.println("2. Rendirse");
                System.out.println();
                System.out.println("Intentos: "+intentos);
                System.out.print("Selecciona una opcion: ");
                opcion = sc.nextInt();
                System.out.println();

                switch (opcion) {
                    case 1 -> {
                        cuadrado.generarCuadrado();
                        cuadrado.mostrarCuadrado();
                        intentos++;

                        if (cuadrado.esMagico()){
                            System.out.println();
                            System.out.println("¡¡El cuadrado generado es mágico!!");
                            break;
                        } else {
                            System.out.println();
                            System.out.println("El cuadrado generado no es mágico...");
                            System.out.println("¡¡Inténtalo de nuevo!!");
                            System.out.println();
                        }

                    }
                    case 2 -> {
                        System.out.println();
                        System.out.println("Saliendo....");
                        System.out.println();
                        System.out.println("G A L L I N A ! !");
                        System.out.println();
                        System.out.println("Intentos: "+intentos);
                    }
                    default -> {
                        System.out.println();
                        System.out.println("Opcion incorrecta");
                        System.out.println();
                    }
                }
            } while (opcion !=2);


        } catch (Exception e){
            System.out.println("Error en la ejecución del programa");
        }

    }
}
