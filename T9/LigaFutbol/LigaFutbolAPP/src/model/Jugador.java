package model;

import util.Posicion;

public class Jugador {

//----------------ATRIBUTOS-----------------

    private String nombre;
    private int id, habilidad, precio;
    private boolean estrella;
    private Posicion posicion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Posicion getPosicion() {
        return posicion;
    }
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

//----------------CONSTRUCTORES-----------------

    public Jugador(){}


    public Jugador(int id, String nombre, int habilidad, Posicion posicion, int precio) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.posicion = posicion;
        this.estrella = this.habilidad>87;
        this.precio = precio;
        this.id = id;
    }

    public Jugador(int id, String nombre, Posicion posicion, int precio){
        this.nombre = nombre;
        this.id = id;
        this.posicion = posicion;
        this.precio = precio;
        this.habilidad=(int)(Math.random()*26)+60;
        this.estrella = this.habilidad>87;
    }

//----------------MÉTODOS-----------------

    public void mostrarDatos(){
        System.out.println("ID: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Skill: "+this.habilidad);
        System.out.println("Precio: "+this.precio+"€");
        System.out.println("Estrella: "+this.estrella);
        System.out.println();

    }
}
