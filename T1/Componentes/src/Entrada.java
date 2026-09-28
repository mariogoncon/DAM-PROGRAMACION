
    public static void main(String [] args) {

        String nombre="Mario";
        String apellido="González";

        int DNI= 51178401;
        Integer DNIComplejo = 511784;

        char letra ='C';
        Character letraComplejo = 'C';

        double altura=1.74;
        Double alturaComplejo=1.74;

        int edad = 28;
        Integer edadComplejo = 28;

        // variables:
        // segun el dato que guarda: String, char, byte/shot/init/large, double/float, boolean
        // segun la forma de construirse: primitivos (solo guarda el valor) y complejos (valor y funcionalidad)
        // segun la mutabilidad del dato: mutables (guardan un dato que no es fijo) y no mutables
        // segun el scope de la variable: metodo (bloque) y clase


        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+DNI+" con letra "+letra);
        System.out.println("Altura: "+altura+" metros");
        System.out.println("Edad "+edad+" años");


        //operadores:
        /*
        aritmeticos: operaciones matematicas (depende del tipo de datos)
            unarias ++ --
            binarias + - * / %
         */

        // casteo: cambiar un tipo de dato de forma natural

        int num1 = 5;
        double num2 = 10.5;
        int num3=9;

        int resultado1 = num1 * num3;
        double resultado3 = (double) num1 * num3;

        double resultado = num1*num2;

        System.out.println(resultado1);
        System.out.println(resultado3);

        num1 =10;
        num3= 5;

        System.out.println("La division de "+num1+ " y "+num3+ " es: "+(num1/num3));
        System.out.println("El resto es: "+(num1%num3));





        // parseo: cambiar un tipo de dato de manera NO natural --> de str (numero) a int
        //

        String str1 = "5";
        String str2 = "25";

        System.out.println(("La suma de los numeros str es: " + (Integer.parseInt(str1) + Integer.parseInt(str2))));

        // asignacion u operacion

        int operando1 = 20;
        int operando2 = 10;


        //De esta manera se asigna y guarda valor en la variable.
        operando1 += 14;
        System.out.println(operando1);

        //De esta manera se asigna y guarda valor en la variable.
        operando1 -=10;
        System.out.println(operando1);

        operando1 *=100;
        System.out.println(operando1);

        // relacionales (siempre se obtiene un boolean: true o false) Por ejemplo las comparaciones, se compara si es algo es diferente.

        operando1 = 10;
        operando2 = 30;

        boolean comparacion = operando1 != operando2; // false
        System.out.println(comparacion);


        // logicos --> SIEMPRE SE OBTIENE UN BOOLEAN
            // AND && - SE TIENEN QUE CUMPLIR TODAS LAS CONDICIONES
            // OR || - CON QUE SE CUMPLA UNA CONDICION ES TRUE

        boolean comparacion2 = operando1 < operando2 && operando2 == 20; // false
        boolean comparacion3 = operando1 < operando2 && operando2 == 30; // true
        boolean comparacion4 = operando1 < operando2 || operando2 == 30; // true
        boolean comparacion5 = operando1 < operando2 || operando2 == 20; // true


        System.out.println(comparacion2);
        System.out.println(comparacion3);
        System.out.println(comparacion4);
        System.out.println(comparacion5);


    }

