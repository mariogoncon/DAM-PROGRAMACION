import java.util.Arrays;

public class Operaciones {

    private int [] numeros;

    /*---------------------------------------------------------------------------------------
        CONSTRUCTORES
     ---------------------------------------------------------------------------------------*/

    public Operaciones(){}

    public Operaciones(int lon){
        numeros = new int [lon];
    }

    /*---------------------------------------------------------------------------------------
        FUNCIONES
     ---------------------------------------------------------------------------------------*/
    public void rellenar(){
        for (int i = 0; i < numeros.length ; i++) {
            int aleatorio;
            do {
                aleatorio = (int) (Math.random() *10);
            } while (buscar(aleatorio));
            numeros[i] = aleatorio;
        }
    }


    public void mostrar(){
        System.out.println(Arrays.toString(numeros));
        System.out.println();
    }


    public boolean buscar(int numero){
        for(int item : numeros){
            if (item == numero) {
                return true;
            }
        }
        return false;
    }

    public void modificar(int numeroBuscar, int modificar){
        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] == numeroBuscar) {
                numeros[i] = modificar;
            }
        }
    }

    public void ordenar(){
        //INVESTIGAR LOS DIFERENTES METODOS DE ORDENACION
        Arrays.sort(numeros);
    }

    /*---------------------------------------------------------------------------------------
        Getter and setters
     ---------------------------------------------------------------------------------------*/
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }


}
