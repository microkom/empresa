/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Calendar;

public class Repartidor extends Empleados {

    private String zona;

    public Repartidor(String nombre, Fecha fechaNac, double salario, double plus, String zona) {
        super(nombre, fechaNac, salario, plus);
        this.zona = zona;
    }
    
    public String getZona(){return this.zona;}
    public void setZona(String zona){this.zona=zona;}
    
    
    public boolean menorDe(int edad){
        Calendar cal = Calendar.getInstance();
        boolean menorDe=false;
  
        int anyoSys= cal.get(Calendar.YEAR);
        int mesSys= cal.get(Calendar.MONTH)+1;
        int diaSys= cal.get(Calendar.DAY_OF_MONTH);
        //EL MES DEL SISTEMA ME DA -1 MES **************************************************
        if (anyoSys-super.getFechaNac().getAnyo()<=edad) {
            menorDe=true;
        }else if (anyoSys-super.getFechaNac().getAnyo()<=edad && mesSys<=super.getFechaNac().getMes()){
            menorDe=true;
        }else if (anyoSys-super.getFechaNac().getAnyo()<=edad && mesSys<=super.getFechaNac().getMes() && diaSys<=super.getFechaNac().getDia()){
            menorDe=true;
        }else{
            menorDe=false;
        }
        return menorDe;
    }
    public boolean plus (){
        boolean ok=false;
        if ((menorDe(25)==true) && (this.zona.equals("3"))) ok=true;
        return ok;
    }
    public void addPlus(){
        if (plus())
        super.setPlus(PLUS+super.getPlus());
    }
    public String toString(){
        addPlus();
        String texto=super.toString();
        texto+="\tZona: "+this.zona+"\n";
        return texto;
    }
    /*En el caso del tpo repartdor, además de los atributos de empleado, tene
otro llamado zona*/
}
