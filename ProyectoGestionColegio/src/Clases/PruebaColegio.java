package Clases;

import Form.*;
import java.io.File;

public class PruebaColegio {
    public static void main(String[] args) {
        int i;
        
        Administrativo adm = new Administrativo("A1", "Jose", "Martinez", "Director", "admin");
        
        Colegio.setAdmin(adm);
           
        Cargando crg = new Cargando();
        crg.setVisible(true);
        crg.setResizable(false);
    }
    
}
