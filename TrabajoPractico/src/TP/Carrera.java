package TP;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Carrera implements iInformacion, Comparable<Carrera> {

    private String nombre;
    private List<Materia> listaM = new LinkedList<Materia>();
    Scanner sc = new Scanner(System.in);

    public Carrera() {
    }

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

    public void agregarMateria(Materia materia) {
        listaM.add(materia);
    }

    public void eliminarMateria(String nombre) {
        for (Materia mat : listaM) {
            if (mat.getNombre().equals(nombre)) {
                listaM.remove(mat);
                break;
            }
        }
    }

    public void encontrarMateria(String nombre) {
        for (int i = 0; i < listaM.size(); i++) {
            if (listaM.get(i).getNombre().equals(nombre)) {
                int a = Integer.parseInt(JOptionPane.showInputDialog("Existe.\n\nPresiones 1 si desea eliminar"));

                if (a == 1) {
                    eliminarMateria(nombre);
                }
                break;

            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia que busca.");
            }
        }

    }

    @Override
    public void listarContenidos() {
        Collections.sort(listaM);

        for (Materia mat : listaM) {
            JOptionPane.showMessageDialog(null, mat.getNombre());
        }

    }

    @Override
    public int verCantidad() {
        int a = listaM.size();
        return a;
    }

    @Override
    public int compareTo(Carrera o) {
        int salida;
        if (o.getNombre().compareToIgnoreCase(this.nombre) == 0) {
            salida = 0;
        } else if (o.getNombre().compareToIgnoreCase(this.nombre) > 0) {
            salida = -1;
        } else {
            salida = 1;
        }
        return salida;
    }
}
