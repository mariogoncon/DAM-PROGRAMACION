import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Ejercicio 9: Sistema de calificaciones");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = input.nextDouble();
        System.out.print("Introduce la nota del segundo examen: ");
        double nota2 = input.nextDouble();
        System.out.print("Introduce la nota del tercer examen: ");
        double nota3 = input.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        boolean aprobado = media >= 5;
        boolean notable = media >=7;
        boolean sobresaliente = media >=9;

        System.out.println("Nota media: "+media);
        System.out.println("¿Has aprobado?: "+aprobado);
        System.out.println("¿Tiene notable?: "+notable);
        System.out.println("¿Tiene sobresaliente?: "+sobresaliente);
    }
}
