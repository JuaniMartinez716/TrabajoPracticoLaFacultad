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



    @Override
    public void listarContenidos() {

    }
}
