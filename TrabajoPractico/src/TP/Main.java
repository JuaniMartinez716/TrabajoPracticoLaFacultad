package TP;


import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        boolean atras = false;
        int opcion;
        int opcion1;

        Facultad utn=new Facultad("UTN");   //Creo el objeto Facultad
        Carrera tup=new Carrera("TUP");     //Creo los objetos Carrera
        Carrera ingSis=new Carrera("Igenieria en Sistemas");
        Materia matematica=new Materia();          //Creo los objetos Materia
        Materia quimica=new Materia();

        Estudiante e1=new Estudiante();
        Estudiante e2=new Estudiante();
        Estudiante e3=new Estudiante();


        utn.agregarCarrera(tup);
        utn.agregarCarrera(ingSis);
        tup.agregarMateria(matematica);
        tup.agregarMateria(quimica);

        matematica.agregarEstudiantes(e1);
        matematica.agregarEstudiantes(e2);
        matematica.agregarEstudiantes(e3);
        

        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de administracion de La Facultad");


        while(!salir){
            
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog( "1: Ver la Lista de Carreras de La Facultad.\n"
                                                                        + "2: Eliminar un Estudiante de La Facultad.\n"
                                                                        + "3: Salir.\n\n"
                                                                        +"Ingrese un numero de lo que desea hacer: "));

                switch(opcion){
                    case 1:
                        
                        utn.listarContenidos();
                        atras = false;
                        while(!atras){
                            
                            try{
                                
                                opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1: Agregar Carrera.\n"+"2: Eliminar Carrera.\n"+"3: Ver la Cantidad de Carreras.\n"+"4: Atras.\n\n"+"Elija una opción: "));
                            
                                switch(opcion1){
                                    case 1:
                                        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre de la carrera: ");
                                        Carrera carrera1 = new Carrera(nombre1);
                                        utn.agregarCarrera(carrera1);
                                        break;
                                    case 2:
                                        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre de la carrera: ");
                                        utn.eliminarCarrera(nombre2);
                                    case 3:
                                        JOptionPane.showMessageDialog(null, "La cantidad de Carreras en La Facultad son: "+ utn.verCantidad());
                                    case 4: 
                                        atras=true;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Solo se aceptan numeros entre 1 y 3.");
                                }
                            
                            }catch(Exception exception1){
                                JOptionPane.showMessageDialog(null,"Debes insertar un número.");
                            }
                        }

                        break;


                    case 2:
                        JOptionPane.showMessageDialog(null, "Has seleccionado la opcion 2.");
                        break;
                    case 3:
                        salir=true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Solo se aceptan numeros entre 1 y 3.");
                }
        
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Debes insertar un número.");
            }
        }
































        /* 

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
        System.out.println("------------");
        tup.encontrarMateria("matematica");
        System.out.println("----------");
        tup.listarContenidos();*/



>>>>>>> Stashed changes

public class Main {

    public static void main(String[] args) {

        Materia historia = new Materia();

        historia.agregarEstudiantes();

        historia.listarContenidos();

    }

}
