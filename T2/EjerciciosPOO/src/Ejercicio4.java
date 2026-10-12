import model.Producto;

public class Ejercicio4 {

    /*
    Crea una clase Producto con los atributos nombre (String) y precio (double). Define dos constructores:

    - Uno que reciba solo el nombre y asigne un precio de 0.0.
    - Otro que reciba el nombre y el precio.

    Desde main, crea un producto con cada constructor y muestra sus datos.

     */

    public static void main(String[] args) {

        Producto producto1 = new Producto("Cuaderno");
        System.out.println("Producto 1: "+producto1.nombre+" - "+producto1.precio+"€");

        Producto producto2 = new Producto("Mochila", 25.5);
        System.out.println("Producto 1: "+producto2.nombre+" - "+producto2.precio+"€");

    }
}
