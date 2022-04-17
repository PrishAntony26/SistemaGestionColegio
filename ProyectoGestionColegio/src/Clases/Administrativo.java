
package Clases;

public class Administrativo extends Persona {
    private String codigo;
    private String cargo;
    private String contra;
    
    public Administrativo(){
    }
    
    public Administrativo(String codigo, String nombre, String apellido, String cargo,  String contra){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.contra = contra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    public String toString(){
        return nombre + " " + apellido;
    }
}
