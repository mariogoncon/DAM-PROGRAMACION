import model.Cuadrado;

public class Ejercicio7 {

    /*
    Crea una clase Rectangulo con los atributos base (double) y altura (double). Define dos constructores:

    - Uno que reciba base y altura.
    - Otro que reciba una única medida y la asigne tanto a base como a altura, para representar un cuadrado.

    Desde main, crea un rectángulo de base 5.0 y altura 3.0, y un cuadrado de lado 4.0. Muestra sus dimensiones y calcula
    sus áreas directamente en main, sin añadir métodos a Rectangulo.
     */

    public static void main(String[] args) {

        Cuadrado rectangulo = new Cuadrado(5.0, 3.0);
        Cuadrado cuadrado = new Cuadrado(4.0, 4.0);

        System.out.println("Rectángulo: base "+rectangulo.base+" - altura "+rectangulo.altura);
        System.out.println("Área del rectángulo: "+rectangulo.base*rectangulo.altura);
        System.out.println("Cuadrado: base "+cuadrado.base+" - altura "+cuadrado.altura);
        System.out.println("Área del cuadrado: "+cuadrado.base*cuadrado.altura);
    }
}
