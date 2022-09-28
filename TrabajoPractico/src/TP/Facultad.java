package TP;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Facultad implements iInformacion {

    private String nombre;
    private List<Carrera> listaC=new LinkedList<Carrera>();
    public Facultad(){}

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



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
        for(int i=0;i<listaC.size();i++){
            for(int j=0;j<listaC.get(i).getListaM().size();j++){
                for(int k=0;k<listaC.get(i).getListaM().get(j).getLista().size();k++){
                    if(listaC.get(i).getListaM().get(j).getLista().get(k).equals(estudiante)){
                        listaC.get(i).getListaM().get(j).eliminarEstudiantes(estudiante.getNombre());
                    }
                }
            }
        }
    }



    @Override
    public void listarContenidos() {
        Collections.sort(listaC);
        for(Carrera carr:listaC){
            System.out.println(carr.getNombre());
        }

    }

    @Override
    public int verCantidad() {
        int a=listaC.size();
        return a;
    }
}
