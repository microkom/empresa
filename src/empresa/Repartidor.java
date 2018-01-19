/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

public class Repartidor extends Empleados {

    private String zona;

    public Repartidor(String nombre, Fecha fechaNac, double salario, double plus, String zona) {
        super(nombre, fechaNac, salario, plus);
        this.zona = zona;
    }
    
    public String getZona(){return this.zona;}
    public void setZona(String zona){this.zona=zona;}
    
    public String toString(){
        String texto=super.toString();
        texto+="\tZona: "+this.zona;
        return texto;
    }
    /*En el caso del tpo repartdor, además de los atributos de empleado, tene
otro llamado zona*/
}
