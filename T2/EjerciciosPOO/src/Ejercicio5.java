import model.Coche;

public class Ejercicio5 {

    /*
    Crea una clase Coche con los atributos marca (String), modelo (String) y anio (int). Define tres constructores:

        - Uno sin parámetros, que asigne "Sin marca", "Sin modelo" y 2000.
        - Otro que reciba marca y modelo, y asigne 2026 como año.
        - Otro que reciba los tres datos.

        Desde main, crea un coche con cada constructor y muestra sus atributos.

     */

    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println("Coche 1: "+coche.marca+" - "+coche.modelo+" - "+coche.anio);

        Coche coche1 = new Coche("Toyota", "Corolla");
        System.out.println("Coche 2: "+coche1.marca+" - "+coche1.modelo+" - "+coche1.anio);

        Coche coche2 = new Coche("Seat", "Ibiza", 2020);
        System.out.println("Coche 3: "+coche2.marca+" - "+coche2.modelo+" - "+coche2.anio);
    }
}
