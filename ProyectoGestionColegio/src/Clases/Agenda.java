/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

public class Agenda implements Serializable{
    private String enero[][] = new String [31][9];
    private String febrero[][] = new String [29][9] ;
    private String marzo[][] =  new String [31][9];
    private String abril[][] =  new String [30][9];
    private String mayo[][] = new String [31][9];
    private String junio[][] = new String [30][9];
    private String julio[][] = new String [31][9];
    private String agosto[][] = new String [31][9];
    private String setiembre[][] = new String [30][9];
    private String octubre[][]= new String [31][9];
    private String novienbre[][] = new String [30][9];
    private String diciembre[][] = new String [31][9];
    
    
    public String[] getEventos(int mes, int dia){
        String ev[] = new String[9];
        switch(mes){
            case 1:  ev=enero[dia];
                break;
            case 2:  ev=febrero[dia];
                break;    
            case 3:  ev=marzo[dia];
                break;
            case 4:  ev=abril[dia];
                break;
            case 5:  ev=mayo[dia];
                break;
            case 6:  ev=junio[dia];
                break;
            case 7:  ev=julio[dia];
                break;
            case 8:  ev=agosto[dia];
                break; 
            case 9:  ev=setiembre[dia];
                break;
            case 10:  ev=octubre[dia];
                break;
            case 11:  ev=novienbre[dia];
                break;
            case 12:  ev=diciembre[dia];
                break;          
        }
        
        return ev;
    }
    
    public void setEventos(int mes, int dia, String ev[]){
        switch(mes){
            case 1: enero[dia] = ev;
                break;
            case 2:  febrero[dia] = ev;
                break;    
            case 3:  marzo[dia]= ev;
                break;
            case 4:  abril[dia]= ev;
                break;
            case 5:  mayo[dia]= ev;
                break;
            case 6:  junio[dia]= ev;
                break;
            case 7:  julio[dia]= ev;
                break;
            case 8: agosto[dia]= ev;
                break; 
            case 9:  setiembre[dia]= ev;
                break;
            case 10:  octubre[dia]= ev;
                break;
            case 11:  novienbre[dia]= ev;
                break;
            case 12:  diciembre[dia]= ev;
                break;          
        }
        
        GestorArchivos.actualizaFicheroAgenda();
    }
}
