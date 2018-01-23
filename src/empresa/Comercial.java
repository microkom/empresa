
package empresa;

import java.util.Calendar;


public class Comercial extends Empleados{
    
    private double comision;
    
    public Comercial(String nombre, Fecha fechaNac, double salario, double plus, double comision){
        super(nombre, fechaNac, salario, plus);
        this.comision=comision;
    }
    public boolean mayorDe(int edad){
        Calendar cal = Calendar.getInstance();
        boolean mayorDe=true;
  
        int anyo= cal.get(Calendar.YEAR);
        int mes= cal.get(Calendar.MONTH)+1;
        int dia= cal.get(Calendar.DAY_OF_MONTH);
        
        //EL MES DEL SISTEMA ME DA -1 MES **************************************************
     
        if (anyo-super.getFechaNac().getAnyo()<edad) {
            mayorDe=false;
        }else if (anyo-super.getFechaNac().getAnyo()==edad && super.getFechaNac().getMes()<=mes && super.getFechaNac().getDia()<dia){
            mayorDe=false;
        }else{
            mayorDe=true;
        }
        return mayorDe;
    
    }
    
    //comprobacion para saber si se da la condicion para dar comision
    public boolean plus (){
        boolean ok=false;
        if ((mayorDe(30)==true) && (this.comision>200)) ok=true;
        return ok;
    }
    
    //agregar el plus a la comision del empleado
    public void addPlus(){
        if (plus())
        super.setPlus(PLUS+super.getPlus());
    }
    
    public String toString(){
        addPlus();
        String texto=super.toString();
        texto+="\tComisión: "+this.comision+"\n";
        return texto;
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