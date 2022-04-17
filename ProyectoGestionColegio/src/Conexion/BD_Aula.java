/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Clases.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ok
 */
public class BD_Aula{
    BD_Conexion BaseDatos = new BD_Conexion();
    private final String bd = "colegio";
    private final String usuario = "root";//Usuario
    private final String pass = "";//Contraseña 
    private String valores,sql;//Consulta a ejecutarse en la base de datos 
    private ResultSet ResultSet;//Transferir los datos de la tabla hacia un objeto
        
    public boolean ingresarAula(Aula aula){
        boolean respuesta = false;
        if(BaseDatos.conectar(bd, usuario, pass)){
            sql = "INSERT INTO aula Values ('"+aula.getCodigo()+"','"+aula.getTutor()+"',"+"'Cole01'"+",'"+aula.getGrado()
                    +"','"+aula.getSeccion()+"','"+aula.getNivel()+"','"+aula.getAforo()+"');";
            if(BaseDatos.ejecutar(sql)){
                    respuesta = true;  
            }
            BaseDatos.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
        return respuesta;
    }
    
    public int existeCodigo(String codigo){
        int respuesta = -1;
        if(BaseDatos.conectar(bd, usuario, pass)){
            sql = "SELECT IdAula FROM aula WHERE IdAula = '"+codigo+"'";
            ResultSet resultado = BaseDatos.seleccionar(sql);
        try{
            if(resultado.next()){
                respuesta++;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null," ERROR EN LA BASE DE DATOS ");
            }
        }
        return respuesta;
    }
    
    public Aula[] obtenerAulas(){
        int numAula = cantidadAula();
        Aula resp[] = new Aula[numAula];
        int contador = 0;
        if(BaseDatos.conectar(bd, usuario, pass)){
            /*
            Hacemos la funcion SELECT de la base de datos 
            */
            sql = "SELECT IdAula,IdTutor,grado,seccion,nivel,aforo FROM aula";
            
            ResultSet resultado = BaseDatos.seleccionar(sql);
        try{
            while(resultado.next()){
                resp[contador] = new Aula();
                String cad = resultado.getString("IdAula");
                resp[contador].setCodigo(cad);
                cad = resultado.getString("IdTutor");
                resp[contador].setTutor(cad);
                cad = resultado.getString("grado");
                resp[contador].setGrado(cad);
                cad = resultado.getString("seccion");
                resp[contador].setSeccion(cad);
                cad = resultado.getString("nivel");
                resp[contador].setNivel(cad);
                cad = resultado.getString("aforo");
                resp[contador].setAforo(cad);
                contador++;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null," ERROR EN LA BASE DE DATOS ");
            resp = null;
         }
        }
        return resp; 
    }
    
    public int cantidadAula(){
        int resp = 0;
        if(BaseDatos.conectar(bd, usuario, pass)){
            /*
            Hacemos la funcion SELECT de la base de datos 
            */
            sql = "SELECT IdAula,IdTutor,grado,seccion,nivel,aforo FROM aula";
            
            ResultSet resultado = BaseDatos.seleccionar(sql);
        try{
            while(resultado.next()){
                resp++;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null," ERROR EN LA BASE DE DATOS ");
            resp = -1;
         }
        }
        return resp;
    }
    
    public boolean actualizarAula(Aula aula){
        boolean respuesta = false;
        if(BaseDatos.conectar(bd, usuario, pass)){
            valores = "idTutor='"+aula.getTutor()+"',aforo='"+aula.getAforo()+"'";
            sql = "UPDATE aula SET "
                    +valores+" WHERE IdAula='"+aula.getCodigo()+"';";
            if(BaseDatos.ejecutar(sql)){
                    respuesta = true;  
            }
            BaseDatos.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
        return respuesta;
    }

}