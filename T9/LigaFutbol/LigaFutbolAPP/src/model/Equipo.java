package model;

import java.util.ArrayList;


public class Equipo {

    //----------------ATRIBUTOS-----------------

    private String nombre;
    private int presupuesto, media, puntos, balancePresupuesto;
    private ArrayList<Jugador> plantilla = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getBalancePresupuesto() {
        return balancePresupuesto;
    }

    public void setBalancePresupuesto(int balancePresupuesto) {
        this.balancePresupuesto = balancePresupuesto;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }


    //----------------CONSTRUCTORES-----------------

    public Equipo() {
    }

    public Equipo(String nombre, int presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;

        this.media =0;
        for (Jugador item : plantilla) {
            media+=item.getHabilidad();
        }
        this.puntos = 0;
        this.balancePresupuesto = 0;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.presupuesto = (int) (Math.random() * 250001) + 150000;
        this.media = 0;
        this.puntos = 0;
        this.balancePresupuesto = 0;
    }
    //----------------MÉTODOS-----------------

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Presupuesto: " + this.presupuesto+"€");
        System.out.println("Media: " + this.media);
        System.out.println("Puntos: " + this.puntos);
        System.out.println("Gasto en fichajes:  " + this.balancePresupuesto+"€");
        System.out.println();
    }

    public void mostrarPlantilla() {
        System.out.println("PLANTILLA OFICIAL DEL "+this.nombre);
        System.out.println("----------------------------------");
        for (Jugador item : plantilla) {
            System.out.println(item.getNombre());
        }
    }

    public void ficharJugador(Jugador jugador) {
        plantilla.add(jugador);
        calcularMedia();
        presupuesto = presupuesto- jugador.getPrecio();
        balancePresupuesto+=jugador.getPrecio();
        System.out.println("El jugador " + jugador.getNombre()+" ha sido fichado por el "+this.nombre);
        System.out.println("|------------> La operación se ha cerrado en: "+jugador.getPrecio()+"€");
    }

    public void venderJugador(Jugador jugador) {
        plantilla.remove(jugador);
        calcularMedia();
        presupuesto = presupuesto+ jugador.getPrecio();
        balancePresupuesto-=jugador.getPrecio();
        System.out.println("El jugador " + jugador.getNombre()+" ha sido vendido por el "+this.nombre);
        System.out.println("|------------> La operación de venta se ha cerrado en: "+jugador.getPrecio()+"€");
    }

    public void calcularMedia() {
        int suma=0;
        for (Jugador item : plantilla) {
            suma+=item.getHabilidad();
        }
        if (!plantilla.isEmpty()) {
            this.media = suma/plantilla.size();
        } else  {
            this.media = 0;
        }
    }
}
