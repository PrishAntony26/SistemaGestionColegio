package Clases;

import Conexion.*;
import java.io.*;
import java.util.Scanner;

public class Colegio{
    
    //public String IdColegio;
    public static BD_Alumno bdAlumno = new BD_Alumno();
    public static BD_Profesor bdProfesor = new BD_Profesor();
    public static BD_Aula bdAula = new BD_Aula();
    public static Alumno listaAlu[] = bdAlumno.obtenerAlumnos(); 
    public static Aula listaAula[] = bdAula.obtenerAulas();
    public static Profesor listaProf[] = bdProfesor.obtenerProfesores();
    public static Administrativo admin;
    public static String idAulaSelect=null;
    public static String idProfeIniciado=null;
    public static String idAlumnoSelect=null;
    public static Agenda agenda = GestorArchivos.obtenerAgenda();
    //public static String idAdminIniciado=null;
    //public sAdministrativo admin;
    public static Alumno[] getListaAlu() {
        return listaAlu;
    }

    public static void setListaAlu(Alumno[] listaAlu) {
        Colegio.listaAlu = listaAlu;
    }

    public static Aula[] getListaAula() {
        return listaAula;
    }

    public static void setListaAula(Aula[] listaAula) {
        Colegio.listaAula = listaAula;
    }

    public static Profesor[] getListaProf() {
        return listaProf;
    }

    public static void setListaProf(Profesor[] listaProf) {
        Colegio.listaProf = listaProf;
    }

    public static String getIdAulaSelect() {
        return idAulaSelect;
    }

    public static void setIdAulaSelect(String idAulaSelect) {
        Colegio.idAulaSelect = idAulaSelect;
    }

    public static String getIdProfeIniciado() {
        return idProfeIniciado;
    }

    public static void setIdProfeIniciado(String idProfeIniciado) {
        Colegio.idProfeIniciado = idProfeIniciado;
    }

    public static Agenda getAgenda() {
        return agenda;
    }

    public static void setAgenda(Agenda agenda) {
        Colegio.agenda = agenda;
    }
    
    public static void setAdmin(Administrativo admin) {
        Colegio.admin = admin;
    }    
    
   // -----------------------------------------------------------------ALUMNO
    
    public static void agregarAlumno(Alumno a){
        int n = listaAlu.length;
        redimensionarAlu();
        listaAlu[n]=a;
        GestorArchivos.actualizaFicheroAlumno();
    }
    
    public static void redimensionarAlu(){
        int n = listaAlu.length;
        Alumno y[] = new Alumno[n+1];
        
        for(int i = 0; i<n ; i++){
            y[i] = listaAlu[i];
        }
        listaAlu = y;
    }
    
    public static int existeBuscarAlu(String codigo){
        int i =0;
        int v = -1;
        String cod;
        while(i<listaAlu.length && v<0){
            cod = listaAlu[i].getCodigo();
            if(cod.equalsIgnoreCase(codigo))
                v = i;   
            i++;
        }
        
        return v;
    }
    
    public static void eliminarAlumno(String codigo){
        int i = existeBuscarAlu(codigo);
        if(i<0)
            System.out.println("Alumno no existe");
        else{
            //Eliminar alumno del Aula 
            int posAlu = Colegio.existeBuscarAlu(codigo);
            String codA = Colegio.listaAlu[posAlu].getCodA();
            int posAula = Colegio.existeBuscarAula(codA);
            
            if(posAula>=0){
                Colegio.listaAula[posAula].retirarAlumno(codigo);
            }
            
            //Redimensionamos para que sea más chiquito
            int n = listaAlu.length;
            Alumno y[] = new Alumno[n-1];
            int j;
            for(j= 0; j<i ; j++)
                y[j] = listaAlu[j];
            
            for(j = i; j<n-1;j++)
                y[j] = listaAlu[j+1];
            
            listaAlu = y;
        }
        GestorArchivos.actualizaFicheroAlumno();
    }

