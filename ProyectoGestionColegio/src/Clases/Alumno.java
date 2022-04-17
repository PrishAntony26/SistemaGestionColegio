
package Clases;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Alumno extends Persona {

    private String codigo;
    //Se obtiene el mayor numero de los ids, ya que nunca retrocederemos siempre se avanza
    private String codA = "0";
    
    public Alumno(){    
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodA() {
        return codA;
    }

    public void setCodA(String codA) {
        this.codA = codA;
    }
            
    @Override
    public String toString(){
        return codigo+" "+nombre+" "+apellido;
    }
}
