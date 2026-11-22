package model;

import java.util.Random;

public class Cuadrado {

    /*------------------------------------------------------
        ATRIBUTOS
     ------------------------------------------------------*/
    private int [][] matriz;




    /*------------------------------------------------------
        CONSTRUCTORES
     ------------------------------------------------------*/
    public Cuadrado() {
        this.matriz = new int [4][4];
    }



    /*------------------------------------------------------
        MÉTODOS
     ------------------------------------------------------*/

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }


    public void generarCuadrado() {
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt((2)+1);
            }
        }
    }

    public void mostrarCuadrado() {
        for (int[]row:getMatriz()){
            for (int item:row){
                System.out.print(item+" | ");
            }
            System.out.println();
        }
    }

    public int sumarFila(int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public int sumarColumna(int columna) {
        int suma=0;
        for (int i = 0; i<matriz[columna].length;i++){
            suma+=matriz[i][columna];
        }
        return suma;
    }

    public int sumarDiagonalPrincipal() {
        int suma=0;
        for (int i = 0; i<matriz.length;i++){
            suma+=matriz[i][i];
        }
        return suma;
    }

    public int sumarDiagonalSecundaria() {
        int suma=0;
        for (int i = 0; i<matriz.length;i++){
            suma+=matriz[i][matriz.length - i - 1];
        }
        return suma;
    }

    public boolean esMagico(){
        int sumaReferencia = sumarFila(0);

        for (int i = 0; i<matriz.length;i++){
            if (sumarFila(i)!=sumaReferencia){
                return false;
            }
            if (sumarColumna(i)!=sumaReferencia){
                return false;
            }
        }
        if (sumarDiagonalPrincipal()!=sumaReferencia){
            return false;
        }
        if (sumarDiagonalSecundaria()!=sumaReferencia){
            return false;
        }
            return true;
        }

    }






