package TP;

public class Main {
    public static void main(String[] args) {

        Facultad tic=new Facultad("tic");
        Carrera tup=new Carrera("TUP");

        Profesor lucas=new Profesor();
        Profesor juan=new Profesor();
        Materia matematica= new Materia("matematica", lucas);
        Materia quimica=new Materia("quimica",juan);
        Estudiante e1=new Estudiante("Lucas","Ojeda",12333);
        Estudiante e2=new Estudiante("Juan","Martinez",12344);
        Estudiante e3=new Estudiante("Martin","Goyeneche",12366);
        Estudiante e4=new Estudiante("Oriel","Martinez",12377);
        //agregamos estudiantes a la lista de cada materia
        /*matematica.agregarEstudiantes(e1);
        matematica.agregarEstudiantes(e2);
        matematica.agregarEstudiantes(e3);
        matematica.agregarEstudiantes(e4);


        matematica.listarContenidos();
        lucas.setNombre("Lucas");
        lucas.setBasico(1000);
        lucas.setAntiguedad(4);
        juan.setNombre("Juan");

        System.out.println(lucas.calcularSueldo(1000,4));

        matematica.eliminarEstudiantes("Oriel");
        matematica.listarContenidos();
        matematica.setTitular(lucas);
        System.out.println(matematica.getTitular().getNombre());
        matematica.modificarTitular(juan);
        System.out.println(matematica.getTitular().getNombre());
        System.out.println(matematica.verCantidad());

         */
        System.out.println("--------------------------");

        tic.agregarCarrera(tup);
        tup.agregarMateria(matematica);
        tup.agregarMateria(quimica);
        matematica.agregarEstudiantes(e1);
        matematica.agregarEstudiantes(e2);
        matematica.agregarEstudiantes(e3);
        matematica.agregarEstudiantes(e4);
        quimica.agregarEstudiantes(e1);
        quimica.agregarEstudiantes(e3);

        tic.listarContenidos();
        System.out.println("------------");
        tup.listarContenidos();
        System.out.println("------------");
        matematica.listarContenidos();
        System.out.println("-------------");
        quimica.listarContenidos();









    }



}
