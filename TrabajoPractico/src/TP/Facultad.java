package TP;

import java.util.LinkedList;
import java.util.List;

public class Facultad implements iInformacion {

    private String nombre;
    private List<Carrera> listaC=new LinkedList<Carrera>();
    public void agregarCarrera(Carrera carrera){
        listaC.add(carrera);

    }
    public void eliminarCarrera(String nombre){
        for (Carrera carr:listaC){
            if(carr.getNombre().equals(nombre)){
                listaC.remove(carr);
                break;
            }
        }

    }
    public void eliminarEstudiante(Estudiante estudiante){

    }

    @Override
    public void listarContenidos() {

    }
}
