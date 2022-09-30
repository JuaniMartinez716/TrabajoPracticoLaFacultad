package TP;

public class Profesor extends Persona {

    private double basico;
    private int antiguedad;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo(double basico, int antiguedad) {
        double sueldo = basico;

        for (int i = 0; i < antiguedad; i++) {
            sueldo = sueldo + (0.1 * basico);
        }
        return sueldo;

    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nLegajo: " + legajo;

    }

    @Override
    public void modificarDatos() {

    }

}
