
package Clases;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Persona implements Serializable{
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected int diaNac;
    protected int mesNac;
    protected int anioNac;
    protected String domicilio;
    protected String genero;
    
    public Persona(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(int diaNac) {
        this.diaNac = diaNac;
    }


    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public int getMesNac() {
        return mesNac;
    }
    
    public void setMesNac(int mesNac) {
        this.mesNac = mesNac;
    }
    
    public String getFechaNac() {
        return diaNac +  " / " + mesNac  +  " / " + anioNac ;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int calcEdad(){
        Calendar today = Calendar.getInstance();
        int diaA;
        int mesA;
        int anioA;
        
           anioA = today.get(Calendar.YEAR);
           mesA = today.get(Calendar.MONTH) +1;
           diaA = today.get(Calendar.DAY_OF_MONTH);
        
        
        int edad = anioA - anioNac;
        int diffMonth = mesA - mesNac;
        int diffDay = diaA - diaNac;

    // Si está en ese año pero todavía no los ha cumplido
    if (diffMonth < 0) {
        edad = edad - 1;
    } else if (diffMonth == 0 && diffDay < 0) {
        edad = edad - 1; 
        }

        return edad;
    }
} 

