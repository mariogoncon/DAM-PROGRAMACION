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
        System.out.println();
    }

    public boolean inscribirAlumno(Alumno alumno){
        //Puedo inscribir a un alumno si hay hueco (existe un null)
        //Si en ningua posicion hay nulo, no hay hueco
        //Si el DNI  ya está inscrito, ERROR

        for(int i=0;i<alumnos.length;i++){
            if (alumnos[i]==null){
                if (buscarAlumno(alumno.getDni())==null){
                    alumnos[i]=alumno;
                    return true;
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public boolean expulsarAlumno(String DNI){
        Alumno expulsar = buscarAlumno(DNI);
        if (expulsar!=null){
            for (int i = 0; i < alumnos.length ; i++) {
                if (alumnos[i].getDni().equalsIgnoreCase(DNI)) {
                    alumnos[i] = null;
                    return true;
                }
            }
        }
        System.out.println("DNI no encontrado");
        return false;
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

    public boolean calificarAlumno(String DNI, double nota) throws NotaException {
        Alumno encontrado = buscarAlumno(DNI);
        if (encontrado!=null){
            encontrado.setNota(nota);
            return true;
        }
        return false;
    }

    public void listarAlumno(){
        for(Alumno item : alumnos ){
            if (item != null){
                item.mostrarDatos();
                System.out.println("");
            }
        }
    }

    public Alumno buscarAlumno(String DNI) {
        for ( Alumno item : alumnos) {
            if (item != null && item.getDni().equalsIgnoreCase(DNI)) {
                return item;
            }
        }
        return null;
    }


}
