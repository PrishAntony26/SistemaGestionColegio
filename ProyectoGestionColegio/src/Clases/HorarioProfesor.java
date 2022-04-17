package Clases;

import java.util.StringTokenizer;

public class HorarioProfesor implements Horario{
    private String hor[][]=new String[8][5];

    public HorarioProfesor(){
        
    }
    
    @Override
    public void modificarHorario(String h,int fila, int colum){
        hor[fila][colum]=h;
    }
    
    public void modificarHorarioAuElim(String codA){
        //Aquí irá la lógica
        //Recorremos la matriz del horario del profesor, si coincide con el código del Aula, lo eliminamos poniendo null
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
                    if(datos[1].equalsIgnoreCase(codA)){
                        modificarHorario(null,i,j);
                    }
                }
            }
        }
    }
   
    public String[] aulasProf(){
        String codA = null;
        String aulasProf[] = new String[20];
        String auprof[];
        int a,m=0;
        int i,j;
        if(hor!=null){
            for(int k=0;k<Colegio.listaAula.length;k++){
                a=0;
                i=0;
                while(i<8 && a==0){
                    j=0;
                    while(j<5 && a==0){
                        if(hor[i][j]!=null){
                            codA = Colegio.listaAula[k].getCodigo();
                            if(codA.equals(codigoA(hor[i][j]))){
                                aulasProf[m] = codA;
                                m++;
                                a++;
                            }
                        }
                        j++;
                    }
                    i++;
                }
            }
            auprof = new String[m];
            for(int s=0;s<m;s++){
                auprof[s] = aulasProf[s];
            }
            
        }else{
            System.out.println("El profesor no registra un horario....!");
            auprof = new String[0];
            }
        return auprof;
    }
    
    public String codigoA(String cod){
        StringTokenizer tokens=new StringTokenizer(cod,"/");
        int nDatos=tokens.countTokens();
        String[] datos=new String[nDatos];
        int k=0;
        while(tokens.hasMoreTokens()){
            datos[k]=tokens.nextToken();
            k++;
        }
        return datos[1];
    }
    
    public String nomCurso(String cod, String codAula){
        StringTokenizer tokens=new StringTokenizer(cod,"/");
        int nDatos=tokens.countTokens();
        String[] datos=new String[nDatos];
        int k=0;
        while(tokens.hasMoreTokens()){
            datos[k]=tokens.nextToken();
            k++;
        }
        if(datos[1].equals(codAula))
            return datos[0];
        else
            return " ";
    }
    
    public String[] mostrarCursosAula(Curso[] curs,String codAula){
        //code es el código del aula
        String codC = null;
        String cursosProf[] = new String[20];
        String curprof[];
        int a,m=0;
        int i,j;
        if(hor!=null){
            for(int k=0;k<curs.length;k++){
                a=0;
                i=0;
                while(i<8 && a==0){
                    j=0;
                    while(j<5 && a==0){
                        if(hor[i][j]!=null){
                            codC = curs[k].getNombre();
                            if(codC.equals(nomCurso(hor[i][j],codAula))){
                                cursosProf[m] = codC;
                                m++;
                                a++;
                            }
                        }
                        j++;
                    }
                    i++;
                }
            }
            curprof = new String[m];
            for(int s=0;s<m;s++){
                curprof[s] = cursosProf[s];
            }
            
        }else{
            System.out.println("El profesor no registra un horario....!");
            curprof = new String[0];
            }
        return curprof;
    }
    
    public String[][] getHor(){
        return hor;
    }
    
}