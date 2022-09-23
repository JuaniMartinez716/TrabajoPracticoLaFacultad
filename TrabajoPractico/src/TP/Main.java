package TP;

public class Main {
    public static void main(String[] args) {
        Materia matematica= new Materia();
        Estudiante e1=new Estudiante("Lucas","Ojeda",12333);
        Estudiante e2=new Estudiante("Juan","Martinez",12344);
        Estudiante e3=new Estudiante("Martin","Goyeneche",12366);
        Estudiante e4=new Estudiante("Oriel","Martinez",12377);
        //agregamos estudiantes a la lista de cada materia
        matematica.agregarEstudiantes(e1);
        matematica.agregarEstudiantes(e2);
        matematica.agregarEstudiantes(e3);
        matematica.agregarEstudiantes(e4);

        matematica.listarContenidos();



    }



}
