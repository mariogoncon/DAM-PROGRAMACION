package model;

import util.NotaException;

public class Alumno {


    /*
    ATRIBUTOS
 -------------------------------------------------------------*/
    private  String nombre, dni;
    private double nota;


    /*
        CONSTRUCTORES
     -------------------------------------------------------------*/
    public Alumno(){}

    public Alumno(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.nota = -1; //-1 indica que no existe calificación para el alumno.
    }


    /*
        MÉTODOS
     -------------------------------------------------------------*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) throws NotaException {
        if (nota < 0 || nota > 10) {
            throw new NotaException("¡CUIDADO! Nota no válida");
        }
        this.nota = nota;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.dni);
        //CON IF TERNARIO:
        System.out.println(nota < 0 ? "Sin calificar" : "Nota: "+nota);
         /* ES IGUAL QUE:
        if (nota < 0){
            System.out.println("Sin calificar");
        } else {
            System.out.println("Nota: " + this.nota);
        }
          */

        }
    }

