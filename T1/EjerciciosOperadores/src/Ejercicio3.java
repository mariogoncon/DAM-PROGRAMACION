public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Ejercicio 3: Operadores de asignación compuesta");
        System.out.println("-------------------------------------------------");

        int valorInicial = 100;

        System.out.println("Valor inicial: "+valorInicial);
        System.out.println("Después de sumar 50: "+(valorInicial+=50));
        System.out.println("Después de restar 30: "+(valorInicial-=30));
        System.out.println("Después de multiplicar por 2: "+(valorInicial*=2));
        System.out.println("Después de dividir entre 4: "+(valorInicial/=4));
    }
}
