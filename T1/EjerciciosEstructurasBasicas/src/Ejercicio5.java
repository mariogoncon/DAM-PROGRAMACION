public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Ejercicio 5: Declaración y uso de constantes");
        System.out.println("--------------------------------------------");

        final String NOMBREAPLICACION = "MiApp";
        double pi = 3.14159;
        final Double PICOMPLEJO = 3.14159;

        /*
        Las variables de nombreAplicacion y pi son constantes, por eso se añade la palabra reservada "final" y  se escriben en MAY.
        Para pi que es una variable primitiva, hay que hacer un wrapper de double ---> Double.
         */

        String version = "1.0.0";
        String usuario = "Laura";
        int nivel = 1;
        int puntuacion = 0;

        /*
        Estas son variables con información que puede cambiar.
         */

        System.out.println("Aplicación: "+NOMBREAPLICACION);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+PICOMPLEJO);
        System.out.println("Usuario actual: "+usuario);
        System.out.println("Nivel: "+nivel);
        System.out.println("Puntuación: "+puntuacion);

        /*
        Primero se printan las variables originales, y después se actualizan para que al volver al printar, tengan
        su nuevo valor asignado.
         */

        usuario = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.println("Usuario actualizado: "+usuario);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuación actualizada: "+puntuacion);

    }
}
