package TP;

import java.util.ArrayList;
import java.util.List;

public class Materia implements iInformacion {

    private String nombre;
    private Profesor titular;


    List<Estudiante> lista = new ArrayList<Estudiante>();

    public void agregarEstudiantes(){
        lista.add(new Estudiante());
    }

    public void listarContenidos(){
        for(Estudiante estu:lista){
            System.out.println("Prueba: "+estu.getNombre()+" "+estu.getApellido()+" "+estu.getLegajo());
        }
    }




}
