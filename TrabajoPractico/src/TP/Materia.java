package TP;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Materia implements iInformacion, Comparable<Materia> {

    private String nombre;
    private Profesor titular;

    private List<Estudiante> lista = new LinkedList<Estudiante>();

    public Materia() {
    }

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public List<Estudiante> getLista() {
        return lista;
    }

    public void agregarEstudiantes(Estudiante estudiante) {
        lista.add(estudiante);
    }

    public void eliminarEstudiantes(String nombre) {
        for (Estudiante estudiante : lista) {
            if (estudiante.getNombre().equals(nombre)) {
                lista.remove(estudiante);
                break;
            }
        }
    }

    public void modificarTitular(Profesor profesor) {
        titular = profesor;

    }

    public void listarContenidos() {
        Collections.sort(lista);

        for (Estudiante est : lista) {

            JOptionPane.showMessageDialog(null,
                    "Nombre: " + est.getNombre() + "\nApellido: " + est.getApellido() + "\nLegajo: " + est.getLegajo());
        }
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", titular=" + titular.toString();
    }

    @Override
    public int verCantidad() {
        int a = lista.size();
        return a;
    }

    @Override
    public int compareTo(Materia o) {
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
