public class Main {
    public static void main(String[] args) {

        int [] datos = new int[5]; // 0 0 0 0 0
        datos = new int []{1, 2, 3, 4, 5}; // 1 2 3 4 5

        int[][] matriz = new int[4][4]; // row  col
        /*
        0 0 0 0
        0 0 0 0
        0 0 0 0
        0 0 0 0
         */

        matriz = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        System.out.println("El elemento central es "+matriz[1][1]); //5
        System.out.println("El primer elemento es "+matriz[0][0]); //1
        System.out.println("El ultimo elemento es "+matriz[2][2]); //9

        //PARA MODIFICAR ELEMENTOS:

        matriz[0][0] = 5;
        System.out.println("El nuevo elemento que sutituye al 1 es: "+matriz[0][0]);


        //PARA IMPRIMIR LA MATRIZ CON FOR:


        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        //PARA IMPRIMIR LA MATRIZ CON FOR EACH:

        for(int[] row : matriz) {
            for(int item : row) {
                System.out.print(item+" ");
            }
            System.out.println();

        }
    }
}