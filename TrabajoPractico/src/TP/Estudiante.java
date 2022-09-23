package TP;

public class Estudiante extends Persona {
    public Estudiante(){};
    public Estudiante(String nombre, String apellido, int legajo){
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setLegajo(legajo);
    };



    @Override
    public void modificarDatos() {

    }
}
