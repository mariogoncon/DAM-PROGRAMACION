package Ejercicio10;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)){
            System.out.print("¿Cuántos estudiantes hay en clase?: ");
            int nEstudiantes = lector.nextInt();

            int[] calificaciones = new int[nEstudiantes];

            int posicion = 0;

            for (int i=0;i<calificaciones.length;i++){
                System.out.print("Introduce la calificación del estudiante "+(i+1)+": ");
                calificaciones[i]=lector.nextInt();
            }

            System.out.println("");
            System.out.println("--- REPORTE DE CALIFICACIONES ---");
            /*
            PARA MOSTRAR LAS CALIFICACIONES HAY DIFERENTES MANERAS: FOR EACH, FOR, Arrays.toString()
             */
            /* FOR EACH
            for (int item:calificaciones){
                System.out.print(item + " ");
            }*/
            /* FOR
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println(calificaciones[i]);
            }*/
            System.out.println("Calificaciones: "+Arrays.toString(calificaciones));


            int totalCalificaciones=0, nAprobados=0, nAlta=calificaciones[0], nBaja=calificaciones[0];

            for (int item:calificaciones){
                totalCalificaciones+=item;

                if (item >=5){
                    nAprobados++;
                }
                /*IF TERNARIO:
                nAprobados = item >= 5 ? nAprobados+1 : nAprobados;
                 */

                if (item>nAlta){
                    nAlta=item;
                }

                if (item<nBaja){
                    nBaja=item;
                }
            }
            System.out.println("El promedio de las calificaciones es de: "+(double)totalCalificaciones/nEstudiantes);
            System.out.println("Estudiantes aprobados: "+nAprobados);
            System.out.println("Nota más alta: "+nAlta);
            System.out.println("Nota más baja: "+nBaja);






        } catch (Exception e){
            System.out.println("ERROR EN EL PROGRAMA");
        }


    }

}