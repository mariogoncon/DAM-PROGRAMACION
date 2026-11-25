package util;

public enum Posicion {

    POR("Portero", "Portería"),
    DEF("Defensa", "Defensor"),
    MEDIO("Mediocentro", "Medio"),
    DEL("Delantero", "Del");

    private String nombre;
    private String incidencia;

    private Posicion(String nombre, String incidencia) {
        this.nombre = nombre;
        this.incidencia = incidencia;
    }

}
