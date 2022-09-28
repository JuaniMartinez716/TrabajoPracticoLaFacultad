package TP;

public class Carrera implements iInformacion {

    private String nombre;
<<<<<<< Updated upstream
=======
    private List<Materia> listaM=new LinkedList<Materia>();
    Scanner sc=new Scanner(System.in);

    public Carrera(){}

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia materia){
        listaM.add(materia);
    }
    
    public void eliminarMateria(String nombre){
        for (Materia mat:listaM){
            if(mat.getNombre().equals(nombre)){
                listaM.remove(mat);
                break;
            }
        }
    }
    public void encontrarMateria(String nombre){
        for(int i=0;i<listaM.size();i++){
            if(listaM.get(i).getNombre().equals(nombre)){
                System.out.println("existe, presione 1 si desea eliminar ");
                int a=sc.nextInt();
                if(a==1){eliminarMateria(nombre);
                }break;

            }else{
                System.out.println("no existe");
            }
        }
    }


>>>>>>> Stashed changes

    @Override
    public void listarContenidos() {

<<<<<<< Updated upstream
=======

    @Override
    public int verCantidad() {
        int a=listaM.size();
        return a;
>>>>>>> Stashed changes
    }
}
