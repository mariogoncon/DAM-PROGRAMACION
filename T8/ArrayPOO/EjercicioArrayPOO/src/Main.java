import controler.Colegio;
import model.Alumno;

public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Mario", "51178401C");
        Alumno alumno2 = new Alumno("Dayana", "5148872P");
        Alumno alumno3 = new Alumno("Sergio", "9562400Y");


        Colegio colegio1 = new Colegio("JOSÉ JALÓN", 10);
        Colegio colegio2 = new Colegio("ANGEL YSERN");

        colegio1.inscribirAlumno(alumno1);
        colegio1.inscribirAlumno(alumno2);
        colegio1.inscribirAlumno(alumno3);









    }
}
