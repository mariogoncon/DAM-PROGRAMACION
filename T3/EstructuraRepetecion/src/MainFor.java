public class MainFor {

        public static void main (String[] args) {


                //rango positivo, de abajo a arriba

                for(int i=0; i<5; i++){
                        if (i %2==0){
                                System.out.println("Proceso de ejecución par "+(i+2));
                        } else {
                                System.out.println("Proceso impar");
                        }
                }

                System.out.println("----------");

                //rango negativo, de arriba a abajo

                for(int i=10; i>0;i--){
                        if (i %2==0){
                                System.out.println("Proceso de ejecución par "+(i+2));
                        } else {
                                System.out.println("Proceso impar");
                        }
                }



        }
}
