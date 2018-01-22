/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author DAW
 */
abstract public class Empleados {
    
    public static final double PLUS=300;
    
    private String nombre;
    private Fecha fechaNac;
    private double salario;
    private double plus;
    
    public Empleados(String nombre, Fecha fechaNac, double salario, double plus){
        this.nombre=nombre;
        this.fechaNac=fechaNac;
        this.salario=salario;
        this.plus=plus;
    }
    
    public String getNombre(){return this.nombre;}
    public Fecha getFechaNac(){return this.fechaNac;}
    public double getSalario(){return this.salario;}
    public double getPlus(){return this.plus;}
    
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setFechaNac(Fecha fechaNac){this.fechaNac=fechaNac;}
    public void setSalario(double salario){this.salario=salario;}
    public void setPlus(double plus){this.plus=plus;}
    
    
    
    public String toString(){
        String texto="";
        texto="\tNombre: "+this.nombre+"\n"+
                "\tFecha Nacimiento: "+this.fechaNac.corta()+"\n"+
                "\tSalario: "+this.salario+"\n"+
                "\tPlus salario: "+this.plus+"\n";
        return texto;
    }
    
    /*
     Nombre
 Fecha de Nacimiento
 Salario
 PLUS, que tendrá un valor de 300€.
    */
}
