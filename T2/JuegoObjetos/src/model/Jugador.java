package model;

//importaciones

//molde de un jugador

public class Jugador {

    //atributos -> variables que cualifican al jugador

    public String nombre, correo;
    public int numeroVidas, habilidad;
    public boolean estrellas;

    // constructores -> hace realidad el objeto, 1 a n. Si no escribo nada, tengo 1 por defecto.

    public Jugador(String nombreParametro, int vidasParametro, int habilidadParametro, boolean estrellasParametro) {
        nombre = nombreParametro;
        numeroVidas = vidasParametro;
        habilidad = habilidadParametro;
        estrellas = estrellasParametro;
    }

    //métodos -> funcionalidades que puede hacer un jugador

}
