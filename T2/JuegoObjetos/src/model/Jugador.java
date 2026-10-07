package model;

//importaciones

//molde de un jugador

public class Jugador {

    //atributos -> variables que cualifican al jugador

    public String nombre, correo;
    public int vidas, habilidad;
    public boolean estrella;

    // constructores -> hace realidad el objeto, 1 a n. Si no escribo nada, tengo 1 por defecto.
        // Si escribes un constructor, el vacio queda enmascarado.
        // Siempre se crea un constructor vacío, aunque no se use.

    //Este constructor tiene unos valores por defecto, que se asignarán si creamos un jugador sin añadir parámetros.

    public Jugador(){
        this.nombre="Bot";
        this.vidas=5;
        this.habilidad=(int)(Math.random()*101);
        this.estrella=false;
    }

    public Jugador(String nombre, int vidas, int habilidad, boolean estrella) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.habilidad = habilidad;
        this.estrella = estrella;

        // si tenemos el mismo nombre en el atributo de la clase y el parametro, añadiendo (this.) dejamos claro a que se refiere.
    }

    //métodos -> funcionalidades que puede hacer un jugador

    public void Saludar(){
        System.out.println("Hola me llamo "+nombre+" y tengo "+vidas+" vidas...");

    }

}
