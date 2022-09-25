package TP;

public class Profesor extends Persona{

    private double basico;
    private int antiguedad;

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

    public double calcularSueldo(double basico, int antiguedad){
        double sueldo = basico;

        for (int i=0;i<antiguedad;i++){
            sueldo=sueldo+(0.1*basico);
        }
        return sueldo;

    }



    @Override
    public void modificarDatos() {

    }

}
