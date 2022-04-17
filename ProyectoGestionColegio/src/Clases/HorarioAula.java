//
package Clases;

import java.util.StringTokenizer;

public class HorarioAula implements Horario{
     private String hor[][];

    public HorarioAula(int horas){
        this.hor=new String[horas][5];
    }
    
    public HorarioAula(String[][] ha){
        this.hor=ha;
    }
    
    public String[][] getHor(){
        return hor;
    }
    
    public void setHor(String[][] hor){
        this.hor=hor;
    }
    
     @Override
    public void modificarHorario(String h,int fila, int colum){
        hor[fila][colum]=h;
    }
    
    //codP: Código del profesor despedido. 
    public void modificarHorarioPDesp(String codP){
        //Recorrer la matriz del horario, luego Recolectamos el código del profesor, si es igual, pasamos el null. 
        int fila=hor.length;
        //Longitud de primaria
        int colum=5;
        for(int i=0;i<fila;i++){
            for(int j=0;j<colum;j++){
                if(hor[i][j]!=null){
                    StringTokenizer tokens=new StringTokenizer(hor[i][j],"/");
                    int nDatos=tokens.countTokens();
                    String[] datos=new String[nDatos];
                    int k=0;
                    while(tokens.hasMoreTokens()){
                        datos[k]=tokens.nextToken();
                        k++;
                    }
                    if(datos[1].equalsIgnoreCase(codP)){
                        modificarHorario(null,i,j);
                    }
                }
            }
        }
    }
}

