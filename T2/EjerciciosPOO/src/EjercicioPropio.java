import model.Player;

public class EjercicioPropio {

    public static void main(String[] args) {

        Player bot = new Player();

        System.out.println(bot.nombre);
        System.out.println(bot.nivel);

        System.out.println("");

        Player dayana = new Player("Dayana", "Maga", "Fuego", 100, 75, 100);
        System.out.println(dayana.nombre);
        System.out.println(dayana.categoria);
        System.out.println(dayana.poder);
        System.out.println(dayana.nivel);
        System.out.println(dayana.salud);
        System.out.println(dayana.resistencia);

        System.out.println("");

        Player mario = new Player("Mario", "Elfo", "Agua", 110, 70, 100);
        System.out.println(mario.nombre);
        System.out.println(mario.categoria);
        System.out.println(mario.poder);
        System.out.println(mario.nivel);
        System.out.println(mario.salud);
        System.out.println(mario.resistencia);


    }


}
