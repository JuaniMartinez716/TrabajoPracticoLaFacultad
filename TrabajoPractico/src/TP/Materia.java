package TP;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Materia implements iInformacion {

    private String nombre;
    private Profesor titular;
    private  List<Estudiante>lista =new LinkedList<Estudiante>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public void agregarEstudiantes(Estudiante estudiante){
        lista.add(estudiante);
    }
    public void eliminarEstudiantes(String nombre){
        for (Estudiante estudiante:lista){
            if(estudiante.getNombre().equals(nombre)){
                lista.remove(estudiante);
                break;
            }
        }
    }
    public void modificarTitular(Profesor profesor){
        titular=profesor;

    }

    public void listarContenidos() {
        for (Estudiante est:lista){

            System.out.println(est.getApellido());
        }
    }



}
