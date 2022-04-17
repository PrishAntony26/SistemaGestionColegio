
package Clases;

import java.io.Serializable;
import java.util.Scanner;

public class Aula implements Serializable{
    private String codigo;
    private String grado;
    private String seccion;
    private String nivel;
    private String alumnos[];
    private String tutor;
    private Curso cursos[];
    private HorarioAula ha;
    private String aforo;
    
    public String getAforo(){
        return aforo;
    }
    
    public void setAforo(String aforo){
        this.aforo=aforo;
    }
    
    public void modificarHorarioA(String h,int fila, int colum){
        ha.modificarHorario(h, fila, colum);
    }
    
    public void modificarHorarioPDesp(String codP){
        ha.modificarHorarioPDesp(codP);
    }
    
    public Aula() {
        this.alumnos = new String[0];
        this.cursos = new Curso[0];
    }
    
    public int getCantidadAlumno() {
        return alumnos.length;
    }
    
    public String getCodigo() {
        return codigo;
    }
        
    public Curso[] getCursos() {
        return cursos;
    }
    
    public String[] nombreCursos() {
        String nombres[] = new String[cursos.length];
        for(int i=0;i<cursos.length;i++){
            nombres[i] = cursos[i].getNombre();
        }
        return nombres;
    }
    
    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNivel() {
        return nivel;
    }

     public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    
    
    public void setNivel(String nivel) {
        this.nivel = nivel;
        //Vamos a poner los cursos \ :v /
        if(this.nivel.equalsIgnoreCase("Inicial")){
            this.cursos=ICursos();
            this.ha=new HorarioAula(6);
        }else if(this.nivel.equalsIgnoreCase("Primaria")){
            this.cursos=PCursos();
            this.ha=new HorarioAula(7);
        }else if(this.nivel.equalsIgnoreCase("Secundaria")){
            this.cursos=SCursos();
            this.ha=new HorarioAula(8);
        }
    }
    
    public int numAlus(){
        return alumnos.length;
    }
    
    public static Curso[] ICursos(){
        Curso curs[]=new Curso[4];
        curs[0]=new Curso("C1","Matematica",8,5);
        curs[1]=new Curso("C2","Comunicacion",8,5);
        curs[2]=new Curso("C3","Ciencias",5,5);
        curs[3]=new Curso("C4","Personal Social",4,5);
        return curs;
    }
    
    public static Curso[] PCursos(){
        Curso[] curs=new Curso[8];
        curs[0]=new Curso("C1","Matematica",4,5);
        curs[1]=new Curso("C2","Comunicacion",4,5);
        curs[2]=new Curso("C3","Ciencias",4,5);
        curs[3]=new Curso("C4","Personal Social",4,5);
        curs[4]=new Curso("C5","Ingles",4,5);
        curs[5]=new Curso("C6","Religion",4,5);
        curs[6]=new Curso("C7","Arte",4,5);
        curs[7]=new Curso("C8","Educacion Fisica",2,5);
        return curs;
    }
    
    public static Curso[] SCursos(){
        Curso[] curs=new Curso[11];
        curs[0]=new Curso("C1","Matematica",4,5);
        curs[1]=new Curso("C2","Comunicacion",4,5);
        curs[2]=new Curso("C3","CTA",3,5);
        curs[3]=new Curso("C4","HGE",3,5);
        curs[4]=new Curso("C5","Ingles",3,5);
        curs[5]=new Curso("C6","Religion",3,5);
        curs[6]=new Curso("C7","Arte",3,5);
        curs[7]=new Curso("C8","Educacion Fisica",3,5);
        curs[8]=new Curso("C9","FCC",3,5);
        curs[9]=new Curso("C10","PFRH",3,5);
        curs[10]=new Curso("C11","EPT",3,5);
        return curs;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    
    //Añadir un alumno al aula (Para probar el programa)
    public void agregarAlumno(String alu){         
        int i;
        i=alumnos.length;
        redimensionar();
        alumnos[i]=alu;
        for(int j=0;j<cursos.length;j++){
            cursos[j].redimensionalTablaNotas();
        }
    }
    
    
    
    //Aumentar un espacio al arreglo (Para probar el programa)
    private void redimensionar(){
        int n=alumnos.length;
        n=n+1;
        String y[] =new String[n];
        for(int i=0;i<alumnos.length;i=i+1){
            y[i] = alumnos[i];
        }
        alumnos=y;
    }
    //Retirar alumno del aula
    public void retirarAlumno(String code){
        int t, pos;
        pos=Colegio.existeBuscarAlu(code);
        int posEnA = buscarIDAlumno(code);
        
        for(int j=0;j<cursos.length;j++){
            cursos[j].redimenMenosTablaNotas(posEnA);
        }        

        if(pos!=-1){
            Colegio.listaAlu[pos].setCodA("0");
            t = buscarIDAlumno(code);
            quitarlistaPos(t);
            redimensionarMenos();
        }else{
            System.out.println("Elemento no encontrado");
        }
    }
    //Buscamos el código del alumno y retornamos su posición
    public int buscarIDAlumno(String code){
        int flag;
        String codigo;
        flag=-1;
        if(alumnos.length>0){
            for(int i=0;i<alumnos.length;i=i+1){
                codigo = alumnos[i];
                if(codigo.equals(code)){
                   flag=i;
                }
            }
        }
        return flag;
    }
    
    public void eliminados(){
        int pos;
         for(int i=0;i<alumnos.length;i=i+1){
             pos=Colegio.existeBuscarAlu(alumnos[i]);
             Colegio.listaAlu[pos].setCodA("0");
         }
    }

    //Método para quitar un espacio al arreglo de ALUMNOS
    public void redimensionarMenos(){
        int n=alumnos.length;
        n=n-1;
        String y[] =new String[n];
        for(int i=0;i<alumnos.length-1;i=i+1){
            y[i]=alumnos[i];
        }
        alumnos=y;
    }
    
    //Método para quitar el elemento buscado al arreglo
    public void quitarlistaPos(int posi){
        int i;
        i=posi;
        if(posi>=0 && posi<alumnos.length){
            while(i<alumnos.length-1){
                alumnos[i]=alumnos[i+1];
                i=i+1;
            }
        }else{
            System.out.println("Dimensión o Posición fuera de Rango");
        }
    }
    
    @Override
    public String toString(){
        return grado+" "+seccion+" "+nivel;
    }
       
    public int existeBuscarCurso(String codigo){
        int i =0;
        int v = -1;
        String cod;
        while(i<cursos.length && v<0){
            cod = cursos[i].getCodigo();
            if(cod.equalsIgnoreCase(codigo))
                v = i;   
            i++;
        }
        return v;
    }

    public HorarioAula getHa() {
        return ha;
    }
    
    public void ingresarNotas(int notas[][], String nomCur){
        int n = cursos.length;
        for(int i=0; i<n; i++){
            if(nomCur.equals(cursos[i].getNombre())){
                cursos[i].setTablaNotas(notas);
            }
        }
    }
    
    public int[][] obtenerNotas(String nomCur){
        int n = cursos.length;
        int notas[][]=new int[alumnos.length][5];
        for(int i=0; i<n; i++){
            if(nomCur.equals(cursos[i].getNombre())){
                notas = cursos[i].getTablaNotas();
            }
        }
        return notas;
    }

    public int[][] obtenerNotasAlu(String code){
        int n = cursos.length;
        int posA = buscarIDAlumno(code);
        
        int notasAlu[][]=new int[n][5];
        
        for(int i=0; i<n; i++){
            notasAlu[i] = cursos[i].obtenerNotas(posA);
        }
        return notasAlu;
    }
    
   
    
}

