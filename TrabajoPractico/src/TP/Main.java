package TP;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int a;
        // Declaramos una Facultad
        Facultad tecnologica = new Facultad("UTN");
        // Declaramos Carreras
        Carrera tup = new Carrera("TUP");
        Carrera is = new Carrera("Ingenieria en Sistemas");
        Carrera da = new Carrera("Diseño y Animación");
        // Declaramos estudiantes
        Estudiante e1 = new Estudiante("Lucas", "Ojeda", 27123);
        Estudiante e2 = new Estudiante("Juan", "Martinez", 27124);
        Estudiante e3 = new Estudiante("Miqueas", "Alvaredo", 27125);
        Estudiante e4 = new Estudiante("Eliana", "Blumer", 27126);
        Estudiante e5 = new Estudiante("Martin", "Goyeneche", 27127);
        Estudiante e6 = new Estudiante("Lautaro", "Rivero", 27128);
        Estudiante e7 = new Estudiante("Patricia", "Fernandez", 27129);
        // Declaramos profesores
        Profesor p1 = new Profesor("David", "Ortiz", 123, 1000, 4);
        Profesor p2 = new Profesor("Alicia", "Garcia", 124, 1000, 2);
        Profesor p3 = new Profesor("Sofia", "Ojeda", 125, 1000, 6);
        // Declaramos materias
        Materia m1 = new Materia("Matematica", p1);
        Materia m2 = new Materia("Programacion", p2);
        Materia m3 = new Materia("Laboratorio", p2);
        Materia m4 = new Materia("Ingles", p3);
        Materia m5 = new Materia("Fisica", p1);

        JOptionPane.showMessageDialog(null, "Inicio del programa");
        JOptionPane.showMessageDialog(null, "Agregamos carreras a la facultad " + tecnologica.getNombre());
        tecnologica.agregarCarrera(tup);
        tecnologica.agregarCarrera(is);
        tecnologica.agregarCarrera(da);

        JOptionPane.showMessageDialog(null, "Mostramos lista de carreras de la facultad " + tecnologica.getNombre());
        JOptionPane.showMessageDialog(null,
                tecnologica.getNombre() + " tiene " + tecnologica.verCantidad() + " carreras.");
        tecnologica.listarContenidos();

        a = 0;
        while (a != 1) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para continuar"));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Debe insertar un número.");
            }
        }

        JOptionPane.showMessageDialog(null, "Ahora agregamos materias a las carreras");
        JOptionPane.showMessageDialog(null, "Agregamos las siguientes Materias a " + tup.getNombre() + " :");
        tup.agregarMateria(m1);
        tup.agregarMateria(m2);
        tup.agregarMateria(m3);
        tup.agregarMateria(m4);
        tup.listarContenidos();
        JOptionPane.showMessageDialog(null, tup.getNombre() + " tiene " + tup.verCantidad() + " materias");
        JOptionPane.showMessageDialog(null, "Agregamos las siguientes Materias a " + is.getNombre() + " :");
        is.agregarMateria(m1);
        is.agregarMateria(m2);
        is.agregarMateria(m3);
        is.agregarMateria(m4);
        is.agregarMateria(m5);
        is.listarContenidos();
        JOptionPane.showMessageDialog(null, is.getNombre() + " tiene " + is.verCantidad() + " materias");
        JOptionPane.showMessageDialog(null, "Agregamos las siguientes Materias a " + da.getNombre() + " :");
        da.agregarMateria(m1);
        da.agregarMateria(m3);
        da.agregarMateria(m4);
        da.listarContenidos();
        JOptionPane.showMessageDialog(null, da.getNombre() + " tiene " + da.verCantidad() + " materias");

        a = 0;
        while (a != 1) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para continuar"));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Debe insertar un número.");
            }
        }

        JOptionPane.showMessageDialog(null, "Ahora agregamos alumnos a las materias: ");
        JOptionPane.showMessageDialog(null, "Agregamos los siguientes Estudiantes a " + m1.getNombre() + ": ");
        m1.agregarEstudiantes(e1);
        m1.agregarEstudiantes(e2);
        m1.agregarEstudiantes(e3);
        m1.agregarEstudiantes(e4);
        m1.agregarEstudiantes(e5);
        m1.agregarEstudiantes(e6);
        m1.listarContenidos();
        JOptionPane.showMessageDialog(null, m1.getNombre() + " tiene " + m1.verCantidad() + " estudiantes");

        JOptionPane.showMessageDialog(null, "Agregamos los siguientes Estudiantes a " + m2.getNombre() + ": ");
        m2.agregarEstudiantes(e1);
        m2.agregarEstudiantes(e2);
        m2.agregarEstudiantes(e3);
        m2.agregarEstudiantes(e5);
        m2.agregarEstudiantes(e7);
        m2.listarContenidos();
        JOptionPane.showMessageDialog(null, m2.getNombre() + " tiene " + m2.verCantidad() + " estudiantes");

        JOptionPane.showMessageDialog(null, "Agregamos los siguientes Estudiantes a " + m3.getNombre() + ": ");
        m3.agregarEstudiantes(e1);
        m3.agregarEstudiantes(e2);
        m3.agregarEstudiantes(e3);
        m3.agregarEstudiantes(e4);
        m3.agregarEstudiantes(e5);
        m3.agregarEstudiantes(e6);
        m3.agregarEstudiantes(e7);
        m3.listarContenidos();
        JOptionPane.showMessageDialog(null, m3.getNombre() + " tiene " + m3.verCantidad() + " estudiantes");

        JOptionPane.showMessageDialog(null, "Agregamos los siguientes Estudiantes a " + m4.getNombre() + ": ");
        m4.agregarEstudiantes(e3);
        m4.agregarEstudiantes(e4);
        m4.agregarEstudiantes(e5);
        m4.agregarEstudiantes(e6);
        m4.agregarEstudiantes(e7);
        m4.listarContenidos();
        JOptionPane.showMessageDialog(null, m4.getNombre() + " tiene " + m4.verCantidad() + " estudiantes");

        JOptionPane.showMessageDialog(null, "Agregamos los siguientes Estudiantes a " + m5.getNombre() + ": ");
        m5.agregarEstudiantes(e3);
        m5.agregarEstudiantes(e4);
        m5.agregarEstudiantes(e1);
        m5.agregarEstudiantes(e5);
        m5.agregarEstudiantes(e7);
        m5.listarContenidos();
        JOptionPane.showMessageDialog(null, m5.getNombre() + " tiene " + m5.verCantidad() + " estudiantes");

        a = 0;
        while (a != 1) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para continuar"));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Debe insertar un número.");
            }
        }

        JOptionPane.showMessageDialog(null, "Eliminamos una carrera, en este caso, TUP");
        tecnologica.eliminarCarrera("TUP");
        JOptionPane.showMessageDialog(null, "La lista de carreras quedaria asi: ");
        tecnologica.listarContenidos();

        JOptionPane.showMessageDialog(null, "Tambien vamos a eliminar un estudiante de todas las materias");
        JOptionPane.showMessageDialog(null, "El alumno que vamos a eliminar es " + e1.toString());
        tecnologica.eliminarEstudiante(e1);

        JOptionPane.showMessageDialog(null, "Ahora vemos las listas de estudiantes de cada materia");
        JOptionPane.showMessageDialog(null, m1.getNombre() + " tiene " + m1.verCantidad() + " estudiantes");
        m1.listarContenidos();
        JOptionPane.showMessageDialog(null, m2.getNombre() + " tiene " + m2.verCantidad() + " estudiantes");
        m2.listarContenidos();
        JOptionPane.showMessageDialog(null, m3.getNombre() + " tiene " + m3.verCantidad() + " estudiantes");
        m3.listarContenidos();
        JOptionPane.showMessageDialog(null, m4.getNombre() + " tiene " + m4.verCantidad() + " estudiantes");
        m4.listarContenidos();
        JOptionPane.showMessageDialog(null, m5.getNombre() + " tiene " + m5.verCantidad() + " estudiantes");
        m5.listarContenidos();

        a = 0;
        while (a != 1) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para continuar"));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Debe insertar un número.");
            }
        }

        JOptionPane.showMessageDialog(null, "Ahora vamos a eliminar la materia Ingles de " + is.getNombre());
        is.eliminarMateria("Ingles");
        JOptionPane.showMessageDialog(null, "Comprobamos que se haya eliminado.");
        JOptionPane.showMessageDialog(null, is.getNombre() + " tiene " + is.verCantidad() + " materias");
        is.listarContenidos();
        JOptionPane.showMessageDialog(null, "Vamos a buscar la materia Matematica en " + is.getNombre());
        is.encontrarMateria("Matematica");
        JOptionPane.showMessageDialog(null, is.getNombre() + " tiene " + is.verCantidad() + " materias");
        is.listarContenidos();

        a = 0;
        while (a != 1) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para continuar"));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Debe insertar un número.");
            }
        }

        JOptionPane.showMessageDialog(null, "Vamos a eliminar a Miqueas Alvaredo de la materia " + m3.getNombre());
        m3.eliminarEstudiantes("Miqueas");
        JOptionPane.showMessageDialog(null, m3.getNombre() + " tiene " + m3.verCantidad() + " estudiantes");
        m3.listarContenidos();

        a = 0;
        while (a != 1) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para continuar"));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Debe insertar un número.");
            }
        }

        JOptionPane.showMessageDialog(null,
                "Vamos a modicar el titular de " + m5.getNombre() + " que es " + m5.getTitular().toString());
        m5.modificarTitular(p2);
        JOptionPane.showMessageDialog(null,
                "El nuevo titular de " + m5.getNombre() + " es " + m5.getTitular().toString());

        a = 0;
        while (a != 1) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para continuar"));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Debe insertar un número.");
            }
        }

        JOptionPane.showMessageDialog(null, "Por ultimo vamos a calcular el sueldo de los profesores");
        JOptionPane.showMessageDialog(null, "El sueldo de " + p1.toString() + " es: ");
        JOptionPane.showMessageDialog(null, "$" + p1.calcularSueldo(p1.getBasico(), p1.getAntiguedad()));
        JOptionPane.showMessageDialog(null, "El sueldo de " + p2.toString() + " es: ");
        JOptionPane.showMessageDialog(null, "$" + p2.calcularSueldo(p2.getBasico(), p2.getAntiguedad()));
        JOptionPane.showMessageDialog(null, "El sueldo de " + p3.toString() + " es: ");
        JOptionPane.showMessageDialog(null, "$" + p3.calcularSueldo(p3.getBasico(), p3.getAntiguedad()));

        a = 0;
        while (a != 1) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para terminar"));
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Debe insertar un número.");
            }
        }

        JOptionPane.showMessageDialog(null, "Fin del programa.");
    }
}
