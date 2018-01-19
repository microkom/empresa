
package empresa;


public class Comercial extends Empleados{
    
    private double comision;
    
    public Comercial(String nombre, Fecha fechaNac, double salario, double plus, double comision){
        super(nombre, fechaNac, salario, plus);
        this.comision=comision;
    }
    public String toString(){
        String texto=super.toString();
        texto+="\tComisión: "+this.comision;
        return texto;
    }
    
    public void plus (){
        if (super.getFechaNac())
    }
    /*
    Las clases tendrán un método llamado plus, que según en cada clase
tendrá una implementación distnta. Este plus básicamente aumenta el
salario del empleado.
 En comercial, si tiene más de 30 años y cobra una comisión de más
de 200 euros, se le aplicara el plus.
 En repartidor, si tiene menos de 25 y reparte en la zona “3”, este
recibirá el plus.
Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a
tu elección
    */
}
/*
El tpo comercial, además de los atributos anteriores, tene uno más
llamado comisión.
*/