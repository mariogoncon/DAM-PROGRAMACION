import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    static void main(String[] args) {

        /*
        conjunto de datos
        String[] clase = new String[5];
        [ null; null; null; null; null]
         */

        /*
        int[] edades = new int[7];
        [ 0; 0; 0; 0; 0; 0; 0]
         */

        /*
        boolean[] aciertos = new boolean[4];
        [ false; false; false; false]
         */

        String[] nombres = new String[3];

        //PARA GUARDAR VALORES EN LA LISTA NOMBRES:

        nombres[0] = "Mario";
        nombres[1] = "Dayana";

        String[] apellidos=new String[]{"González", "Contreras", "Álvarez"};
        System.out.println("El apellido bueno es: "+apellidos[0]); //González
        System.out.println(apellidos.length); //3
        System.out.println(apellidos[apellidos.length-1]); //Álvarez

        //PARA SACAR TODOS LOS NOMBRES DE LA LISTA:

        for (int i = 0; i < apellidos.length; i++){
            System.out.println(apellidos[i]);
        }

        System.out.println("");
        System.out.println("Otro método para sacar los datos de la lista:");
        System.out.println("");

        //EL FOR EACH:

        for (String element : apellidos){
            System.out.println(element);

        }

        System.out.println(nombres[0]);
    }
}