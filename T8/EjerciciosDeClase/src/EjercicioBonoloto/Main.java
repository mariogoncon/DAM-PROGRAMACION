package EjercicioBonoloto;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        int[]cartonSistema = new int[5];
        for (int i=0; i<cartonSistema.length; i++){
            int aleatorio=0;
            do {

                aleatorio = (int)(Math.random()*10)+1;
            } while (estaNumero(aleatorio,cartonSistema));
            cartonSistema[i]=aleatorio;
        }

        try (Scanner lector =  new Scanner(System.in)){
            System.out.println("Introduce 5 dígitos");
            int cartonUsuario [] = new int[5];


            //RESTRICCIONES: NO SE PUEDEN REPETIR NÚMEROS; NÚMEROS ENTRE 1 Y 10


            for (int i = 0; i < cartonUsuario.length ; i++) {
                int numeroUsuario;
                do {
                    System.out.print("Dígito "+(i+1)+": ");
                    numeroUsuario = lector.nextInt();
                } while (estaNumero(numeroUsuario, cartonUsuario) || numeroUsuario<1 || numeroUsuario > 10);
                cartonUsuario[i] = numeroUsuario;
            }

            System.out.println();
            System.out.println("El cartón premiado es: "+Arrays.toString(cartonSistema));
            System.out.println("Su cartón jugado es: "+Arrays.toString(cartonUsuario));

            int acierto=0;

            for (int i = 0; i <cartonUsuario.length; i++) {
                if (cartonUsuario[i]==cartonSistema[i]){
                    acierto++;
                }
            }

            System.out.println();
            System.out.println("Total aciertos: "+acierto);


        } catch (Exception e){
            System.out.println("ERROR EN EL PROGRAMA");
        }
    }

    public static boolean estaNumero(int numero, int[]carton) {
        for (int item : carton) {
            if (numero == item) {
                return true;
            }
        }
        return false;
    }

}
