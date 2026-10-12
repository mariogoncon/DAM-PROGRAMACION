import model.Estudiante;

public class Ejercicio6 {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Jesús", "1º DAM");
        System.out.println("Estudiante 1: "+estudiante1.nombre+" - "+estudiante1.curso+" - Matriculado: "+estudiante1.matriculado);
        Estudiante estudiante2 = new Estudiante("Mario", "1º DAM", true);
        System.out.println("Estudiante 2: "+estudiante2.nombre+" - "+estudiante2.curso+" - Matricualdo: "+estudiante2.matriculado);
    }
}
