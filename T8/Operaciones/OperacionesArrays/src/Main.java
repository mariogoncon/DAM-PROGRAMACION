import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // numeros:

        //MENU
        //1 rellenar
        //2 rotar
        //3 ordenar
        //4 invertir
        //5 mostrar

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce la cantidad del array: ");
            Operaciones operaciones = new Operaciones(sc.nextInt());
            System.out.println();

            int opcion = 0;
            do {
                System.out.println("1. Rellenar datos");
                System.out.println("2. Mostrar datos");
                System.out.println("3. Buscar datos");
                System.out.println("4. Modificar datos");
                System.out.println("5. Rotar datos");
                System.out.println("6. Invertir datos");
                System.out.println("7. Ordenar datos");
                System.out.println("8. Salir");
                System.out.println();
                System.out.print("Selecciona una opcion: ");

                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> operaciones.rellenar();
                    case 2 -> operaciones.mostrar();
                    case 3 -> {
                        System.out.print("Indica un número a buscar: ");
                        int numeroBuscar = sc.nextInt();
                        System.out.println("La búsqueda tiene como resultado: "+operaciones.buscar(numeroBuscar));
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.print("Indica el número que quieres modificar: ");
                        int numeroBuscar = sc.nextInt();

                        if (operaciones.buscar(numeroBuscar)) {
                            int numeroCambiar;
                            do {
                                System.out.print("Indica el nuevo valor numérico: ");
                                numeroCambiar = sc.nextInt();
                            } while (operaciones.buscar(numeroCambiar));

                            operaciones.modificar(numeroBuscar, numeroCambiar);

                        } else {
                            System.out.println("El número no se encuentra en el array...");

                        }
                    }
                    case 5 -> {}
                    case 6 -> {}
                    case 7 -> operaciones.ordenar();
                    case 8 -> System.out.println("Saliendo...");
                }

            } while (opcion != 8);

            sc.close();

        } catch (Exception e){
            System.out.println("Error en las IO");
        }


    }

}
