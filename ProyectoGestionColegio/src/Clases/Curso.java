
package Clases;

import java.io.Serializable;
import java.util.Scanner;

public class Curso implements Serializable{
     private String codigo;
    private String nombre;
    private String codProfesor;
    private int nHoras;
    private int creditos;
    private int tablaNotas[][];
    
    public Curso(){     
        this.tablaNotas = new int[0][5];
    }
    
    public Curso(String codigo, String nombre, int nHoras, int creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.nHoras = nHoras;
        this.creditos = creditos;
        this.tablaNotas = new int[0][5];
    }
    
    //GETTERS

    public int[][] getTablaNotas() {
        return tablaNotas;
    }

    public void setTablaNotas(int[][] tablaNotas) {
        this.tablaNotas = tablaNotas;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }
    
    //SETTERS
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }
    
    public void redimensionalTablaNotas(){
        int y[][]= new int[tablaNotas.length+1][5];
        int i,j;
        for(i= 0; i<tablaNotas.length; i++)
            for(j = 0; j<5; j++)
                    y[i][j]=tablaNotas[i][j];
        tablaNotas = y;
    }
     
    public void redimenMenosTablaNotas(int pos){
        int y[][]= new int[tablaNotas.length-1][5];
        int i,j;
        for(i= 0; i<pos; i++)
            for(j = 0; j<5; j++)
                    y[i][j]=tablaNotas[i][j];
        
        for(i= pos; i<tablaNotas.length-1; i++)
            for(j = 0; j<5; j++)
                    y[i][j]=tablaNotas[i+1][j];
        
        tablaNotas = y;
    }

    public int[] obtenerNotas(int posA){
        return  tablaNotas[posA];
        
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
}


