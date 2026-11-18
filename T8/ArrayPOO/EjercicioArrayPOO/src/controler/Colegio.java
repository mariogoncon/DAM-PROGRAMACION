package controler;
import model.Alumno;
import util.NotaException;

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

    public boolean inscribirAlumno(Alumno alumno){
        //Puedo inscribir a un alumno si hay hueco (existe un null)
        //Si en ningua posicion hay nulo, no hay hueco

        for(int i=0;i<alumnos.length;i++){
            if (alumnos[i]==null){
                alumnos[i]=alumno;
                return false;
            }
        }
        System.out.println("No hay plazas para inscribir alumnos nuevos");
        return false;
    }


    public void expulsarAlumno(Alumno alumno){
        for (int i= 0;i<alumnos.length;i++){
            if (alumnos[i]==alumno){
                alumnos[i]=null;
                System.out.println("El alumno "+alumno.getNombre()+" con DNI: "+alumno.getDni()+" se ha expulsado correctamente");
                return;
            }
        }
        System.out.println("El alumno no está inscrito");
    }


    public void ordenarPorNota(){
        for (int i = 0; i < alumnos.length ; i++) {
            for (int j = i+1; j < alumnos.length; j++) {
                if (alumnos[i] != null && alumnos[j]!= null) {
                    if (alumnos[i].getNota()<alumnos[j].getNota()){
                        Alumno aux = alumnos[i];
                        alumnos[i]=alumnos[j];
                        alumnos[j]=aux;
                    }
                }
            }
        }
    }

    public void calificarAlumno(Alumno alumno, double calificacion) throws NotaException {
        for (int i= 0;i<alumnos.length;i++){
            if (alumnos[i]==alumno){
                alumno.setNota(calificacion);
                return;
            }
        }
    }

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
                System.out.println(item.getNombre());
                return true;
            }
        }
        return false;
    }
}
