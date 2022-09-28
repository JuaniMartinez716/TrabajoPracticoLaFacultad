package TP;

public class Estudiante extends Persona implements Comparable<Estudiante> {
    public Estudiante(){};
    public Estudiante(String nombre, String apellido, int legajo){
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setLegajo(legajo);
    }



    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString() {
        return  "nombre= " + nombre +
                ", apellido= " + apellido +
                ", legajo=" + legajo
                ;
    }

    @Override
    public int compareTo(Estudiante o) {
        int salida;
        if(o.getApellido().compareToIgnoreCase(this.apellido)==0){
            if(o.getNombre().compareToIgnoreCase(this.nombre)>0){
                salida=-1;
            }else if(o.getNombre().compareToIgnoreCase(this.nombre)<0){
                salida=1;
            }else{
                salida=0;
            }
        }else if(o.getApellido().compareToIgnoreCase(this.apellido)>0){
            salida=-1;
        }else{
            salida=1;
        }
        return salida;
    }

}
