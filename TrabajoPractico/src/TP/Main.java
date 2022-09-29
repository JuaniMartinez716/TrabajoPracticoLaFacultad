package TP;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        boolean salir = false;
        boolean atras = false;
        int opcion;
        int opcion1;

        Facultad utn = new Facultad("UTN"); // Creo el objeto Facultad
        Carrera tup = new Carrera("TUP"); // Creo los objetos Carrera
        Carrera ingSis = new Carrera("Igenieria en Sistemas");
        Materia matematica = new Materia(); // Creo los objetos Materia
        Materia Laboratorio = new Materia();

        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();
        Estudiante e3 = new Estudiante();

        utn.agregarCarrera(tup);
        utn.agregarCarrera(ingSis);

        tup.agregarMateria(matematica);
        tup.agregarMateria(Laboratorio);
        ingSis.agregarMateria(matematica);
        ingSis.agregarMateria(Laboratorio);

        matematica.agregarEstudiantes(e1);
        matematica.agregarEstudiantes(e2);
        matematica.agregarEstudiantes(e3);
        Laboratorio.agregarEstudiantes(e1);
        Laboratorio.agregarEstudiantes(e2);
        Laboratorio.agregarEstudiantes(e3);

        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de administracion de La Facultad");

        while (!salir) {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1: Ingresar a las Carreras de La Facultad.\n"
                        + "2: Eliminar un Estudiante de La Facultad.\n"
                        + "3: Salir.\n\n"
                        + "Ingrese un numero de lo que desea hacer: "));

                switch (opcion) {
                    case 1:
                        atras = false;
                        while (!atras) {

                            try {

                                opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1: Agregar Carrera.\n"
                                        + "2: Eliminar Carrera.\n" + "3: Ver la Cantidad de Carreras.\n"
                                        + "4: Atras.\n\n" + "Elija una opción: "));

                                switch (opcion1) {

                                    case 1:
                                        String nombre1 = JOptionPane
                                                .showInputDialog("Ingrese el nombre de la carrera: ");
                                        Carrera carrera1 = new Carrera(nombre1);
                                        utn.agregarCarrera(carrera1);
                                        break;

                                    case 2:
                                        String nombre2 = JOptionPane
                                                .showInputDialog("Ingrese el nombre de la carrera: ");
                                        utn.eliminarCarrera(nombre2);
                                        break;

                                    case 3:
                                        JOptionPane.showMessageDialog(null,
                                                "La cantidad de Carreras en La Facultad son: " + utn.verCantidad());
                                        utn.listarContenidos();
                                        break;

                                    case 4:
                                        atras = true;
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Solo se aceptan numeros entre 1 y 3.");
                                }

                            } catch (Exception exception1) {
                                JOptionPane.showMessageDialog(null, "Debes insertar un número.");
                            }
                        }

                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la opcion 2.");
                        break;

                    case 3:
                        salir = true;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Solo se aceptan numeros entre 1 y 3.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debes insertar un número.");
            }
        }
    }
}