    //----------------------------------------------------------------AULA
    
    public static void agregarAula(Aula a){
        int n = listaAula.length;
        redimensionarAula();
        listaAula[n]=a;
        GestorArchivos.actualizaFicheroAula();
    }
    
    public static void redimensionarAula(){
        int n = listaAula.length;
        Aula y[] = new Aula[n+1];
        
        for(int i = 0; i<n ; i++){
            y[i] = listaAula[i];
        }
        listaAula = y;
    }
    
    public static int existeBuscarAula(String codigo){
        int i =0;
        int v = -1;
        String cod;
        while(i<listaAula.length && v<0){
            cod = listaAula[i].getCodigo();
            if(cod.equalsIgnoreCase(codigo))
                v = i;   
            i++;
        }
        
        return v;
    }
    
    public static void eliminarAula(String codigo){
        int i = existeBuscarAula(codigo);
        int n = listaAula.length;
        //Los alumnos que estaban registrados se eliminan se quedan en 0
        listaAula[i].eliminados();
            
        //SE ELIMINA EL AULA            
        Aula y[] = new Aula[n-1];
        int j;
        for(j= 0; j<i ; j++)
        y[j] = listaAula[j];
            
        for(j = i; j<n-1;j++)
        y[j] = listaAula[j+1];
            
        listaAula = y;
        GestorArchivos.actualizaFicheroProfesor();
        GestorArchivos.actualizaFicheroAula();
        GestorArchivos.actualizaFicheroAlumno();
    }
    
    public static void eliminarHorProfAuEli(String codA){
        for(int i=0; i<listaProf.length;i++){
            listaProf[i].modificarHorarioAuElim(codA);
        } 
    }
        
    //--------------------------------------------PROFESOR
    
    public static void eliminarHorAProfDesp(String codP){
        for(int i=0; i<listaAula.length;i++){
            listaAula[i].modificarHorarioPDesp(codP);
        } 
    }
    
    public static void agregarProfesor(Profesor a){
        int n = listaProf.length;
        redimensionarProf();
        listaProf[n]=a;
        GestorArchivos.actualizaFicheroProfesor();
    }
    
    public static void redimensionarProf(){
        int n = listaProf.length;
        Profesor y[] = new Profesor[n+1];
        
        for(int i = 0; i<n ; i++){
            y[i] = listaProf[i];
        }
        listaProf = y;
    }
    
    public static int existeBuscarProf(String codigo){
        int i =0;
        int v = -1;
        String cod;
        while(i<listaProf.length && v<0){
            cod = listaProf[i].getCodigo();
            if(cod.equalsIgnoreCase(codigo))
                v = i;   
            i++;
        }
        
        return v;
    }
    
    public static void buscarProfesor(String codigo){
        int i = existeBuscarProf(codigo);
        if(i<0)
            System.out.println("Profesor no encontrado");
        
    }
    
    public static void eliminarProfesor(String codigo){
        int i = existeBuscarProf(codigo);
        if(i<0)
            System.out.println("Profesor no existe");
        else{
            eliminarTutorAula(i);
            int n = listaProf.length;
            Profesor y[] = new Profesor[n-1];
            int j;
            for(j= 0; j<i ; j++)
                y[j] = listaProf[j];
            
            for(j = i; j<n-1;j++)
                y[j] = listaProf[j+1];
            
            listaProf = y;
        }
        GestorArchivos.actualizaFicheroProfesor();
        GestorArchivos.actualizaFicheroAula();
    }
   
    public static void eliminarTutorAula(int i){
        //Tutoría te retorna el ID del aula del profesor tutor
        String codA=listaProf[i].tutoria(); 
        System.out.println(codA);
        if(codA!=null){
            int pos=existeBuscarAula(codA);
            listaAula[pos].setTutor("");
        }
    } 
}    

