package Clases;

import java.util.Scanner;

public class Profesor extends Persona{
    private String codigo;
    private String celular;
    private HorarioProfesor hp=new HorarioProfesor();
    
    public Profesor(){}
    
    public void modificarHorarioP(String h,int fila, int colum){
        hp.modificarHorario(h, fila, colum);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCelular() {
        return celular;
    }

    public boolean esTutor(){
        int i = 0;
        boolean v = false;
        
        while(!v && i<Colegio.listaAula.length){
            if(Colegio.listaAula[i].getTutor().equals(codigo)){
                v = true;
            }
            i++;
        }
        return v;
    }
    
    public String tutoria(){
        int i = 0;
        String idAula = null;
        
        while(idAula == null && i<Colegio.listaAula.length){
            if(Colegio.listaAula[i].getTutor().equals(codigo)){
                idAula = Colegio.listaAula[i].getCodigo();
            }
            i++;
        }
        return idAula;
    }
    
    public String[] aulaProf(){
        return hp.aulasProf();
    }
    
    public String[] cursoProf(Curso[] curs, String codAula){
        return hp.mostrarCursosAula(curs, codAula);
    }
    
    @Override
    public String toString(){
        return nombre+" "+apellido;
    }

    public HorarioProfesor getHp() {
        return hp;
    }
    
    public String[][] getHpS() {
        return hp.getHor();
    }
    
    public void modificarHorarioAuElim(String codA){
        hp.modificarHorarioAuElim(codA);
    }
    
}