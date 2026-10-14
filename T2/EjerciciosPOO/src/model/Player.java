package model;

public class Player {
    public String nombre, categoria, poder;
    public int nivel, salud, resistencia;

    public Player(){
        this.nombre="Bot";
        this.categoria="Esclavo";
        this.poder="Lucha";
        this.nivel=50;
        this.salud=20;
        this.resistencia=30;


    }

    public Player(String nombre, String categoria, String poder, int nivel, int salud, int resistencia) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.poder = poder;
        this.nivel = nivel;
        this.salud = salud;
        this.resistencia = resistencia;

    }
}
