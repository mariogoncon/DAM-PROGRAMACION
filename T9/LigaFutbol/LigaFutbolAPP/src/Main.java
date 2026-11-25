import model.Equipo;
import model.Jugador;
import util.Posicion;

public class Main {

    public static void main(String[] args) {

        Jugador kmappe = new Jugador(1, "Kylian Mbappé", 95 ,Posicion.DEL, 90000000);
        Jugador fkonate = new Jugador(2, "Konaté",Posicion.DEF, 15000000);
        Jugador aguler = new Jugador(3, "Arda Güler",87,Posicion.MEDIO,65000000);
        Jugador jbellingham = new Jugador(4, "Jude Bellingham",93,Posicion.MEDIO,87000000);
        Jugador mcucurella = new Jugador(5, "Marc Cucurella",85,Posicion.MEDIO,35000000);
        Jugador tcourtois = new Jugador(6, "Thibaut Courtois",91 ,Posicion.POR,55000000);
        Jugador vjunior = new Jugador(7, "Vinicius Junior",86,Posicion.DEL,45000000);

        Equipo rmadrid = new Equipo("Real Madrid CF", 900000000);
        Equipo psg = new Equipo("Paris Saint Germain", 850000000);
        Equipo bdortmund = new Equipo("Borussia Dortmund");

        System.out.println("INICIA LA TEMPORADA DEL REAL MADRID");
        System.out.println("-----------------------------------");
        rmadrid.mostrarDatos();
        System.out.println();
        System.out.println("Ventana de fichajes");
        System.out.println("-------------------");
        rmadrid.ficharJugador(kmappe);
        rmadrid.ficharJugador(vjunior);
        rmadrid.ficharJugador(fkonate);
        rmadrid.ficharJugador(aguler);
        rmadrid.ficharJugador(jbellingham);
        rmadrid.ficharJugador(mcucurella);
        rmadrid.ficharJugador(tcourtois);
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Ventas del equipo");
        System.out.println("--------------------------");
        rmadrid.venderJugador(vjunior);
        System.out.println();
        psg.ficharJugador(vjunior);
        System.out.println();
        rmadrid.mostrarDatos();
        rmadrid.mostrarPlantilla();
        System.out.println();



    }
}
