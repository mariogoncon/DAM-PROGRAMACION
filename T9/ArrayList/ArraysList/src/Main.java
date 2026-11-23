import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //CREAR LA LISTA
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        //AÑADIR A LA LISTA
        nombres.add("Juan");
        nombres.add("Mario");
        nombres.add("Pedro");
        nombres.add("Rodrigo");
        nombres.add("Alberto");
        nombres.add("Jose Antonio");
        numeros.add(1);
        numeros.add(25);
        numeros.add(2);
        numeros.add(14);
        numeros.add(5);
        numeros.add(7);

        //MOSTRAR LISTA
        System.out.println(numeros);

        //OTRO MÉTOD0
        System.out.println();
        for (Integer item : numeros){
            System.out.println(item);
        }


        //TAMAÑO DE LA LISTA
        System.out.println();
        System.out.println(numeros.size());

        //BORRAR ELEMENTOS DE LA LISTA
        System.out.println();
        numeros.remove(1); //ELIMINAMOS POR POSICION
        System.out.println(numeros);
        nombres.remove("Pedro");
        numeros.remove(Integer.valueOf(5)); //ELIMINAMOS POR NOMBRE o ELEMENTO
        System.out.println(nombres);


        //PEDIR EL PRIMERO DE LA LISTA
        System.out.println();
        System.out.println(numeros.getFirst());

        //SACAR ELEMETNO MEDIANTE POSICIÓN
        System.out.println();
        System.out.println(numeros.get(1));


        //PEDIR EL ULTIMO DE LA LISTA
        System.out.println();
        System.out.println(numeros.getLast());

        //CAMBIAR ELEMENTO DE LA LISTA
        System.out.println();
        nombres.set(2, "Fernando");
        numeros.set(2, 88);
        System.out.println(numeros);

        //VACIAR LA LISTA
        System.out.println();
        numeros.clear();
        System.out.println(numeros);
    }
}
