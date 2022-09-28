package TP;

<<<<<<< Updated upstream
=======
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

>>>>>>> Stashed changes
public class Facultad implements iInformacion {

    private String nombre;

    @Override
    public void listarContenidos() {
<<<<<<< Updated upstream

    }
=======
        
        for(Carrera carr:listaC){
            JOptionPane.showMessageDialog(null, carr.getNombre());
        }
    }

    @Override
    public int verCantidad() {
        int a=listaC.size();
        return a;
    }

    public List<Carrera> getListaC() {
        return listaC;
    }
>>>>>>> Stashed changes
}
