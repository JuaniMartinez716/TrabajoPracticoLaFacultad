package TP;

public class Estudiante extends Persona{


    public Estudiante(){

    }
    public Estudiante(String nombre, String apellido, int legajo) {
        super.nombre = nombre;
        super.apellido = apellido;
        super.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public void modificarDatos() {

    }
}
