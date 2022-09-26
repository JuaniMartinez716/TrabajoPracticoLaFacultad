package TP;

import java.util.LinkedList;
import java.util.List;

public class Carrera implements iInformacion {

    private String nombre;
    private List<Materia> listaM=new LinkedList<Materia>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia materia){
        listaM.add(materia);
    }
    public void eliminarMateria(String nombre){
        for (Materia mat:listaM){
            if(mat.getNombre().equals(nombre)){
                listaM.remove(mat);
                break;
            }
        }
    }



    @Override
    public void listarContenidos() {

    }
}
