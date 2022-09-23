package TP;

import java.util.ArrayList;
import java.util.List;

public class Materia implements iInformacion {

    private String nombre;
    private Profesor titular;
    private  List<Estudiante>lista =new ArrayList<Estudiante>();

    public void agregarEstudiantes(Estudiante estudiante){
        lista.add(estudiante);
    }
    public void listarContenidos() {
        for (Estudiante est:lista){
            System.out.println(est.getApellido());
        }


    }






}
