import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args){

        System.out.println("");
        System.out.println("Ejercicio 10: Calculadora de salario con condiciones");
        System.out.println("-------------------------------------------------");

        Scanner input = new Scanner(System.in);

        double horasPermitidas = 40;


        System.out.print("Introduce el salario por hora: ");
        double salario = input.nextDouble();
        System.out.print("Introduce las horas trabajadas: ");
        double horasTrabajadas = input.nextDouble();
        System.out.print("¿Has hecho horas extras?: ");
        boolean horasExtra = input.nextBoolean();

        boolean masDe40 = horasTrabajadas > horasPermitidas;
        boolean aplicaExtra = masDe40 && horasExtra;

        double horasNormales = Math.min(horasTrabajadas, horasPermitidas);
        double horasExtraTrabajadas;

        if (aplicaExtra) {
            horasExtraTrabajadas = horasTrabajadas - horasPermitidas;
        } else {
            horasExtraTrabajadas = 0;
        }

        double salarioNormal = salario * horasNormales;
        double salarioExtra = salario *2* horasExtraTrabajadas;
        double salarioTotal = salarioNormal + salarioExtra;

        System.out.println("Horas normales (máximo 40): "+horasNormales);
        System.out.println("Horas extra: "+horasExtraTrabajadas);
        System.out.println("¿Trabajaste más de 40 horas?: "+masDe40);
        System.out.println("¿Tienes derecho a horas extra?: "+ horasExtra);
        System.out.println("¿Se aplican horas extra?: "+aplicaExtra);
        System.out.println("Salario por horas normales: "+salarioNormal+"€");
        System.out.println("Salario por horas extras: "+salarioExtra+"€");
        System.out.println("Salario total: "+salarioTotal+"€");
    }
}
