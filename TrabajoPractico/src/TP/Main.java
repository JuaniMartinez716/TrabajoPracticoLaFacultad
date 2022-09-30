package TP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        //Declaramos una Facultad
        Facultad tecnologica=new Facultad("tecnologica");
        //Declaramos Carreras
        Carrera tup=new Carrera("TUP");
        Carrera is=new Carrera("Ingenieria en Sistemas");
        Carrera da=new Carrera("Diseño y Animación");
        //Declaramos estudiantes
        Estudiante e1=new Estudiante("Lucas","Ojeda", 27123);
        Estudiante e2=new Estudiante("Juan","Martinez", 27124);
        Estudiante e3=new Estudiante("Miqueas","Alvaredo", 27125);
        Estudiante e4=new Estudiante("Eliana","Blumer", 27126);
        Estudiante e5=new Estudiante("Martin","Goyeneche", 27127);
        Estudiante e6=new Estudiante("Lautaro","Rivero", 27128);
        Estudiante e7=new Estudiante("Patricia","Fernandez", 27129);
        //Declaramos profesores
        Profesor p1=new Profesor("David","Ortiz", 123,1000,4);
        Profesor p2=new Profesor("Alicia","Garcia",124,1000,2);
        Profesor p3=new Profesor("Sofia","Ojeda",125,1000,6);
        //Declaramos materias
        Materia m1=new Materia("Matematica",p1);
        Materia m2=new Materia("Programacion",p2);
        Materia m3=new Materia("Laboratorio",p2);
        Materia m4=new Materia("Ingles",p3);
        Materia m5=new Materia("Fisica",p1);
        System.out.println("<------------Inicio del programa------------>");
        System.out.println("Agregamos carreras a la facultad "+tecnologica.getNombre());
        tecnologica.agregarCarrera(tup);
        tecnologica.agregarCarrera(is);
        tecnologica.agregarCarrera(da);
        System.out.println("<----------------------->");

        System.out.println("Mostramos lista de carreras de la facultad "+tecnologica.getNombre());
        System.out.println(tecnologica.getNombre()+" tiene "+tecnologica.verCantidad()+" carreras.");
        tecnologica.listarContenidos();

        System.out.println("<----------------------->");
        a=0;
        while (a!=1){
            System.out.println("ingrese 1 para continuar");
            a= sc.nextInt();
        }
        System.out.println("<----------------------->");
        System.out.println("Agregamos materias a las carreras");
        System.out.println("Agregamos a "+tup.getNombre()+" :");
        tup.agregarMateria(m1);
        tup.agregarMateria(m2);
        tup.agregarMateria(m3);
        tup.agregarMateria(m4);
        tup.listarContenidos();
        System.out.println(tup.getNombre()+" tiene "+tup.verCantidad()+" materias");
        System.out.println("------------------");
        System.out.println("Agregamos a "+is.getNombre()+" :");
        is.agregarMateria(m1);
        is.agregarMateria(m2);
        is.agregarMateria(m3);
        is.agregarMateria(m4);
        is.agregarMateria(m5);
        is.listarContenidos();
        System.out.println(is.getNombre()+" tiene "+is.verCantidad()+" materias");
        System.out.println("------------------");
        System.out.println("Agregamos a "+da.getNombre()+" :");
        da.agregarMateria(m1);
        da.agregarMateria(m3);
        da.agregarMateria(m4);
        da.listarContenidos();
        System.out.println(da.getNombre()+" tiene "+da.verCantidad()+" materias");
        System.out.println("<----------------------->");
        a=0;
        while (a!=1){
            System.out.println("ingrese 1 para continuar");
            a= sc.nextInt();
        }
        System.out.println("<----------------------->");
        System.out.println("Agregamos alumnos a las materias: ");
        System.out.println("Agregamos materias a "+m1.getNombre()+": ");
        m1.agregarEstudiantes(e1);
        m1.agregarEstudiantes(e2);
        m1.agregarEstudiantes(e3);
        m1.agregarEstudiantes(e4);
        m1.agregarEstudiantes(e5);
        m1.agregarEstudiantes(e6);
        m1.listarContenidos();
        System.out.println(m1.getNombre()+" tiene "+m1.verCantidad()+" estudiantes");
        System.out.println("------------------");

        System.out.println("Agregamos materias a "+m2.getNombre()+": ");
        m2.agregarEstudiantes(e1);
        m2.agregarEstudiantes(e2);
        m2.agregarEstudiantes(e3);
        m2.agregarEstudiantes(e5);
        m2.agregarEstudiantes(e7);
        m2.listarContenidos();
        System.out.println(m2.getNombre()+" tiene "+m2.verCantidad()+" estudiantes");
        System.out.println("------------------");

        System.out.println("Agregamos materias a "+m3.getNombre()+": ");
        m3.agregarEstudiantes(e1);
        m3.agregarEstudiantes(e2);
        m3.agregarEstudiantes(e3);
        m3.agregarEstudiantes(e4);
        m3.agregarEstudiantes(e5);
        m3.agregarEstudiantes(e6);
        m3.agregarEstudiantes(e7);
        m3.listarContenidos();
        System.out.println(m3.getNombre()+" tiene "+m3.verCantidad()+" estudiantes");
        System.out.println("------------------");

        System.out.println("Agregamos materias a "+m4.getNombre()+": ");
        m4.agregarEstudiantes(e3);
        m4.agregarEstudiantes(e4);
        m4.agregarEstudiantes(e5);
        m4.agregarEstudiantes(e6);
        m4.agregarEstudiantes(e7);
        m4.listarContenidos();
        System.out.println(m4.getNombre()+" tiene "+m4.verCantidad()+" estudiantes");
        System.out.println("------------------");

        System.out.println("Agregamos materias a "+m5.getNombre()+": ");
        m5.agregarEstudiantes(e3);
        m5.agregarEstudiantes(e4);
        m5.agregarEstudiantes(e1);
        m5.agregarEstudiantes(e5);
        m5.agregarEstudiantes(e7);
        m5.listarContenidos();
        System.out.println(m5.getNombre()+" tiene "+m5.verCantidad()+" estudiantes");
        System.out.println("<----------------------->");
        a=0;
        while (a!=1){
            System.out.println("ingrese 1 para continuar");
            a= sc.nextInt();
        }
        System.out.println("<----------------------->");
        System.out.println("Eliminamos una carrera, en este caso, TUP");
        tecnologica.eliminarCarrera("TUP");
        System.out.println("----------");
        System.out.println("La lista de carreras quedaria asi: ");
        tecnologica.listarContenidos();

        System.out.println("--------------");
        System.out.println("Tambien vamos a eliminar un estudiante de todas las materias");
        System.out.println("El alumno que vamos a eliminar es "+e1.toString());
        tecnologica.eliminarEstudiante(e1);
        System.out.println("--------------");
        System.out.println("vemos las listas de estudiantes de cada materia");
        System.out.println(m1.getNombre()+" tiene "+m1.verCantidad()+" estudiantes");
        m1.listarContenidos();
        System.out.println("--------------");
        System.out.println(m2.getNombre()+" tiene "+m2.verCantidad()+" estudiantes");
        m2.listarContenidos();
        System.out.println("--------------");
        System.out.println(m3.getNombre()+" tiene "+m3.verCantidad()+" estudiantes");
        m3.listarContenidos();
        System.out.println("--------------");
        System.out.println(m4.getNombre()+" tiene "+m4.verCantidad()+" estudiantes");
        m4.listarContenidos();
        System.out.println("--------------");
        System.out.println(m5.getNombre()+" tiene "+m5.verCantidad()+" estudiantes");
        m5.listarContenidos();

        System.out.println("<----------------------->");
        a=0;
        while (a!=1){
            System.out.println("ingrese 1 para continuar");
            a= sc.nextInt();
        }
        System.out.println("<----------------------->");
        System.out.println("Vamos a eliminar la materia Ingeles de "+is.getNombre());
        is.eliminarMateria("Ingles");
        System.out.println("Comprobamos que se borro");
        System.out.println(is.getNombre()+" tiene "+is.verCantidad()+" materias");
        is.listarContenidos();
        System.out.println("<----------------------->");
        System.out.println("Vamos a buscar la materia Matematica en "+is.getNombre());
        is.encontrarMateria("Matematica");
        System.out.println(is.getNombre()+" tiene "+is.verCantidad()+" materias");
        is.listarContenidos();
        System.out.println("<----------------------->");
        a=0;
        while (a!=1){
            System.out.println("ingrese 1 para continuar");
            a= sc.nextInt();
        }
        System.out.println("<----------------------->");
        System.out.println("Vamos a eliminar a Miqueas Alvaredo de la materia "+m3.getNombre());
        m3.eliminarEstudiantes("Miqueas");
        System.out.println(m3.getNombre()+" tiene "+m3.verCantidad()+" estudiantes");
        m3.listarContenidos();

        System.out.println("<----------------------->");
        a=0;
        while (a!=1){
            System.out.println("ingrese 1 para continuar");
            a= sc.nextInt();
        }
        System.out.println("<----------------------->");

        System.out.println("Vamos a modicar el titular de "+m5.getNombre()+" que es el "+m5.getTitular().toString());
        m5.modificarTitular(p2);
        System.out.println("--------------");
        System.out.println("El nuevo titular de "+m5.getNombre()+" es el :"+m5.getTitular().toString());

        System.out.println("<----------------------->");
        a=0;
        while (a!=1){
            System.out.println("ingrese 1 para continuar");
            a= sc.nextInt();
        }
        System.out.println("<----------------------->");

        System.out.println("Por ultimo vamos a calcular el sueldo de los profesores");
        System.out.println("------------");
        System.out.println("El sueldo de "+p1.toString()+" es: ");
        System.out.println(p1.calcularSueldo(p1.getBasico(),p1.getAntiguedad()));
        System.out.println("------------");
        System.out.println("El sueldo de "+p2.toString()+" es: ");
        System.out.println(p2.calcularSueldo(p2.getBasico(), p2.getAntiguedad()));
        System.out.println("------------");
        System.out.println("El sueldo de "+p3.toString()+" es: ");
        System.out.println(p3.calcularSueldo(p3.getBasico(), p3.getAntiguedad()));

        System.out.println("<----------------------->");
        a=0;
        while (a!=1){
            System.out.println("ingrese 1 para terminar");
            a= sc.nextInt();
            System.out.println("<------------Fin del programa------------>");
        }
        System.out.println("<----------------------->");


























    }
}
