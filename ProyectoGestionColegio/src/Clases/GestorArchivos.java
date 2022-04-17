/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.*;

public class GestorArchivos {
    private static File archAlumno = new File("Archivos/Alumnos.txt");
    private static File archProfesor = new File("Archivos/Profesores.txt");
    private static File archAula = new File("Archivos/Aulas.txt");
    private static File archAgenda = new File("Archivos/Agenda.txt");
    
    public static void actualizaFicheroAlumno(){
       archAlumno.delete();
       try{
            archAlumno.createNewFile();
            ObjectOutputStream recArchAlumno = new ObjectOutputStream(new FileOutputStream(archAlumno));
            recArchAlumno.writeObject(Colegio.listaAlu);
               
            recArchAlumno.close();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error");
        }
    }
    
    public static Alumno[] obtenerAlumnos(){
        Alumno alus[];
        if(archAlumno.exists()){
           try{
               ObjectInputStream recArchAlumno = new ObjectInputStream(new FileInputStream(archAlumno));
               alus =  (Alumno[])recArchAlumno.readObject();
               recArchAlumno.close();
               if(alus == null){
                   System.out.println("No existe Objetos en el Archivo Alumno");
                   alus = new Alumno[0];
               }
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error");
               System.out.println(ex);
               alus = new Alumno[0];
           }
        }else{
            System.out.println("No existe el Archivo Alumno");
            //Paso 1 Ingreso aquí
            alus = new Alumno[0];
        }
        return alus;
    }
    
    
    public static void actualizaFicheroAula(){
        archAula.delete();
        try{
            archAula.createNewFile();
            ObjectOutputStream recArchAula = new ObjectOutputStream(new FileOutputStream(archAula));
            recArchAula.writeObject(Colegio.listaAula);
               
            recArchAula.close();
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error");
        }
    }
    
    public static Aula[] obtenerAula(){
        Aula aula[];
        if(archAula.exists()){
           try{
               ObjectInputStream recArchAula = new ObjectInputStream(new FileInputStream(archAula));
               aula =  (Aula[])recArchAula.readObject();
               recArchAula.close();
               if(aula == null){
                   System.out.println("No existe Objetos en el Archivo Aula");
                   aula = new Aula[0];
               }
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error");
               System.out.println(ex);
               aula = new Aula[0];
           }
        }else{
            System.out.println("No existe el Archivo Aula");
            //Paso 1 Ingreso aquí
            aula = new Aula[0];
        }
        return aula;
    }
    
    public static void actualizaFicheroProfesor(){
        archProfesor.delete();
           try{
               archProfesor.createNewFile();
               ObjectOutputStream recArchProfesor = new ObjectOutputStream(new FileOutputStream(archProfesor));
               recArchProfesor.writeObject(Colegio.listaProf);
               
               recArchProfesor.close();
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error 1");
           } 
    }
    
    public static Profesor[] obtenerProfesores(){
        Profesor profes[];
        if(archProfesor.exists()){
           try{
               ObjectInputStream recArchProfesor = new ObjectInputStream(new FileInputStream(archProfesor));
               profes = (Profesor[])recArchProfesor.readObject();
               recArchProfesor.close();
               if(profes == null){
                   System.out.println("No existe Objetos en el Archivo Profesor");
                   profes = new Profesor[0];
               }
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error 2");
               System.out.println(ex);
               profes = new Profesor[0];
           }
        }else{
            System.out.println("No existe el Archivo Profesor");
            //Paso 1 Ingreso aquí
            profes = new Profesor[0];
        }
        return profes;
    }

    public static void actualizaFicheroAgenda(){
        archAgenda.delete();
           try{
               archAgenda.createNewFile();
               ObjectOutputStream recArchAgenda = new ObjectOutputStream(new FileOutputStream(archAgenda));
               recArchAgenda.writeObject(Colegio.agenda);
               
               recArchAgenda.close();
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error con el Archivo Agenda...!");
           } 
    }
    
    public static Agenda obtenerAgenda(){
        Agenda agenda;
        if(archAgenda.exists()){
           try{
               ObjectInputStream recArchAgenda = new ObjectInputStream(new FileInputStream(archAgenda));
               agenda = (Agenda)recArchAgenda.readObject();
               recArchAgenda.close();
               if(agenda == null){
                   System.out.println("No existe Objetos en el Archivo Agenda");
                   agenda = new Agenda();
               }
           }catch(Exception ex){
               System.out.println("Ha ocurrido un error con el Archivo Agenda...!");
               System.out.println(ex);
               agenda = new Agenda();
           }
        }else{
            System.out.println("No existe el Archivo Agenda");
            //Paso 1 Ingreso aquí
            agenda = new Agenda();
        }
        return agenda;
    }
}
