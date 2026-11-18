import controler.Colegio;
import model.Alumno;
import util.NotaException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NotaException {


        Colegio colegio1 = new Colegio("JOSÉ JALÓN", 7);

        try {
            Scanner option = new Scanner(System.in);

            System.out.println("Menú interactivo");
            System.out.println("----------------");
            int opcion;
            do {
                System.out.println("1. Agregar alumno");
                System.out.println("2. Eliminar alumno");
                System.out.println("3. Calificar alumno");
                System.out.println("4. Ordenar alumno por nota");
                System.out.println("5. Mostrar alumnos");
                System.out.println("6. Buscar alumno");
                System.out.println("7. Salir");
                opcion = option.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Indica el nombre del alumno: ");
                        String nombreAlumno = option.next();
                        System.out.print("Indica el DNI del alumno: ");
                        String DNIAlumno = option.next();
                        Alumno alumno = new Alumno(nombreAlumno, DNIAlumno);
                        if (colegio1.inscribirAlumno(alumno)) {
                            System.out.println("Alumno agregado correctamente");
                        } else {
                            System.out.println("Alumno no agregado correctamente");
                        }
                    }
                    case 2 -> {
                        System.out.print("Indica el nombre del alumno que quieres eliminar: ");
                        String nombreAlumno = option.next();
                        if (colegio1.expulsarAlumno(nombreAlumno)) {
                        System.out.println("Alumno eliminado correctamente");
                        } else  {
                            System.out.println("Alumno no eliminado correctamente");
                        }
                    }
                    }
                }
            } while (opcion != 7);
        }