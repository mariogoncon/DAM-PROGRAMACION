package controler;
import model.Alumno;

public class Colegio {
    /*
        ATRIBUTOS
     ---------------------------------------------*/
    private String nombre;
    public Alumno [] alumnos;
        /*


        CONSTRUCTORES
     ---------------------------------------------*/
    public Colegio(){}

    public Colegio(String nombre){
        this.nombre = nombre;
        this.alumnos=new Alumno[5]; // [null, null, null, null, null,]
    }

    public Colegio(String nombre, int capacidad){
        this.nombre = nombre;
        this.alumnos=new Alumno[capacidad]; //el ARRAY medirá lo que diga capacidad, capacidad tendrá el valor que se nos indique.
    }

        /*
        MÉTODOS
     ---------------------------------------------*/

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("Las plazas del colegio son "+alumnos.length);
    }

    public void inscribirAlumno(Alumno alumno){
        //Puedo inscribir a un alumno si hay hueco (existe un null)
        //Si en ningua posicion hay nulo, no hay hueco

        for(int i=0;i<alumnos.length;i++){
            if (alumnos[i]==null){
                alumnos[i]=alumno;
                return;
            }
        }
        System.out.println("No hay plazas para inscribir alumnos nuevos");
    }


    public void expulsarAlumno(Alumno alumno){}
    public void ordenarPorNota(Alumno alumno){}
    public void calificarAlumno(Alumno alumno){}

    public void listarAlumno(){
        for(Alumno item : alumnos ){
            if (item != null){
                item.mostrarDatos();
                System.out.println("");
            }
        }
    }
    public boolean buscarAlumno(Alumno alumno) {
        for (Alumno item : alumnos) {
            if (item == alumno) {
                return true;
            }
        }
        return false;
    }
}
