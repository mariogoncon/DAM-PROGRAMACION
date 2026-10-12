import model.Personaje1;

public class Ejercicio1 {

    /*
    Crea una clase Persona con los atributos nombre (String) y edad (int). Define un constructor que reciba ambos datos.
    Desde main, crea un objeto con el nombre Ana y la edad 20, y muestra sus atributos.
     */

    public static void main(String[] args) {

        System.out.println("Hemos creado un personaje");
        System.out.println("=========================");
        System.out.println("");

        Personaje1 personaje1 = new Personaje1("Ana", 20);
        Personaje1 personaje2= new Personaje1("Mario", 28);

        System.out.println("Resultado: ");
        System.out.println("Nombre: "+personaje1.nombre);
        System.out.println("Edad: "+personaje1.edad);




    }
}
