package TP;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Carrera implements iInformacion, Comparable<Carrera> {

    private String nombre;
    private List<Materia> listaM=new LinkedList<Materia>();
    Scanner sc=new Scanner(System.in);

    public Carrera(){}

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getListaM() {
        return listaM;
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
    public void encontrarMateria(String nombre){
        for(int i=0;i<listaM.size();i++){
            if(listaM.get(i).getNombre().equals(nombre)){
                System.out.println("existe, presione 1 si desea eliminar ");
                int a=sc.nextInt();
                if(a==1){eliminarMateria(nombre);
                }break;

            }else{
                System.out.println("no existe");
            }
        }

    }

    @Override
    public void listarContenidos() {
        Collections.sort(listaM);

        for(Materia mat:listaM){
            System.out.println(mat.toString());
        }

    }



    @Override
    public int verCantidad() {
        int a=listaM.size();
        return a;
    }

    @Override
    public int compareTo(Carrera o) {
        int salida;
        if(o.getNombre().compareToIgnoreCase(this.nombre)==0){
            salida=0;
        }else if(o.getNombre().compareToIgnoreCase(this.nombre)>0){
            salida=-1;
        }else{
            salida=1;
        }
        return salida;
    }
}
