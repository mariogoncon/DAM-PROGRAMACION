import model.Equipo;
import model.Jugador;
import util.Posicion;

public class Main {

    public static void main(String[] args) {

        Jugador kmappe = new Jugador(1, "Kylian Mbappé", 95 ,Posicion.DEL, 90000000);
        Jugador fkonate = new Jugador(2, "Konaté",Posicion.DEF, 15000000);
        Jugador aguler = new Jugador(3, "Arda Güler",87,Posicion.MEDIO,65000000);

        Equipo rmadrid = new Equipo("Real Madrid CF", 900000000);
        Equipo psg = new Equipo("Paris Saint Germain", 850000000);
        Equipo bdortmund = new Equipo("Borussia Dortmund");


        rmadrid.ficharJugador(kmappe);

    }
}
