import java.util.Scanner;

public class TryCatch {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exceptions");
        System.out.println("Procedemos a ejectuar errores");
        int resultado=1000000;
        String nombre = null;
        try{
            int op1=12;
            int op2=0;
            System.out.println("El resultado es "+resultado);
            if (nombre.equals("Juan"));{
                System.out.println("El nombre es "+nombre);
            }
        } catch (ArithmeticException e) {
            System.out.println("El op2 ha provocado fallo");
            resultado = 0;
        } finally {
            //cerrar streams
            System.out.println("El resultado es "+resultado);
        }

        System.out.println("Ejecutando final del programa");
    }
}
