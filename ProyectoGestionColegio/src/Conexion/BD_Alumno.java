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
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
/**
 *
 * @author ok
 */
public class BD_Alumno {
    BD_Conexion BaseDatos = new BD_Conexion();
    private final String bd = "colegio";
    private final String usuario = "root";//Usuario
    private final String pass = "";//Contraseña 
    private String valores,sql;//Consulta a ejecutarse en la base de datos 
    private ResultSet ResultSet;//Transferir los datos de la tabla hacia un objeto
    
    
    public boolean ingresarAlumno(Alumno alumno){
        boolean respuesta = false;
        String fechaNac;
        if(BaseDatos.conectar(bd, usuario, pass)){
            fechaNac = alumno.getAnioNac()+"/"+alumno.getMesNac()+"/"+alumno.getDiaNac();
            valores = "'"+alumno.getCodigo()+"',null,'Cole01','"+alumno.getNombre()+"','"+alumno.getApellido()+"','"+alumno.getDni()+"','"+fechaNac+"','"+alumno.getDomicilio()+
                    "','"+alumno.getGenero()+"'";
            sql = "INSERT INTO alumno "
                    + "Values ("+valores+");";
            if(BaseDatos.ejecutar(sql)){
                     respuesta = true;
                     JOptionPane.showMessageDialog(null, "Se ha registrado al alumno correctamente");
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
            sql = "SELECT IdAlumno FROM alumno WHERE IdAlumno = '"+codigo+"'";
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
    
    public boolean actualizarAlumno(Alumno alumno){
        boolean respuesta = false;
        String fechaNac;
        if(BaseDatos.conectar(bd, usuario, pass)){
            fechaNac = alumno.getAnioNac()+"/"+alumno.getMesNac()+"/"+alumno.getDiaNac();
            valores = "nombre='"+alumno.getNombre()+"',apellido='"+alumno.getApellido()+"',dni='"+alumno.getDni()+"',fechaNac='"+fechaNac+"',domicilio='"+alumno.getDomicilio()+
                    "',genero='"+alumno.getGenero()+"'";
            sql = "UPDATE alumno "
                    + "SET "+valores+" WHERE IdAlumno='"+alumno.getCodigo()+"';";
            if(BaseDatos.ejecutar(sql)){
                respuesta = true;
                JOptionPane.showMessageDialog(null, "Se ha actualizado el alumno correctamente");
            }
            BaseDatos.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
        return respuesta;
    }
    
        public void eliminarAlumno(String codigo){
            if(BaseDatos.conectar(bd, usuario, pass)){
                sql = "DELETE from detallenotas WHERE IdAlumno = '"+codigo+"'";
                BaseDatos.ejecutar(sql);
                sql = "DELETE from alumno WHERE IdAlumno = '"+codigo+"'";
                BaseDatos.ejecutar(sql);
                BaseDatos.desconectar();
            }else{
                JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
            }
        }  
    
    public Alumno[] obtenerAlumnos(){
        int contador = 0;
        Alumno resp[] = new Alumno[100];
        String tok;
        if(BaseDatos.conectar(bd, usuario, pass)){
            /*
            Hacemos la funcion SELECT de la base de datos 
            */
            sql = "SELECT IdAlumno,IdAula,apellido,nombre,dni,genero,domicilio,fechaNac FROM alumno";
            
            ResultSet resultado = BaseDatos.seleccionar(sql);
            try{
                while(resultado.next()){
                    resp[contador] = new Alumno();
                    String cad = resultado.getString("IdAlumno");
                    resp[contador].setCodigo(cad);
                    cad =resultado.getString("IdAula");
                    resp[contador].setCodA(cad);
                    cad =resultado.getString("apellido");
                    resp[contador].setApellido(cad);
                    cad =resultado.getString("nombre");
                    resp[contador].setNombre(cad);
                    cad =resultado.getString("dni");
                    resp[contador].setDni(cad);
                    cad =resultado.getString("genero");
                    resp[contador].setGenero(cad);
                    cad =resultado.getString("domicilio");
                    resp[contador].setDomicilio(cad);
                    cad =resultado.getString("fechaNac");
                    StringTokenizer token = new StringTokenizer(cad, "-");
                    tok = token.nextToken();
                    resp[contador].setAnioNac(Integer.parseInt(tok));
                    tok = token.nextToken();
                    resp[contador].setMesNac(Integer.parseInt(tok));
                    tok = token.nextToken();
                    resp[contador].setDiaNac(Integer.parseInt(tok));
                    contador++;
                }
            }catch(SQLException e){
            JOptionPane.showMessageDialog(null," ERROR EN LA BASE DE DATOS ");
            resp = null;
         }
        }
        System.out.println("numero "+contador);
        return resp; 
    }
    
    public boolean actualizarAlumnoAula(Alumno alumno){
        boolean respuesta = false;
        if(BaseDatos.conectar(bd, usuario, pass)){
            valores = "IdAula='"+alumno.getCodA()+"'";
            sql = "UPDATE alumno "
                    + "SET "+valores+" WHERE IdAlumno='"+alumno.getCodigo()+"';";
            if(BaseDatos.ejecutar(sql)){
                respuesta = true;
                JOptionPane.showMessageDialog(null, "Se ha actualizado el alumno correctamente");
            }
            BaseDatos.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
        return respuesta;
    }  
    
}
