import model.Libro;

public class Ejercicio3 {

    /*
        Crea una clase Libro con los atributos titulo (String), autor (String) y paginas (int). Define dos constructores:

        - Uno sin parámetros, que asigne "Sin título", "Autor desconocido" y 0 páginas.
        - Otro que reciba los tres datos.

        Desde main, crea un libro con cada constructor y muestra sus atributos.
     */

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        System.out.println("Libro 1: "+libro1.titulo+" - "+libro1.autor+" - "+libro1.paginas+" páginas.");

        Libro libro2 = new Libro("La conquista del Estado", "Ramiro Ledesma Ramos", 120);
        System.out.println("Libro 2: "+libro2.titulo+" - "+libro2.autor+" - "+libro2.paginas+" páginas.");

    }
}
