package EjercicioBonoloto;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        int[]cartonSistema = new int[5];
        for (int i=0; i<cartonSistema.length; i++){
            int aleatorio=0;
            do {

                aleatorio = (int)(Math.random()*11);
            } while (estaNumero(aleatorio,cartonSistema));
            cartonSistema[i]=aleatorio;
        }

        try (Scanner lector =  new Scanner(System.in)){
            System.out.println("Introduce 5 dígitos");
            int cartonUsuario [] = new int[5];

            for (int i = 0; i < cartonUsuario.length ; i++) {
                System.out.print("Dígito "+(i+1)+": ");
                cartonUsuario[i]= lector.nextInt();
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
            return false;
        }
        return false;
    }

}
