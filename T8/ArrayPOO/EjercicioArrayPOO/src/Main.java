import controler.Colegio;
import model.Alumno;
import util.NotaException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NotaException {


        Colegio colegio1 = new Colegio("JOSÉ JALÓN", 6);



        //try {
            Scanner option = new Scanner(System.in);

            System.out.println("Menú interactivo");
            System.out.println("----------------");
            int opcion;
            do {
                System.out.println("1. Agregar alumno");
                System.out.println("2. Expulsar alumno");
                System.out.println("3. Calificar alumno");
                System.out.println("4. Ordenar alumno por nota");
                System.out.println("5. Mostrar alumnos");
                System.out.println("6. Buscar alumno");
                System.out.println("7. Salir");
                System.out.println();
                System.out.print("Elige una opción: ");
                opcion = option.nextInt();
                System.out.println();
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Indica el nombre del alumno: ");
                        String nombreAlumno = option.next();
                        System.out.print("Indica el DNI del alumno: ");
                        String DNIAlumno = option.next();
                        Alumno alumno = new Alumno(nombreAlumno, DNIAlumno);
                        if (colegio1.inscribirAlumno(alumno)) {
                            System.out.println("¡Alumno agregado correctamente!");
                            System.out.println();
                        } else {
                            System.out.println("¡ERROR! Alumno no agregado correctamente");
                            System.out.println();
                        }
                    }
                    case 2 -> {
                        System.out.print("Introduce el DNI del alumno que desea eliminar: ");
                        String DNIAlumno = option.next();
                        if (colegio1.expulsarAlumno(DNIAlumno)){
                            System.out.println("Alumno expulsado correctamente!");
                            System.out.println();
                        } else {
                        System.out.println("No se ha podido expulsar al alumno");
                        System.out.println();
                        }
                    }
                    case 3 -> {
                        System.out.print("Selecciona el DNI del alumno que desea calificar: ");
                        String DNIAlumno = option.next();
                        boolean fallo = false;
                        do {
                            System.out.print("Indica la calificación para el alumno: ");
                            double nota = option.nextDouble();
                            try {
                                if (colegio1.calificarAlumno(DNIAlumno, nota)) {
                                    System.out.println("Alumno calificado correctamente!");
                                    System.out.println();
                                    fallo = false;
                                } else {
                                    System.out.println("Alumno no encontrado");
                                    System.out.println();
                                }
                            } catch (NotaException e) {
                                System.out.println(e.getMessage());
                                fallo = true;
                            }
                        } while (fallo);
                    }
                    case 4 -> colegio1.ordenarPorNota();
                    case 5 -> {
                        colegio1.mostrarDatos();
                        colegio1.listarAlumno();
                    }
                    case 6 -> {
                        System.out.print("Indica el DNI del alumno: ");
                        String DNIAlumno = option.next();
                        Alumno encontrado = colegio1.buscarAlumno(DNIAlumno);
                        if (encontrado != null) {
                            System.out.println();
                            encontrado.mostrarDatos();
                            System.out.println();
                        } else  {
                            System.out.println();
                            System.out.println("El alumno no se encuentra registrado");
                            System.out.println();
                        }
                    }
                }
            } while (opcion != 7);
        }
    }
