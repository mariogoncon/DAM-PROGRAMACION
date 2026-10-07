import model.Jugador;

public class EntradaPOO {
    public static void main(String[] args){
        System.out.println("Iniciamos el juego de los objetos");
        System.out.println("=================================");
        System.out.println("");

        String nombre = new String("Mario");
        int edad = 28;

        Jugador jugador1 = new Jugador("Juan", 7, 90, false);
        //correo = null , nombre = null , numeroVidas = 0, habilidad = 0 , estrellas = false --> ESTOS SON VALORES POR DEFECTO

        System.out.println("Nombre: "+jugador1.nombre);
        System.out.println("Vidas: "+jugador1.vidas);
        System.out.println("Habilidad: "+jugador1.habilidad);
        System.out.println("Jugador estrella: "+jugador1.estrella);

        System.out.println("");
        System.out.println("");


        Jugador jugador2 = new Jugador("Mario", 10, 100, true);
        //correo = null , nombre = null , numeroVidas = 0, habilidad = 0 , estrellas = false --> ESTOS SON VALORES POR DEFECTO

        System.out.println("Nombre: "+jugador2.nombre);
        System.out.println("Vidas: "+jugador2.vidas);
        System.out.println("Habilidad: "+jugador2.habilidad);
        System.out.println("Jugador estrella: "+jugador2.estrella);

        System.out.println("");
        System.out.println("");

        Jugador jugador3 = new Jugador("Zeus", 1000, 5000, true);
        System.out.println("Nombre: "+jugador3.nombre);
        System.out.println("Vidas: "+jugador3.vidas);
        System.out.println("Habilidad: "+jugador3.habilidad);
        System.out.println("Jugador estrella: "+jugador3.estrella);

        System.out.println("");
        System.out.println("");

        Jugador jugador4 = new Jugador("Kratos", 999, 5200, true);
        System.out.println("Nombre: "+jugador4.nombre);
        System.out.println("Vidas: "+jugador4.vidas);
        System.out.println("Habilidad: "+jugador4.habilidad);
        System.out.println("Jugador estrella: "+jugador4.estrella);

        System.out.println("");
        System.out.println("");

        Jugador jugadorBOT = new Jugador();
        System.out.println("Nombre: "+jugadorBOT.nombre);
        System.out.println("Habilidad: "+jugadorBOT.habilidad);

        Jugador jugadorBOT1 = new Jugador();
        System.out.println("Nombre: "+jugadorBOT.nombre);
        System.out.println("Habilidad: "+jugadorBOT.habilidad);

        jugadorBOT1.Saludar();
    }
}
