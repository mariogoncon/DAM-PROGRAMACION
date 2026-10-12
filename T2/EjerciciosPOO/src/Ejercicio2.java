import model.Mascota;

public class Ejercicio2 {

    /*
    Crea una clase Mascota con los atributos nombre (String), especie (String) y edad (int). Define un constructor que
    reciba los tres datos. Desde main, crea dos objetos distintos y muestra sus datos para comprobar que cada mascota tiene sus propios valores.
     */

    static void main(String[] args) {
        Mascota mascota1 = new Mascota("Luna", "Gato", 3);
        Mascota mascota2 = new Mascota("Toby", "Perro", 5);

        System.out.println("Resultado");
        System.out.println("=========");
        System.out.println("Mascota 1: "+mascota1.nombre+ " - "+mascota1.especie+" - "+mascota1.edad+" años.");
        System.out.println("Mascota 2: "+mascota2.nombre+ " - "+mascota2.especie+" - "+mascota2.edad+" años.");

    }
}
