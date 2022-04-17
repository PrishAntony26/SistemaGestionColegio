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
public class BD_Profesor {
    BD_Conexion BaseDatos = new BD_Conexion();
    private final String bd = "colegio";
    private final String usuario = "root";//Usuario
    private final String pass = "";//Contraseña 
    private String valores,sql;//Consulta a ejecutarse en la base de datos 
    private ResultSet ResultSet;//Transferir los datos de la tabla hacia un objeto
    
    public boolean ingresarProfesor(Profesor profe){
        boolean respuesta = false;
        String fechaNac;
        if(BaseDatos.conectar(bd, usuario, pass)){
            fechaNac = profe.getAnioNac()+"/"+profe.getMesNac()+"/"+profe.getDiaNac();
            valores = "'"+profe.getCodigo()+"','Cole01','"+profe.getNombre()+"','"+profe.getApellido()+"','"+profe.getDni()+"','"+fechaNac+"','"+profe.getDomicilio()+
                    "','"+profe.getGenero()+"'";
            sql = "INSERT INTO profesor "
                    + "Values ("+valores+");";
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
            sql = "SELECT IdProfesor FROM profesor WHERE IdProfesor = '"+codigo+"'";
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
    
    public Profesor[] obtenerProfesores(){
        int numProfesor = cantidadProfes();
        Profesor resp[] = new Profesor[numProfesor];
        int contador = 0;
        if(BaseDatos.conectar(bd, usuario, pass)){
            /*
            Hacemos la funcion SELECT de la base de datos 
            */
            sql = "SELECT IdProfesor,apellido,nombre,dni,genero,domicilio,fechaNac FROM profesor";
            
            ResultSet resultado = BaseDatos.seleccionar(sql);
        try{
            while(resultado.next()){
                resp[contador] = new Profesor();
                String cad = resultado.getString("IdProfesor");
                resp[contador].setCodigo(cad);
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
                String[] fecha = cad.split("-");
                resp[contador].setDiaNac(Integer.valueOf(fecha[2]));
                resp[contador].setMesNac(Integer.valueOf(fecha[1]));
                resp[contador].setAnioNac(Integer.valueOf(fecha[0])); 
                contador++;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null," ERROR EN LA BASE DE DATOS ");
            resp = null;
         }
        }
        return resp; 
    }
    
    public void eliminarProfesor(String codigo){
        String fechaNac;
        if(BaseDatos.conectar(bd, usuario, pass)){
            sql = "DELETE from profesor WHERE IdProfesor = '"+codigo+"'";
            BaseDatos.ejecutar(sql);
            BaseDatos.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
    }
    
    public void actualizarProfesor(Profesor profe){
        if(BaseDatos.conectar(bd, usuario, pass)){
            sql = "UPDATE profesor SET IdColegio='COLE01',nombre='"+profe.getNombre()+"',apellido='"+profe.getApellido()+"',"
                  +"domicilio='"+profe.getDomicilio()+"',genero='"+profe.getGenero()+"',dni='"+profe.getDni()+"' WHERE "+" IdProfesor ='"+profe.getCodigo()+"';";
            BaseDatos.ejecutar(sql);
            BaseDatos.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
    }
    
    public int buscarPosicion(String codigo){
        Profesor[] aux = obtenerProfesores();
        String cad;
        for(int i=0;i<aux.length;i++){
            cad = aux[i].getCodigo();
            if(cad.equals(codigo)){
                 return i;
            }
        }
        return -1;
    }
    
    public int cantidadProfes(){
        int resp = 0;
        if(BaseDatos.conectar(bd, usuario, pass)){
            /*
            Hacemos la funcion SELECT de la base de datos 
            */
            sql = "SELECT IdProfesor,apellido,nombre,dni,genero,domicilio FROM profesor";
            
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
}
