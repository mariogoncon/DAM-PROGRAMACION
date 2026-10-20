import java.util.Scanner;

public class notaEvaluar {

    static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Indica la calificación: ");

        char calificacion =lector.next().toUpperCase().charAt(0);
        String mensaje;

        switch (calificacion) {
            case 'A' -> {
                mensaje = "Excelente";
            }
            case 'B' -> {
                mensaje = "Muy bien";
            }
            case 'C' -> {
                mensaje ="Bien";
            }
            case 'D' -> {
                mensaje="Suficiente";
            }
            case 'F' -> {
                mensaje="Suspenso";
            }
            default -> {
                mensaje="Sin calificar";
            }

        }

        System.out.println("");
        System.out.println("La calificación final es: "+mensaje);

    }
}
